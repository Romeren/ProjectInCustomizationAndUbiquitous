package org.xtext.sdu.iotvizualizerlanguage.generator

import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.AbstractGenerator
import org.eclipse.xtext.generator.IFileSystemAccess2
import org.eclipse.xtext.generator.IGeneratorContext
import org.xtext.sdu.formularzlanguage.formular.Expression
import org.xtext.sdu.formularzlanguage.formular.Factor
import org.xtext.sdu.formularzlanguage.formular.Formula
import org.xtext.sdu.iotvizualizerlanguage.vizualizer.Datasource
import org.xtext.sdu.iotvizualizerlanguage.vizualizer.EndPoint
import org.xtext.sdu.iotvizualizerlanguage.vizualizer.GetEndPoint
import org.xtext.sdu.iotvizualizerlanguage.vizualizer.PostEndPoint
import org.xtext.sdu.iotvizualizerlanguage.vizualizer.SchemaParser
import org.xtext.sdu.iotvizualizerlanguage.vizualizer.Selector
import org.xtext.sdu.iotvizualizerlanguage.vizualizer.Source
import org.xtext.sdu.formularzlanguage.formular.Variable
import org.xtext.sdu.formularzlanguage.formular.Number

class DataHandleGenerator extends AbstractGenerator {
	
	override doGenerate(Resource input, IFileSystemAccess2 fsa, IGeneratorContext context) {
		println("I MAKE FILES!")
		
		fsa.generateFile("DataHandle/Selectors/AbstractSelector.py", compileAbstractSelector);
		fsa.generateFile("DataHandle/SchemaParsers/AbstractSchemaParser.py", compileAbstractSchemaParser);
		fsa.generateFile("DataHandle/EndPoints/AbstractEndpoint.py",compileAbstractEndpoint);
		fsa.generateFile("DataHandle/Datasources/Controller.py", compileDatasourceController(input))
		
		for(p: input.allContents.toIterable.filter(EndPoint)) {
			fsa.generateFile("DataHandle/SchemaParsers/SchemaParser" + p.parser.name + ".py", p.parser.compileParser);
			for(s : p.parser.selectors){
				fsa.generateFile("DataHandle/Selectors/Selector" + s.name + ".py", s.compileSelector);
			}
			fsa.generateFile("DataHandle/EndPoints/EndPoint" + p.name + ".py", p.compile);
		}
	}
	
	// 
	def compileDatasourceController(Resource resource)
	'''
	import numpy as np
	«FOR endPoint : resource.allContents.toIterable.filter(EndPoint)»
	import DataHandle.EndPoints.EndPoint«endPoint.name»
	«ENDFOR»
	
	class DatasourceController():
		
		«FOR datasource : resource.allContents.toIterable.filter(Datasource)»
		def datasource_«datasource.name»(self):
			result = {}
			«FOR dimension : datasource.dimensions»
			«FOR selector : dimension.sourceSelectors»
			input_«selector.name» = np.array(«selector.source.getDimensionFromSource(selector.selectVar.name)»)
			«ENDFOR»
			input_«dimension.sourceSelectors.get(0).name»[1, ] = «dimension.name.getPythonFormula»
			result['dimension_«dimension.name.name»'] = input_«dimension.sourceSelectors.get(0).name»
			«ENDFOR»
			return result
			
			
		«ENDFOR»
	'''
	
	def getDimensionFromSource(Source source, String dimension) {
		if(source instanceof Datasource) {
			return '''datasource_«source.name»().get("dimension_«dimension»")'''
		} else if(source instanceof GetEndPoint) {
			return '''EndPoint«source.name».EndPoint«source.name»().getData()'''
		}
	}
	
	def getPythonFormula(Formula formula) {
		return formula.exp.leftResursiveTraversal("");
	}
	
	def dispatch String leftResursiveTraversal(Expression expression, String string) {
		var String result = expression.left.leftResursiveTraversal(string)
		if(expression.right != null) {
			result += expression.op
			result = expression.right.leftResursiveTraversal(result)
		}
		return result
	}
	
	def dispatch String leftResursiveTraversal(Factor factor, String string) {
		var String result = factor.left.leftResursiveTraversal(string)
		if(factor.right != null) {
			result += factor.op
			result = factor.right.leftResursiveTraversal(result)
		}
		return result
	}
	
	def dispatch String leftResursiveTraversal(Variable variable, String string) {
		return string + "input_" + variable.name + "[1, ]"
	}
	
	def dispatch String leftResursiveTraversal(Number number, String string) {
		return string + number.^val
	}
	
	def compileAbstractEndpoint()
	'''
	import requests
	import time
	import numpy as np
	
	class AbstractEndpoint():
		def fetchData(self, url):
			response = requests.get(url)
			return response
	
		def getJson(self, request):
			return request.json()
	
		def getText(self, request):
			return request.text
	
		def getJsonElement(self, json, selectorStep):
			return json[selectorStep]
			
		def getTextElement(self, text, selectorStep):
			return text
	
		def getElement(self, data, selector, type):
			for selc in selector.steps:
				if type == 'JSON':
					data = self.getJsonElement(data,selc)
				else:
					data = self.getTextElement(data,selc)
			return data
	
		def getData(self):
			if(not self.data):
				response = self.fetchData(self.url)
				if self.schemaParser.contentType is 'JSON':
					response = self.getJson(response)
				else: #TODO: HANDLE CSV AND XML
					response = self.getText() 
				#TODO: handle multiple selectors
				response = self.getElement(response, self.schemaParser.selectors[0], self.schemaParser.contentType)
				self.data = np.array(response)
			return self.data
	'''
	
	def compileAbstractSelector()
	'''
	class AbstractSelector():
		def __init__(self):
			self.steps = []
	'''
	
	def compileSelector(Selector select)
	'''
	from DataHandle.Selectors.AbstractSelector import AbstractSelector
	class Selector«select.name»(AbstractSelector):
		def __init__(self):
			self.steps = []
			«FOR step: select.steps»
			«step.appendStep()»
			«ENDFOR»
	'''
	def appendStep(String step){
		try{
			Integer.parseInt(step)
			return "self.steps.append("+step+")";
		} catch (NumberFormatException e) {  
	         return 'self.steps.append("'+step+'")';  
        }
	}
	
	def compileAbstractSchemaParser()
	'''
	class AbstractSchemaParser():
		def __init__(self):		
			self.selectors = []
	'''
	
	def compileParser(SchemaParser parser)
	'''
	from DataHandle.SchemaParsers.AbstractSchemaParser import AbstractSchemaParser 
	«FOR s : parser.selectors»
	from DataHandle.Selectors.Selector«s.name» import Selector«s.name»
	«ENDFOR»
	
	class SchemaParser«parser.name»(AbstractSchemaParser):
		def __init__(self):
			self.selectors = []
			«FOR select : parser.selectors»
			self.selectors.append(Selector«select.name»())		
			«ENDFOR»
			self.contentType = «parser.schemaType»
	'''
	
	def dispatch compile(GetEndPoint endpoint)
	'''
	from DataHandle.EndPoints.AbstractEndpoint import AbstractEndpoint
	import DataHandle.SchemaParsers.SchemaParser«endpoint.parser.name»  as s
	
	class EndPoint«endpoint.name»(AbstractEndpoint):
		def __init__(self):
			self.schemaParser = s.SchemaParser«endpoint.parser.name»()
			self.url = "«endpoint.url»"
			self.data = None
	'''
	
	def dispatch compile(PostEndPoint endpoint)
	'''
	'''
}