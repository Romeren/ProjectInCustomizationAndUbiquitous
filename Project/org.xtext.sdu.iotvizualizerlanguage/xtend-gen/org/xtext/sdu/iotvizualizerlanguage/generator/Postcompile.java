package org.xtext.sdu.iotvizualizerlanguage.generator;

import com.google.common.collect.Iterables;
import java.util.List;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.generator.IFileSystemAccess2;
import org.eclipse.xtext.generator.IGeneratorContext;
import org.eclipse.xtext.xbase.lib.IteratorExtensions;
import org.xtext.sdu.iotvizualizerlanguage.vizualizer.Datasource;
import org.xtext.sdu.iotvizualizerlanguage.vizualizer.Graph;
import org.xtext.sdu.iotvizualizerlanguage.vizualizer.Page;

@SuppressWarnings("all")
public class Postcompile {
  public void doGenerate(final Resource input, final IFileSystemAccess2 fsa, final IGeneratorContext context, final List<String> pageNames) {
    CharSequence _compileViews = this.compileViews(input);
    fsa.generateFile(
      "pages/views.py", _compileViews);
    CharSequence _compileUrls = this.compileUrls(pageNames);
    fsa.generateFile(
      "pages/urls.py", _compileUrls);
  }
  
  public CharSequence compileViews(final Resource input) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("from django.shortcuts import render");
    _builder.newLine();
    _builder.append("from django.http import HttpResponse");
    _builder.newLine();
    _builder.append("from django.template import loader");
    _builder.newLine();
    _builder.append("from django.template import Context");
    _builder.newLine();
    _builder.append("from DataHandle.Datasources.Controller import DatasourceController");
    _builder.newLine();
    _builder.newLine();
    _builder.append("import json");
    _builder.newLine();
    _builder.append("import numpy as np");
    _builder.newLine();
    _builder.append("class NumpyToJson(json.JSONEncoder):");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("def default(self, obj):");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("if isinstance(obj, np.ndarray):");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("return obj.tolist()");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("return json.JSONEncoder.default(self, obj)");
    _builder.newLine();
    _builder.newLine();
    _builder.append("converter = NumpyToJson()");
    _builder.newLine();
    _builder.newLine();
    {
      TreeIterator<EObject> _allContents = input.getAllContents();
      Iterable<EObject> _iterable = IteratorExtensions.<EObject>toIterable(_allContents);
      Iterable<Page> _filter = Iterables.<Page>filter(_iterable, Page.class);
      for(final Page page : _filter) {
        _builder.append("def ");
        String _name = page.getName();
        _builder.append(_name, "");
        _builder.append("(request):");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.append("template = loader.get_template(\'");
        String _name_1 = page.getName();
        _builder.append(_name_1, "\t");
        _builder.append(".html\');");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("contentMap = {}");
        _builder.newLine();
        {
          TreeIterator<EObject> _eAllContents = page.eAllContents();
          Iterable<EObject> _iterable_1 = IteratorExtensions.<EObject>toIterable(_eAllContents);
          Iterable<Graph> _filter_1 = Iterables.<Graph>filter(_iterable_1, Graph.class);
          for(final Graph graph : _filter_1) {
            _builder.append("\t");
            _builder.append("contentMap[\'graph_data_");
            String _name_2 = graph.getName();
            _builder.append(_name_2, "\t");
            _builder.append("\'] = {key : converter.default(value) for key, value in DatasourceController().datasource_");
            Datasource _source = graph.getSource();
            String _name_3 = _source.getName();
            _builder.append(_name_3, "\t");
            _builder.append("().items()}");
            _builder.newLineIfNotEmpty();
          }
        }
        _builder.newLine();
        _builder.append("\t");
        _builder.append("context = Context(contentMap)");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("return HttpResponse(template.render(context))");
        _builder.newLine();
        _builder.newLine();
      }
    }
    _builder.newLine();
    return _builder;
  }
  
  /**
   * def compileUrls(List<String> pageNames)
   * '''
   * """webserver URL Configuration
   * 
   * The `urlpatterns` list routes URLs to views. For more information please see:
   * https://docs.djangoproject.com/en/1.9/topics/http/urls/
   * Examples:
   * Function views
   * 1. Add an import:  from my_app import views
   * 2. Add a URL to urlpatterns:  url(r'^$', views.home, name='home')
   * Class-based views
   * 1. Add an import:  from other_app.views import Home
   * 2. Add a URL to urlpatterns:  url(r'^$', Home.as_view(), name='home')
   * Including another URLconf
   * 1. Import the include() function: from django.conf.urls import url, include
   * 2. Add a URL to urlpatterns:  url(r'^blog/', include('blog.urls'))
   * """
   * from django.conf.urls import url
   * from django.contrib import admin
   * 
   * urlpatterns = [
   * url(r'^admin/', admin.site.urls),
   * «FOR f:pageNames»
   * «f.compile»
   * «ENDFOR»
   * ]
   * '''
   */
  public CharSequence compileUrls(final List<String> pageNames) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("from django.conf.urls import url");
    _builder.newLine();
    _builder.newLine();
    _builder.append("from . import views");
    _builder.newLine();
    _builder.newLine();
    _builder.append("urlpatterns = [");
    _builder.newLine();
    {
      for(final String f : pageNames) {
        CharSequence _compile = this.compile(f);
        _builder.append(_compile, "");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("]");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence compile(final String pageName) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("url(r\'^");
    _builder.append(pageName, "");
    _builder.append("\', views.");
    _builder.append(pageName, "");
    _builder.append(", name=\'");
    _builder.append(pageName, "");
    _builder.append("\'),");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
}
