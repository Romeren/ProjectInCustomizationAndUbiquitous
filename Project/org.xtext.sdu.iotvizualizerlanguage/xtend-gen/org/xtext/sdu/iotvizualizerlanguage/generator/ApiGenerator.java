package org.xtext.sdu.iotvizualizerlanguage.generator;

import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.generator.AbstractGenerator;
import org.eclipse.xtext.generator.IFileSystemAccess2;
import org.eclipse.xtext.generator.IGeneratorContext;

@SuppressWarnings("all")
public class ApiGenerator extends AbstractGenerator {
  @Override
  public void doGenerate(final Resource input, final IFileSystemAccess2 fsa, final IGeneratorContext context) {
    CharSequence _compileUrls = this.compileUrls();
    fsa.generateFile("api/urls.py", _compileUrls);
    CharSequence _compileViews = this.compileViews();
    fsa.generateFile("api/views.py", _compileViews);
    CharSequence _compileModel = this.compileModel();
    fsa.generateFile("api/model.py", _compileModel);
    CharSequence _compileSerializers = this.compileSerializers();
    fsa.generateFile("api/serializers.py", _compileSerializers);
  }
  
  public CharSequence compileSerializers() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("from rest_framework import serializers");
    _builder.newLine();
    _builder.append("from api.model import api");
    _builder.newLine();
    _builder.append("from django.contrib.auth.models import User");
    _builder.newLine();
    _builder.newLine();
    _builder.newLine();
    _builder.append("class UserSerializer(serializers.HyperlinkedModelSerializer):");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("class Meta:");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("model = User");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("fields = (\'url\', \'username\', \'email\', \'is_staff\')");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence compileModel() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("from django.db import models");
    _builder.newLine();
    _builder.newLine();
    _builder.append("class api(models.Model):");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("created = models.DateTimeField(auto_now_add=True)");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("title = models.CharField(max_length=100, blank=True, default=\'\')");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("code = models.TextField()");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("linenos = models.BooleanField(default=False)");
    _builder.newLine();
    _builder.newLine();
    _builder.append("    ");
    _builder.append("class Meta:");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("ordering = (\'created\',)");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence compileViews() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("from django.shortcuts import render");
    _builder.newLine();
    _builder.append("from django.http import HttpResponse");
    _builder.newLine();
    _builder.append("from django.template import loader");
    _builder.newLine();
    _builder.append("from django.template import Context");
    _builder.newLine();
    _builder.append("#API");
    _builder.newLine();
    _builder.append("from rest_framework import viewsets");
    _builder.newLine();
    _builder.append("from django.contrib.auth.models import User");
    _builder.newLine();
    _builder.append("from api.serializers import UserSerializer");
    _builder.newLine();
    _builder.newLine();
    _builder.append("class UserViewSet(viewsets.ReadOnlyModelViewSet):");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("\"\"\"");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("This endpoint presents the users in the system.");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("As you can see, the collection of snippet instances owned by a user are");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("serialized using a hyperlinked representation.");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("\"\"\"");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("queryset = User.objects.all()");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("serializer_class = UserSerializer");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence compileUrls() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("from django.conf.urls import include,url");
    _builder.newLine();
    _builder.newLine();
    _builder.append("from django.contrib.auth.models import User");
    _builder.newLine();
    _builder.append("from rest_framework import routers, serializers, viewsets");
    _builder.newLine();
    _builder.newLine();
    _builder.append("# Routers provide an easy way of automatically determining the URL conf.");
    _builder.newLine();
    _builder.append("router = routers.DefaultRouter()");
    _builder.newLine();
    _builder.append("router.register(r\'users\', UserViewSet)");
    _builder.newLine();
    _builder.newLine();
    _builder.append("urlpatterns = [");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("url(r\'^api/\', include(router.urls)),");
    _builder.newLine();
    _builder.append("]");
    _builder.newLine();
    return _builder;
  }
}
