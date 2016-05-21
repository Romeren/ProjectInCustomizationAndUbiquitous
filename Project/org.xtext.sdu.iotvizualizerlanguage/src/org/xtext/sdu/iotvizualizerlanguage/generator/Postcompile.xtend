package org.xtext.sdu.iotvizualizerlanguage.generator

import java.util.List
import org.eclipse.xtext.generator.IFileSystemAccess2
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.IGeneratorContext
import org.xtext.sdu.iotvizualizerlanguage.vizualizer.Page
import org.xtext.sdu.iotvizualizerlanguage.vizualizer.Graph

class Postcompile{
	
	def doGenerate(Resource input, IFileSystemAccess2 fsa, IGeneratorContext context, List<String> pageNames) {


		fsa.generateFile(
			"pages\\views.py",
			compileViews(input)
		)
		
		fsa.generateFile(
//			"webserver\\urls.py",
			"pages\\urls.py",
			compileUrls(pageNames)
		)	
	}
	
	
	def compileViews(Resource input)
	'''
	from django.shortcuts import render
	from django.http import HttpResponse
	from django.template import loader
	from django.template import Context
	from DataHandle.Datasources.controller import DatasourceController
	«FOR page : input.allContents.toIterable.filter(Page)»
	def «page.name»(request):
		template = loader.get_template('«page.name».html');
		
		contentMap = {}
		«FOR graph : page.eAllContents.toIterable.filter(Graph)»
		contentMap['graph_data_«graph.name»'] = DatasourceController().datasource_«graph.source.name»()
		«ENDFOR»
	
		context = Context(contentMap)
		return HttpResponse(template.render(context))
	
	«ENDFOR»
	
	'''
	/*	
	def compileUrls(List<String> pageNames)
	'''
	"""webserver URL Configuration
	
	The `urlpatterns` list routes URLs to views. For more information please see:
	    https://docs.djangoproject.com/en/1.9/topics/http/urls/
	Examples:
	Function views
	    1. Add an import:  from my_app import views
	    2. Add a URL to urlpatterns:  url(r'^$', views.home, name='home')
	Class-based views
	    1. Add an import:  from other_app.views import Home
	    2. Add a URL to urlpatterns:  url(r'^$', Home.as_view(), name='home')
	Including another URLconf
	    1. Import the include() function: from django.conf.urls import url, include
	    2. Add a URL to urlpatterns:  url(r'^blog/', include('blog.urls'))
	"""
	from django.conf.urls import url
	from django.contrib import admin
	
	urlpatterns = [
	    url(r'^admin/', admin.site.urls),
		«FOR f:pageNames»
			«f.compile»
		«ENDFOR»
	]
	'''
	*/

	def compileUrls(List<String> pageNames)
	'''
	from django.conf.urls import url
	
	from . import views
	
	urlpatterns = [
	    «FOR f:pageNames»
		«f.compile»
	    «ENDFOR»
	]
	'''
	
	def compile(String pageName)
	'''
	   url(r'^«pageName»', views.«pageName», name='«pageName»'),
	'''
	

	
}