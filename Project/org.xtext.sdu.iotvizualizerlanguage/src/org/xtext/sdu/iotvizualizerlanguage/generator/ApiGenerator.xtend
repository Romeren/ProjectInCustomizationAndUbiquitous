package org.xtext.sdu.iotvizualizerlanguage.generator

import org.eclipse.xtext.generator.AbstractGenerator
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.IFileSystemAccess2
import org.eclipse.xtext.generator.IGeneratorContext

class ApiGenerator extends AbstractGenerator {
	
	
	override doGenerate(Resource input, IFileSystemAccess2 fsa, IGeneratorContext context) {
		fsa.generateFile("api/urls.py",compileUrls);
		fsa.generateFile("api/views.py", compileViews);
		fsa.generateFile("api/model.py", compileModel);
		fsa.generateFile("api/serializers.py",compileSerializers);
	}
	
	def compileSerializers()
	'''
	from rest_framework import serializers
	from api.model import api
	from django.contrib.auth.models import User
	
	
	class UserSerializer(serializers.HyperlinkedModelSerializer):
	    class Meta:
	        model = User
			fields = ('url', 'username', 'email', 'is_staff')
	'''
	
	def compileModel()
	'''
	from django.db import models
	
	class api(models.Model):
	    created = models.DateTimeField(auto_now_add=True)
	    title = models.CharField(max_length=100, blank=True, default='')
	    code = models.TextField()
	    linenos = models.BooleanField(default=False)
	
	    class Meta:
	        ordering = ('created',)
	'''
	
	def compileViews()
	'''
	from django.shortcuts import render
	from django.http import HttpResponse
	from django.template import loader
	from django.template import Context
	#API
	from rest_framework import viewsets
	from django.contrib.auth.models import User
	from api.serializers import UserSerializer
	
	class UserViewSet(viewsets.ReadOnlyModelViewSet):
	    """
	    This endpoint presents the users in the system.
	    As you can see, the collection of snippet instances owned by a user are
	    serialized using a hyperlinked representation.
	    """
	    queryset = User.objects.all()
	    serializer_class = UserSerializer
	'''
	
	def compileUrls()
	'''
	from django.conf.urls import include,url
	
	from django.contrib.auth.models import User
	from rest_framework import routers, serializers, viewsets
	
	# Routers provide an easy way of automatically determining the URL conf.
	router = routers.DefaultRouter()
	router.register(r'users', UserViewSet)
	
	urlpatterns = [
		url(r'^api/', include(router.urls)),
	]
	'''
	
}