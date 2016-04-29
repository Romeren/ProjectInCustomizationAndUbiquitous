package org.xtext.sdu.iotvizualizerlanguage.generator;

import java.util.List;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.generator.IFileSystemAccess2;

@SuppressWarnings("all")
public class Postcompile {
  public void postcompile(final IFileSystemAccess2 fsa, final List<String> pageNames) {
    CharSequence _compileViews = this.compileViews(pageNames);
    fsa.generateFile(
      "pages\\views.py", _compileViews);
    CharSequence _compileUrls = this.compileUrls(pageNames);
    fsa.generateFile(
      "pages\\urls.py", _compileUrls);
  }
  
  public CharSequence compileViews(final List<String> pageNames) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("from django.shortcuts import render");
    _builder.newLine();
    _builder.append("from django.http import HttpResponse");
    _builder.newLine();
    _builder.append("from django.template import loader");
    _builder.newLine();
    _builder.append("from django.template import Context");
    _builder.newLine();
    _builder.newLine();
    {
      for(final String f : pageNames) {
        _builder.append("def ");
        _builder.append(f, "");
        _builder.append("(request):");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.append("template = loader.get_template(\'");
        _builder.append(f, "\t");
        _builder.append(".html\');");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("with open(\'templates/data.csv\') as f:");
        _builder.newLine();
        _builder.append("\t\t");
        _builder.append("content = f.readlines()");
        _builder.newLine();
        _builder.newLine();
        _builder.append("\t");
        _builder.append("context = Context({\'graph_data\' : content})");
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
