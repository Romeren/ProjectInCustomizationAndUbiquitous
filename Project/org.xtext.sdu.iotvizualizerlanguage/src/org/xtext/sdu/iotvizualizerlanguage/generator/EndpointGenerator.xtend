package org.xtext.sdu.iotvizualizerlanguage.generator

import org.eclipse.xtext.generator.AbstractGenerator
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.IFileSystemAccess2
import org.eclipse.xtext.generator.IGeneratorContext
import org.xtext.sdu.iotvizualizerlanguage.vizualizer.EndPoint
import org.xtext.sdu.iotvizualizerlanguage.vizualizer.GetEndPoint
import org.xtext.sdu.iotvizualizerlanguage.vizualizer.PostEndPoint
import org.xtext.sdu.iotvizualizerlanguage.vizualizer.Selector
import org.xtext.sdu.iotvizualizerlanguage.vizualizer.SchemaParser

class EndpointGenerator extends AbstractGenerator {
	
	override doGenerate(Resource input, IFileSystemAccess2 fsa, IGeneratorContext context) {
		fsa.generateFile("DataHandle/Selectors/AbstractSelector", compileAbstractSelector);
		fsa.generateFile("DataHandle/SchemaParsers/AbstractSchemaParser", compileAbstractSchemaParser);
		fsa.generateFile("DataHandle/EndPoints/AbstractEndpoint",compileAbstractEndpoint);
		
		
		for(p: input.allContents.toIterable.filter(EndPoint)) {
			fsa.generateFile("DataHandle/SchemaParsers/SchemaParser"+p.parser.name, p.compile);
			for(s : p.parser.selectors){
				fsa.generateFile("DataHandle/Selectors/Selector" + s.name, s.compile);
			}
			fsa.generateFile("DataHandle/EndPoints/EndPoint" + p.name, p.compile);
		}
	}
	
	def compileAbstractEndpoint()
	'''
	import requests
	import time
	
	class AbstractEndpoint():
		def fetchData(self, url):
			response = requests.get(url)
			return response
	
		def getJson(self, request):
			return request.json()
	
		def getText(self, request):
			return request.text
	
		def getJsonElement(self, jSon, selectorStep):
			return jSon[selectorStep]
	
		def getElement(self, data, selector):
			for selc in selector.steps:
				data = self.getJsonElement(data,selc)
			return data
	
		def getData(self):
			if(not self.data):
				response = self.fetchData(self.url)
				response = self.getJson(response)
				#TODO: handle multiple selectors
				response = self.getElement(response, self.schemaParser.selectors[0])
				self.data = response
			return self.data
	'''
	
	def compileAbstractSelector()
	'''
	class AbstractSelector():
		def __init__(self):
			self.steps = []
	'''
	
	def compile(Selector select)
	'''
	from DataHandle.Selectors.AbstractSelector import AbstractSelector
	class Selector«select.name»(AbstractSelector»):
		def __init__(self):
			self.steps = []
			«FOR step: select.steps»
			self.steps.append(«step»)
			«ENDFOR»
	'''
	
	def compileAbstractSchemaParser()
	'''
	class AbstractSchemaParser():
		def __init__(self):		
			self.selectors = []
	'''
	
	def compile(SchemaParser parser)
	'''
	from DataHendle.Schemaparsers.AbstractSchemaParser import AbstractSchemaParser 
	«FOR s : parser.selectors»
	from DataHendle.Selectors.Selector«s.name» import Selector«s.name»
	«ENDFOR»
	
	class SchemaParser«parser.name»(AbstractSchemaParser):
		def __init__(self):
			self.selectors = []
			«FOR select : parser.selectors»
			self.selectors.append(Selector«select.name»)		
			«ENDFOR»
	'''
	
	def dispatch compile(GetEndPoint endpoint)
	'''
	from DataHandle.Endpoints.AbstractEndpoint import AbstractEndpoint
	from DataHandle.SchemaParsers.«endpoint.parser.name» import SchemaParser«endpoint.parser.name»
	
	class EndPoint«endpoint.name»(AbstractEndpoint):
		def __init__(self):
			self.schemaParser = «endpoint.parser.name»
			self.url = "«endpoint.url»"
			self.data = None
	'''
	
	def dispatch compile(PostEndPoint endpoint)
	'''
	'''
}