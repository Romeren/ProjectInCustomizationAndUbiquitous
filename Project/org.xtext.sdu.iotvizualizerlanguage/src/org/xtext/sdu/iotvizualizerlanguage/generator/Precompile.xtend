package org.xtext.sdu.iotvizualizerlanguage.generator

import org.eclipse.xtext.generator.IFileSystemAccess2
import org.eclipse.emf.ecore.resource.Resource

class Precompile {
	def precompile(Resource resource, IFileSystemAccess2 fsa) {
		var SourceTaskResolver taskResolver = new SourceTaskResolver(resource)
		
		fsa.generateFile("manage.py", compileManager)
		fsa.generateFile("webserver/settings.py", compileSettings(taskResolver))
		fsa.generateFile("webserver/__init__.py", compileInit)
		fsa.generateFile("webserver/wsgi.py", compileWsgi)
		fsa.generateFile("webserver/urls.py", compileUrls)
		fsa.generateFile("webserver/celery.py", compileCeleryTasks(taskResolver))
		fsa.generateFile("webserver/models.py", compileModels)
		fsa.generateFile("templates/base.html", compileBaseHtml);
		fsa.generateFile("templates/navigationbar.html",compileNavigationBar);
		fsa.generateFile("templates/data.csv",compileTestdata);
	}
	
	def compileManager()
	'''
	#!/usr/bin/env python
	import os
	import sys
	
	if __name__ == "__main__":
	    os.environ.setdefault("DJANGO_SETTINGS_MODULE", "webserver.settings")
	
	    from django.core.management import execute_from_command_line
	
	    execute_from_command_line(sys.argv)
	'''
	
	def compileSettings(SourceTaskResolver resolver)
	'''
	"""
	Django settings for webserver project.
	
	Generated by 'django-admin startproject' using Django 1.9.4.
	
	For more information on this file, see
	https://docs.djangoproject.com/en/1.9/topics/settings/
	
	For the full list of settings and their values, see
	https://docs.djangoproject.com/en/1.9/ref/settings/
	"""
	
	import os
	
	# Build paths inside the project like this: os.path.join(BASE_DIR, ...)
	BASE_DIR = os.path.dirname(os.path.dirname(os.path.abspath(__file__)))
	
	
	# Quick-start development settings - unsuitable for production
	# See https://docs.djangoproject.com/en/1.9/howto/deployment/checklist/
	
	# SECURITY WARNING: keep the secret key used in production secret!
	SECRET_KEY = 'o_a&t5askcjj66@%ru2s%wjic2_xcy)n&78=tt@hl%3#)!6usk'
	
	# SECURITY WARNING: don't run with debug turned on in production!
	DEBUG = True
	
	ALLOWED_HOSTS = []
	
	
	# Application definition
	
	INSTALLED_APPS = [
	    'django.contrib.admin',
	    'django.contrib.auth',
	    'django.contrib.contenttypes',
	    'django.contrib.sessions',
	    'django.contrib.messages',
	    'django.contrib.staticfiles',
	    'rest_framework',
	    'api',
	    'djcelery',
	]
	
	MIDDLEWARE_CLASSES = [
	    'django.middleware.security.SecurityMiddleware',
	    'django.contrib.sessions.middleware.SessionMiddleware',
	    'django.middleware.common.CommonMiddleware',
	    'django.middleware.csrf.CsrfViewMiddleware',
	    'django.contrib.auth.middleware.AuthenticationMiddleware',
	    'django.contrib.auth.middleware.SessionAuthenticationMiddleware',
	    'django.contrib.messages.middleware.MessageMiddleware',
	    'django.middleware.clickjacking.XFrameOptionsMiddleware',
	]
	
	ROOT_URLCONF = 'webserver.urls'
	
	TEMPLATES = [
	    {
	        'BACKEND': 'django.template.backends.django.DjangoTemplates',
	        'DIRS': ['templates/'],
	        'APP_DIRS': True,
	        'OPTIONS': {
	            'context_processors': [
	                'django.template.context_processors.debug',
	                'django.template.context_processors.request',
	                'django.contrib.auth.context_processors.auth',
	                'django.contrib.messages.context_processors.messages',
	            ],
	        },
	    },
	]
	
	WSGI_APPLICATION = 'webserver.wsgi.application'
	
	
	# Database
	# https://docs.djangoproject.com/en/1.9/ref/settings/#databases
	
	DATABASES = {
	    'default': {
	        'ENGINE': 'django.db.backends.sqlite3',
	        'NAME': os.path.join(BASE_DIR, 'db.sqlite3'),
	    }
	}
	
	
	# Password validation
	# https://docs.djangoproject.com/en/1.9/ref/settings/#auth-password-validators
	
	AUTH_PASSWORD_VALIDATORS = [
	    {
	        'NAME': 'django.contrib.auth.password_validation.UserAttributeSimilarityValidator',
	    },
	    {
	        'NAME': 'django.contrib.auth.password_validation.MinimumLengthValidator',
	    },
	    {
	        'NAME': 'django.contrib.auth.password_validation.CommonPasswordValidator',
	    },
	    {
	        'NAME': 'django.contrib.auth.password_validation.NumericPasswordValidator',
	    },
	]
	
	# Rest Api framework:
	REST_FRAMEWORK = {
	    # Use Django's standard `django.contrib.auth` permissions,
	    # or allow read-only access for unauthenticated users.
	    'DEFAULT_PERMISSION_CLASSES': [
	        'rest_framework.permissions.DjangoModelPermissionsOrAnonReadOnly'
	    ]
	#    'DEFAULT_AUTHENTICATION_CLASSES': [],
	#    'DEFAULT_PERMISSION_CLASSES': [],
	}
	
	
	# Internationalization
	# https://docs.djangoproject.com/en/1.9/topics/i18n/
	
	LANGUAGE_CODE = 'en-us'
	
	TIME_ZONE = 'UTC'
	
	USE_I18N = True
	
	USE_L10N = True
	
	USE_TZ = True
	
	
	# Static files (CSS, JavaScript, Images)
	# https://docs.djangoproject.com/en/1.9/howto/static-files/
	
	STATIC_URL = '/static/'
	STATIC_ROOT = os.path.join(BASE_DIR, 'static')
	'''
	
	/**
	 * TODO Add Celery Background Tasks here
	 */
	def fetchURITasks() {
		return ""
	}
	
	def compileInit()
	''''''
	
	def compileWsgi()
	'''
	"""
	WSGI config for webserver project.
	
	It exposes the WSGI callable as a module-level variable named ``application``.
	
	For more information on this file, see
	https://docs.djangoproject.com/en/1.9/howto/deployment/wsgi/
	"""
	
	import os
	
	from django.core.wsgi import get_wsgi_application
	
	os.environ.setdefault("DJANGO_SETTINGS_MODULE", "webserver.settings")
	
	application = get_wsgi_application()
	'''
	
	def compileUrls()
	'''
	"""example URL Configuration
	
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
	from django.conf.urls import include, url
	from django.contrib import admin
	
	urlpatterns = [
	    url(r'^', include('pages.urls')),
	    url(r'^admin/', admin.site.urls),
	    url(r'^',include('api.urls')),
	#    url(r'^api-auth/', include('rest_framework.urls', namespace='rest_framework')) #AND here
	]
	'''
	
	def compileCeleryTasks(SourceTaskResolver resolver)
	'''
	from __future__ import absolute_import
	
	import os
	
	from celery import Celery
	
	# Set the default Django settings module for the celery app
	os.environ.setdefault('DJANGO_SETTINGS_MODULE', 'webserver.settings')
	
	from django.conf import settings
	
	app = Celery('webserver')
	
	# Using a string here means the worker will not have to
	# prickle the object when using windows
	app.config_from_object('django.conf:settings')
	app.autodiscover_tasks(lambda: settings.INSTALLED_APPS)
	
	# List Size �resolver.schedules.size�
	uri_list = {
		�FOR entry: resolver.schedules�
			�entry�
		�ENDFOR�
	}
	import datatime
	import celery
	
	@celery.decorators.periodic_task(run_every=datetime.timedelta(minutes=5))
	def fetchFromUrl(): 
		print("Running Task")
		
	'''
	
	def compileModels()
	'''
	from django.db import models
	
	class Datasource(models.Model):
		name = models.CharField(max_length=50)
		
	'''
	
	def compileBaseHtml()
	'''
	<!DOCTYPE html>
	<html>
	<head>
		<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.0/jquery.min.js"></script>
		<script src="https://ajax.googleapis.com/ajax/libs/jquery/2.2.0/jquery.min.js"></script>
		<link rel="stylesheet" type="text/css" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css">
		<link rel="stylesheet" type="text/css" href="https://cdn.rawgit.com/olton/Metro-UI-CSS/master/build/css/metro.min.css">
		<link rel="stylesheet" type="text/css" href="https://cdn.rawgit.com/olton/Metro-UI-CSS/master/build/css/metro-responsive.min.css">
		<link rel="stylesheet" type="text/css" href="https://cdn.rawgit.com/olton/Metro-UI-CSS/master/build/css/metro-schemes.min.css">
		<link rel="stylesheet" type="text/css" href="https://cdn.rawgit.com/olton/Metro-UI-CSS/master/build/css/metro-rtl.min.css">
		<link rel="stylesheet" type="text/css" href="https://cdn.rawgit.com/olton/Metro-UI-CSS/master/build/css/metro-icons.min.css">
		<script src="https://cdn.rawgit.com/olton/Metro-UI-CSS/master/build/js/metro.min.js"></script>
		<script src="https://d3js.org/d3.v3.min.js" charset="utf-8"></script>
		{% load static %}
		<link rel="stylesheet" href="{% static 'css/style.css' %}">
		<script type="text/javascript" src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js"></script>
		<title>Informatics</title>
	</head>
	<body class="tile-area-scheme-dark">
	<style>
		.tile-area {
			overflow-y: auto ;
		}
	</style>
	{% include "navigationbar.html"%}
	{% block content %}
	{% endblock %}
	</body>
	</html>
	'''
	
	def compileNavigationBar()
	'''
	{% block content %}
	{% endblock %}
	'''/*<nav class="navbar navbar-inverse">
	  <div class="container-fluid">
	    <!-- Brand and toggle get grouped for better mobile display -->
	    <div class="navbar-header">
	      <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1" aria-expanded="false">
	        <span class="sr-only">Toggle navigation</span>
	        <span class="icon-bar"></span>
	        <span class="icon-bar"></span>
	        <span class="icon-bar"></span>
	      </button>
	      <a class="navbar-brand" href="#">Informatics</a>
	    </div>
	
	    <!-- Collect the nav links, forms, and other content for toggling -->
	    <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
	      <ul class="nav navbar-nav">
	        <li class="active"><a href="#">Link <span class="sr-only">(current)</span></a></li>
	        <li><a href="#">Link</a></li>
	        <li class="dropdown">
	          <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false">Dropdown <span class="caret"></span></a>
	          <ul class="dropdown-menu">
	            <li><a href="#">Action</a></li>
	            <li><a href="#">Another action</a></li>
	            <li><a href="#">Something else here</a></li>
	            <li role="separator" class="divider"></li>
	            <li><a href="#">Separated link</a></li>
	            <li role="separator" class="divider"></li>
	            <li><a href="#">One more separated link</a></li>
	          </ul>
	        </li>
	      </ul>
	      <form class="navbar-form navbar-left" role="search">
	        <div class="form-group">
	          <input type="text" class="form-control" placeholder="Search">
	        </div>
	        <button type="submit" class="btn btn-default">Submit</button>
	      </form>
	      <ul class="nav navbar-nav navbar-right">
	        <li><a href="#">Link</a></li>
	        <li class="dropdown">
	          <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false">Dropdown <span class="caret"></span></a>
	          <ul class="dropdown-menu">
	            <li><a href="#">Action</a></li>
	            <li><a href="#">Another action</a></li>
	            <li><a href="#">Something else here</a></li>
	            <li role="separator" class="divider"></li>
	            <li><a href="#">Separated link</a></li>
	          </ul>
	        </li>
	      </ul>
	    </div><!-- /.navbar-collapse -->
	  </div><!-- /.container-fluid -->
	</nav>
	*/
	
	def compileTestdata()
	'''
	date,close
	1-May-12,582.13
	30-Apr-12,583.98
	27-Apr-12,603.00
	26-Apr-12,607.70
	25-Apr-12,610.00
	24-Apr-12,560.28
	23-Apr-12,571.70
	20-Apr-12,572.98
	19-Apr-12,587.44
	18-Apr-12,608.34
	17-Apr-12,609.70
	16-Apr-12,580.13
	13-Apr-12,605.23
	12-Apr-12,622.77
	11-Apr-12,626.20
	10-Apr-12,628.44
	9-Apr-12,636.23
	5-Apr-12,633.68
	4-Apr-12,624.31
	3-Apr-12,629.32
	2-Apr-12,618.63
	30-Mar-12,599.55
	29-Mar-12,609.86
	28-Mar-12,617.62
	27-Mar-12,614.48
	26-Mar-12,606.98
	23-Mar-12,596.05
	22-Mar-12,599.34
	21-Mar-12,602.50
	20-Mar-12,605.96
	19-Mar-12,601.10
	16-Mar-12,585.57
	15-Mar-12,585.56
	14-Mar-12,589.58
	13-Mar-12,568.10
	12-Mar-12,552.00
	9-Mar-12,545.17
	8-Mar-12,541.99
	7-Mar-12,530.69
	6-Mar-12,530.26
	5-Mar-12,533.16
	2-Mar-12,545.18
	1-Mar-12,544.47
	29-Feb-12,542.44
	28-Feb-12,535.41
	27-Feb-12,525.76
	24-Feb-12,522.41
	23-Feb-12,516.39
	22-Feb-12,513.04
	21-Feb-12,514.85
	17-Feb-12,502.12
	16-Feb-12,502.21
	15-Feb-12,497.67
	14-Feb-12,509.46
	13-Feb-12,502.60
	10-Feb-12,493.42
	9-Feb-12,493.17
	8-Feb-12,476.68
	7-Feb-12,468.83
	6-Feb-12,463.97
	3-Feb-12,459.68
	2-Feb-12,455.12
	1-Feb-12,456.19
	31-Jan-12,456.48
	30-Jan-12,453.01
	27-Jan-12,447.28
	26-Jan-12,444.63
	25-Jan-12,446.66
	24-Jan-12,420.41
	23-Jan-12,427.41
	20-Jan-12,420.30
	19-Jan-12,427.75
	18-Jan-12,429.11
	17-Jan-12,424.70
	13-Jan-12,419.81
	12-Jan-12,421.39
	11-Jan-12,422.55
	10-Jan-12,423.24
	9-Jan-12,421.73
	6-Jan-12,422.40
	5-Jan-12,418.03
	4-Jan-12,413.44
	3-Jan-12,411.23
	30-Dec-11,405.00
	29-Dec-11,405.12
	28-Dec-11,402.64
	27-Dec-11,406.53
	23-Dec-11,403.43
	22-Dec-11,398.55
	21-Dec-11,396.44
	20-Dec-11,395.95
	19-Dec-11,382.21
	16-Dec-11,381.02
	15-Dec-11,378.94
	14-Dec-11,380.19
	13-Dec-11,388.81
	12-Dec-11,391.84
	9-Dec-11,393.62
	8-Dec-11,390.66
	7-Dec-11,389.09
	6-Dec-11,390.95
	5-Dec-11,393.01
	2-Dec-11,389.70
	1-Dec-11,387.93
	30-Nov-11,382.20
	29-Nov-11,373.20
	28-Nov-11,376.12
	25-Nov-11,363.57
	23-Nov-11,366.99
	22-Nov-11,376.51
	21-Nov-11,369.01
	18-Nov-11,374.94
	17-Nov-11,377.41
	16-Nov-11,384.77
	15-Nov-11,388.83
	14-Nov-11,379.26
	11-Nov-11,384.62
	10-Nov-11,385.22
	9-Nov-11,395.28
	8-Nov-11,406.23
	7-Nov-11,399.73
	4-Nov-11,400.24
	3-Nov-11,403.07
	2-Nov-11,397.41
	1-Nov-11,396.51
	31-Oct-11,404.78
	28-Oct-11,404.95
	27-Oct-11,404.69
	26-Oct-11,400.60
	25-Oct-11,397.77
	24-Oct-11,405.77
	21-Oct-11,392.87
	20-Oct-11,395.31
	19-Oct-11,398.62
	18-Oct-11,422.24
	17-Oct-11,419.99
	14-Oct-11,422.00
	13-Oct-11,408.43
	12-Oct-11,402.19
	11-Oct-11,400.29
	10-Oct-11,388.81
	7-Oct-11,369.80
	6-Oct-11,377.37
	5-Oct-11,378.25
	4-Oct-11,372.50
	3-Oct-11,374.60
	30-Sep-11,381.32
	29-Sep-11,390.57
	28-Sep-11,397.01
	27-Sep-11,399.26
	26-Sep-11,403.17
	23-Sep-11,404.30
	22-Sep-11,401.82
	21-Sep-11,412.14
	20-Sep-11,413.45
	19-Sep-11,411.63
	16-Sep-11,400.50
	15-Sep-11,392.96
	14-Sep-11,389.30
	13-Sep-11,384.62
	12-Sep-11,379.94
	9-Sep-11,377.48
	8-Sep-11,384.14
	7-Sep-11,383.93
	6-Sep-11,379.74
	2-Sep-11,374.05
	1-Sep-11,381.03
	31-Aug-11,384.83
	30-Aug-11,389.99
	29-Aug-11,389.97
	26-Aug-11,383.58
	25-Aug-11,373.72
	24-Aug-11,376.18
	23-Aug-11,373.60
	22-Aug-11,356.44
	19-Aug-11,356.03
	18-Aug-11,366.05
	17-Aug-11,380.44
	16-Aug-11,380.48
	15-Aug-11,383.41
	12-Aug-11,376.99
	11-Aug-11,373.70
	10-Aug-11,363.69
	9-Aug-11,374.01
	8-Aug-11,353.21
	5-Aug-11,373.62
	4-Aug-11,377.37
	3-Aug-11,392.57
	2-Aug-11,388.91
	1-Aug-11,396.75
	29-Jul-11,390.48
	28-Jul-11,391.82
	27-Jul-11,392.59
	26-Jul-11,403.41
	25-Jul-11,398.50
	22-Jul-11,393.30
	21-Jul-11,387.29
	20-Jul-11,386.90
	19-Jul-11,376.85
	18-Jul-11,373.80
	15-Jul-11,364.92
	14-Jul-11,357.77
	13-Jul-11,358.02
	12-Jul-11,353.75
	11-Jul-11,354.00
	8-Jul-11,359.71
	7-Jul-11,357.20
	6-Jul-11,351.76
	5-Jul-11,349.43
	1-Jul-11,343.26
	30-Jun-11,335.67
	29-Jun-11,334.04
	28-Jun-11,335.26
	27-Jun-11,332.04
	24-Jun-11,326.35
	23-Jun-11,331.23
	22-Jun-11,322.61
	21-Jun-11,325.30
	20-Jun-11,315.32
	17-Jun-11,320.26
	16-Jun-11,325.16
	15-Jun-11,326.75
	14-Jun-11,332.44
	13-Jun-11,326.60
	10-Jun-11,325.90
	9-Jun-11,331.49
	8-Jun-11,332.24
	7-Jun-11,332.04
	6-Jun-11,338.04
	3-Jun-11,343.44
	2-Jun-11,346.10
	1-Jun-11,345.51
	31-May-11,347.83
	27-May-11,337.41
	26-May-11,335.00
	25-May-11,336.78
	24-May-11,332.19
	23-May-11,334.40
	20-May-11,335.22
	19-May-11,340.53
	18-May-11,339.87
	17-May-11,336.14
	16-May-11,333.30
	13-May-11,340.50
	12-May-11,346.57
	11-May-11,347.23
	10-May-11,349.45
	9-May-11,347.60
	6-May-11,346.66
	5-May-11,346.75
	4-May-11,349.57
	3-May-11,348.20
	2-May-11,346.28
	29-Apr-11,350.13
	28-Apr-11,346.75
	27-Apr-11,350.15
	26-Apr-11,350.42
	25-Apr-11,353.01
	21-Apr-11,350.70
	20-Apr-11,342.41
	19-Apr-11,337.86
	18-Apr-11,331.85
	15-Apr-11,327.46
	14-Apr-11,332.42
	13-Apr-11,336.13
	12-Apr-11,332.40
	11-Apr-11,330.80
	8-Apr-11,335.06
	7-Apr-11,338.08
	6-Apr-11,338.04
	5-Apr-11,338.89
	4-Apr-11,341.19
	1-Apr-11,344.56
	31-Mar-11,348.51
	30-Mar-11,348.63
	29-Mar-11,350.96
	28-Mar-11,350.44
	25-Mar-11,351.54
	24-Mar-11,344.97
	23-Mar-11,339.19
	22-Mar-11,341.20
	21-Mar-11,339.30
	18-Mar-11,330.67
	17-Mar-11,334.64
	16-Mar-11,330.01
	15-Mar-11,345.43
	14-Mar-11,353.56
	11-Mar-11,351.99
	10-Mar-11,346.67
	9-Mar-11,352.47
	8-Mar-11,355.76
	7-Mar-11,355.36
	4-Mar-11,360.00
	3-Mar-11,359.56
	2-Mar-11,352.12
	1-Mar-11,349.31
	28-Feb-11,353.21
	25-Feb-11,348.16
	24-Feb-11,342.88
	23-Feb-11,342.62
	22-Feb-11,338.61
	18-Feb-11,350.56
	17-Feb-11,358.30
	16-Feb-11,363.13
	15-Feb-11,359.90
	14-Feb-11,359.18
	11-Feb-11,356.85
	10-Feb-11,354.54
	9-Feb-11,358.16
	8-Feb-11,355.20
	7-Feb-11,351.88
	4-Feb-11,346.50
	3-Feb-11,343.44
	2-Feb-11,344.32
	1-Feb-11,345.03
	31-Jan-11,339.32
	28-Jan-11,336.10
	27-Jan-11,343.21
	26-Jan-11,343.85
	25-Jan-11,341.40
	24-Jan-11,337.45
	21-Jan-11,326.72
	20-Jan-11,332.68
	19-Jan-11,338.84
	18-Jan-11,340.65
	14-Jan-11,348.48
	13-Jan-11,345.68
	12-Jan-11,344.42
	11-Jan-11,341.64
	10-Jan-11,342.46
	7-Jan-11,336.12
	6-Jan-11,333.73
	5-Jan-11,334.00
	4-Jan-11,331.29
	3-Jan-11,329.57
	31-Dec-10,322.56
	30-Dec-10,323.66
	29-Dec-10,325.29
	28-Dec-10,325.47
	27-Dec-10,324.68
	23-Dec-10,323.60
	22-Dec-10,325.16
	21-Dec-10,324.20
	20-Dec-10,322.21
	17-Dec-10,320.61
	16-Dec-10,321.25
	15-Dec-10,320.36
	14-Dec-10,320.29
	13-Dec-10,321.67
	10-Dec-10,320.56
	9-Dec-10,319.76
	8-Dec-10,321.01
	7-Dec-10,318.21
	6-Dec-10,320.15
	3-Dec-10,317.44
	2-Dec-10,318.15
	1-Dec-10,316.40
	30-Nov-10,311.15
	29-Nov-10,316.87
	26-Nov-10,315.00
	24-Nov-10,314.80
	23-Nov-10,308.73
	22-Nov-10,313.36
	19-Nov-10,306.73
	18-Nov-10,308.43
	17-Nov-10,300.50
	16-Nov-10,301.59
	15-Nov-10,307.04
	12-Nov-10,308.03
	11-Nov-10,316.66
	10-Nov-10,318.03
	9-Nov-10,316.08
	8-Nov-10,318.62
	5-Nov-10,317.13
	4-Nov-10,318.27
	3-Nov-10,312.80
	2-Nov-10,309.36
	1-Nov-10,304.18
	29-Oct-10,300.98
	28-Oct-10,305.24
	27-Oct-10,307.83
	26-Oct-10,308.05
	25-Oct-10,308.84
	22-Oct-10,307.47
	21-Oct-10,309.52
	20-Oct-10,310.53
	19-Oct-10,309.49
	18-Oct-10,318.00
	15-Oct-10,314.74
	14-Oct-10,302.31
	13-Oct-10,300.14
	12-Oct-10,298.54
	11-Oct-10,295.36
	8-Oct-10,294.07
	7-Oct-10,289.22
	6-Oct-10,289.19
	5-Oct-10,288.94
	4-Oct-10,278.64
	1-Oct-10,282.52
	30-Sep-10,283.75
	29-Sep-10,287.37
	28-Sep-10,286.86
	27-Sep-10,291.16
	24-Sep-10,292.32
	23-Sep-10,288.92
	22-Sep-10,287.75
	21-Sep-10,283.77
	20-Sep-10,283.23
	17-Sep-10,275.37
	16-Sep-10,276.57
	15-Sep-10,270.22
	14-Sep-10,268.06
	13-Sep-10,267.04
	10-Sep-10,263.41
	9-Sep-10,263.07
	8-Sep-10,262.92
	7-Sep-10,257.81
	6-Sep-10,258.77
	3-Sep-10,258.77
	2-Sep-10,252.17
	1-Sep-10,250.33
	31-Aug-10,243.10
	30-Aug-10,242.50
	27-Aug-10,241.62
	26-Aug-10,240.28
	25-Aug-10,242.89
	24-Aug-10,239.93
	23-Aug-10,245.80
	20-Aug-10,249.64
	19-Aug-10,249.88
	18-Aug-10,253.07
	17-Aug-10,251.97
	16-Aug-10,247.64
	13-Aug-10,249.10
	12-Aug-10,251.79
	11-Aug-10,250.19
	10-Aug-10,259.41
	9-Aug-10,261.75
	6-Aug-10,260.09
	5-Aug-10,261.70
	4-Aug-10,262.98
	3-Aug-10,261.93
	2-Aug-10,261.85
	30-Jul-10,257.25
	29-Jul-10,258.11
	28-Jul-10,260.96
	27-Jul-10,264.08
	26-Jul-10,259.28
	23-Jul-10,259.94
	22-Jul-10,259.02
	21-Jul-10,254.24
	20-Jul-10,251.89
	19-Jul-10,245.58
	16-Jul-10,249.90
	15-Jul-10,251.45
	14-Jul-10,252.73
	13-Jul-10,251.80
	12-Jul-10,257.28
	9-Jul-10,259.62
	8-Jul-10,258.09
	7-Jul-10,258.66
	6-Jul-10,248.63
	5-Jul-10,246.94
	2-Jul-10,246.94
	1-Jul-10,248.48
	30-Jun-10,251.53
	29-Jun-10,256.17
	28-Jun-10,268.30
	25-Jun-10,266.70
	24-Jun-10,269.00
	23-Jun-10,270.97
	22-Jun-10,273.85
	21-Jun-10,270.17
	18-Jun-10,274.07
	17-Jun-10,271.87
	16-Jun-10,267.25
	15-Jun-10,259.69
	14-Jun-10,254.28
	11-Jun-10,253.51
	10-Jun-10,250.51
	9-Jun-10,243.20
	8-Jun-10,249.33
	7-Jun-10,250.94
	4-Jun-10,255.96
	3-Jun-10,263.12
	2-Jun-10,263.95
	1-Jun-10,260.83
	31-May-10,256.88
	28-May-10,256.88
	27-May-10,253.35
	26-May-10,244.11
	25-May-10,245.22
	24-May-10,246.76
	21-May-10,242.32
	20-May-10,237.76
	19-May-10,248.34
	18-May-10,252.36
	17-May-10,254.22
	14-May-10,253.82
	13-May-10,258.36
	12-May-10,262.09
	11-May-10,256.52
	10-May-10,253.99
	7-May-10,235.86
	6-May-10,246.25
	5-May-10,255.98
	4-May-10,258.68
	3-May-10,266.35
	30-Apr-10,261.09
	29-Apr-10,268.64
	28-Apr-10,261.60
	27-Apr-10,262.04
	26-Apr-10,269.50
	23-Apr-10,270.83
	22-Apr-10,266.47
	21-Apr-10,259.22
	20-Apr-10,244.59
	19-Apr-10,247.07
	16-Apr-10,247.40
	15-Apr-10,248.92
	14-Apr-10,245.69
	13-Apr-10,242.43
	12-Apr-10,242.29
	9-Apr-10,241.79
	8-Apr-10,239.95
	7-Apr-10,240.60
	6-Apr-10,239.54
	5-Apr-10,238.49
	2-Apr-10,235.97
	1-Apr-10,235.97
	31-Mar-10,235.00
	30-Mar-10,235.84
	29-Mar-10,232.39
	26-Mar-10,230.90
	25-Mar-10,226.65
	24-Mar-10,229.37
	23-Mar-10,228.36
	22-Mar-10,224.75
	19-Mar-10,222.25
	18-Mar-10,224.65
	17-Mar-10,224.12
	16-Mar-10,224.45
	15-Mar-10,223.84
	12-Mar-10,226.60
	11-Mar-10,225.50
	10-Mar-10,224.84
	9-Mar-10,223.02
	8-Mar-10,219.08
	5-Mar-10,218.95
	4-Mar-10,210.71
	3-Mar-10,209.33
	2-Mar-10,208.85
	1-Mar-10,208.99
	26-Feb-10,204.62
	25-Feb-10,202.00
	24-Feb-10,200.66
	23-Feb-10,197.06
	22-Feb-10,200.42
	19-Feb-10,201.67
	18-Feb-10,202.93
	17-Feb-10,202.55
	16-Feb-10,203.40
	15-Feb-10,200.38
	12-Feb-10,200.38
	11-Feb-10,198.67
	10-Feb-10,195.12
	9-Feb-10,196.19
	8-Feb-10,194.12
	5-Feb-10,195.46
	4-Feb-10,192.05
	3-Feb-10,199.23
	2-Feb-10,195.86
	1-Feb-10,194.73
	29-Jan-10,192.06
	28-Jan-10,199.29
	27-Jan-10,207.88
	26-Jan-10,205.94
	25-Jan-10,203.08
	22-Jan-10,197.75
	21-Jan-10,208.07
	20-Jan-10,211.72
	19-Jan-10,215.04
	18-Jan-10,205.93
	15-Jan-10,205.93
	14-Jan-10,209.43
	13-Jan-10,210.65
	12-Jan-10,207.72
	11-Jan-10,210.11
	8-Jan-10,211.98
	7-Jan-10,210.58
	6-Jan-10,210.97
	5-Jan-10,214.38
	4-Jan-10,214.01
	1-Jan-10,210.73
	31-Dec-09,210.73
	30-Dec-09,211.64
	29-Dec-09,209.10
	28-Dec-09,211.61
	25-Dec-09,209.04
	24-Dec-09,209.04
	23-Dec-09,202.10
	22-Dec-09,200.36
	21-Dec-09,198.23
	18-Dec-09,195.43
	17-Dec-09,191.86
	16-Dec-09,195.03
	15-Dec-09,194.17
	14-Dec-09,196.98
	11-Dec-09,194.67
	10-Dec-09,196.43
	9-Dec-09,197.80
	8-Dec-09,189.87
	7-Dec-09,188.95
	4-Dec-09,193.32
	3-Dec-09,196.48
	2-Dec-09,196.23
	1-Dec-09,196.97
	30-Nov-09,199.91
	27-Nov-09,200.59
	26-Nov-09,204.19
	25-Nov-09,204.19
	24-Nov-09,204.44
	23-Nov-09,205.88
	20-Nov-09,199.92
	19-Nov-09,200.51
	18-Nov-09,205.96
	17-Nov-09,207.00
	16-Nov-09,206.63
	13-Nov-09,204.45
	12-Nov-09,201.99
	11-Nov-09,203.25
	10-Nov-09,202.98
	9-Nov-09,201.46
	6-Nov-09,194.34
	5-Nov-09,194.03
	4-Nov-09,190.81
	3-Nov-09,188.75
	2-Nov-09,189.31
	30-Oct-09,188.50
	29-Oct-09,196.35
	28-Oct-09,192.40
	27-Oct-09,197.37
	26-Oct-09,202.48
	23-Oct-09,203.94
	22-Oct-09,205.20
	21-Oct-09,204.92
	20-Oct-09,198.76
	19-Oct-09,189.86
	16-Oct-09,188.05
	15-Oct-09,190.56
	14-Oct-09,191.29
	13-Oct-09,190.02
	12-Oct-09,190.81
	9-Oct-09,190.47
	8-Oct-09,189.27
	7-Oct-09,190.25
	6-Oct-09,190.01
	5-Oct-09,186.02
	2-Oct-09,184.90
	1-Oct-09,180.86
	30-Sep-09,185.35
	29-Sep-09,185.38
	28-Sep-09,186.15
	25-Sep-09,182.37
	24-Sep-09,183.82
	23-Sep-09,185.50
	22-Sep-09,184.48
	21-Sep-09,184.02
	18-Sep-09,185.02
	17-Sep-09,184.55
	16-Sep-09,181.87
	15-Sep-09,175.16
	14-Sep-09,173.72
	11-Sep-09,172.16
	10-Sep-09,172.56
	9-Sep-09,171.14
	8-Sep-09,172.93
	4-Sep-09,170.31
	3-Sep-09,166.55
	2-Sep-09,165.18
	1-Sep-09,165.30
	31-Aug-09,168.21
	28-Aug-09,170.05
	27-Aug-09,169.45
	26-Aug-09,167.41
	25-Aug-09,169.40
	24-Aug-09,169.06
	21-Aug-09,169.22
	20-Aug-09,166.33
	19-Aug-09,164.60
	18-Aug-09,164.00
	17-Aug-09,159.59
	14-Aug-09,166.78
	13-Aug-09,168.42
	12-Aug-09,165.31
	10-Aug-09,164.72
	7-Aug-09,165.51
	6-Aug-09,163.91
	5-Aug-09,165.11
	4-Aug-09,165.55
	3-Aug-09,166.43
	31-Jul-09,163.39
	30-Jul-09,162.79
	29-Jul-09,160.03
	28-Jul-09,160.00
	27-Jul-09,160.10
	24-Jul-09,159.99
	23-Jul-09,157.82
	22-Jul-09,156.74
	21-Jul-09,151.51
	20-Jul-09,152.91
	17-Jul-09,151.75
	16-Jul-09,147.52
	15-Jul-09,146.88
	14-Jul-09,142.27
	13-Jul-09,142.34
	10-Jul-09,138.52
	9-Jul-09,136.36
	8-Jul-09,137.22
	7-Jul-09,135.40
	6-Jul-09,138.61
	3-Jul-09,140.02
	2-Jul-09,140.02
	1-Jul-09,142.83
	30-Jun-09,142.43
	29-Jun-09,141.97
	26-Jun-09,142.44
	25-Jun-09,139.86
	24-Jun-09,136.22
	23-Jun-09,134.01
	22-Jun-09,137.37
	19-Jun-09,139.48
	18-Jun-09,135.88
	17-Jun-09,135.58
	16-Jun-09,136.35
	15-Jun-09,136.09
	12-Jun-09,136.97
	11-Jun-09,139.95
	10-Jun-09,140.25
	9-Jun-09,142.72
	8-Jun-09,143.85
	5-Jun-09,144.67
	4-Jun-09,143.74
	3-Jun-09,140.95
	2-Jun-09,139.49
	1-Jun-09,139.35
	29-May-09,135.81
	28-May-09,135.07
	27-May-09,133.05
	26-May-09,130.78
	22-May-09,122.50
	21-May-09,124.18
	20-May-09,125.87
	19-May-09,127.45
	18-May-09,126.65
	15-May-09,122.42
	14-May-09,122.95
	13-May-09,119.49
	12-May-09,124.42
	11-May-09,129.57
	8-May-09,129.19
	7-May-09,129.06
	6-May-09,132.50
	5-May-09,132.71
	4-May-09,132.07
	1-May-09,127.24
	30-Apr-09,125.83
	29-Apr-09,125.14
	28-Apr-09,123.90
	27-Apr-09,124.73
	24-Apr-09,123.90
	23-Apr-09,125.40
	22-Apr-09,121.51
	21-Apr-09,121.76
	20-Apr-09,120.50
	17-Apr-09,123.42
	16-Apr-09,121.45
	15-Apr-09,117.64
	14-Apr-09,118.31
	13-Apr-09,120.22
	10-Apr-09,119.57
	9-Apr-09,119.57
	8-Apr-09,116.32
	7-Apr-09,115.00
	6-Apr-09,118.45
	3-Apr-09,115.99
	2-Apr-09,112.71
	1-Apr-09,108.69
	31-Mar-09,105.12
	30-Mar-09,104.49
	27-Mar-09,106.85
	26-Mar-09,109.87
	25-Mar-09,106.49
	24-Mar-09,106.50
	23-Mar-09,107.66
	20-Mar-09,101.59
	19-Mar-09,101.62
	18-Mar-09,101.52
	17-Mar-09,99.66
	16-Mar-09,95.42
	13-Mar-09,95.93
	12-Mar-09,96.35
	11-Mar-09,92.68
	10-Mar-09,88.63
	9-Mar-09,83.11
	6-Mar-09,85.30
	5-Mar-09,88.84
	4-Mar-09,91.17
	3-Mar-09,88.37
	2-Mar-09,87.94
	27-Feb-09,89.31
	26-Feb-09,89.19
	25-Feb-09,91.16
	24-Feb-09,90.25
	23-Feb-09,86.95
	20-Feb-09,91.20
	19-Feb-09,90.64
	18-Feb-09,94.37
	17-Feb-09,94.53
	13-Feb-09,99.16
	12-Feb-09,99.27
	11-Feb-09,96.82
	10-Feb-09,97.83
	9-Feb-09,102.51
	6-Feb-09,99.72
	5-Feb-09,96.46
	4-Feb-09,93.55
	3-Feb-09,92.98
	2-Feb-09,91.51
	30-Jan-09,90.13
	29-Jan-09,93.00
	28-Jan-09,94.20
	27-Jan-09,90.73
	26-Jan-09,89.64
	23-Jan-09,88.36
	22-Jan-09,88.36
	21-Jan-09,82.83
	20-Jan-09,78.20
	16-Jan-09,82.33
	15-Jan-09,83.38
	14-Jan-09,85.33
	13-Jan-09,87.71
	12-Jan-09,88.66
	9-Jan-09,90.58
	8-Jan-09,92.70
	7-Jan-09,91.01
	6-Jan-09,93.02
	5-Jan-09,94.58
	2-Jan-09,90.75
	1-Jan-09,85.35
	31-Dec-08,85.35
	30-Dec-08,86.29
	29-Dec-08,86.61
	26-Dec-08,85.81
	25-Dec-08,85.04
	24-Dec-08,85.04
	23-Dec-08,86.38
	22-Dec-08,85.74
	19-Dec-08,90.00
	18-Dec-08,89.43
	17-Dec-08,89.16
	16-Dec-08,95.43
	15-Dec-08,94.75
	12-Dec-08,98.27
	11-Dec-08,95.00
	10-Dec-08,98.21
	9-Dec-08,100.06
	8-Dec-08,99.72
	5-Dec-08,94.00
	4-Dec-08,91.41
	3-Dec-08,95.90
	2-Dec-08,92.47
	1-Dec-08,88.93
	28-Nov-08,92.67
	27-Nov-08,95.00
	26-Nov-08,95.00
	25-Nov-08,90.80
	24-Nov-08,92.95
	21-Nov-08,82.58
	20-Nov-08,80.49
	19-Nov-08,86.29
	18-Nov-08,89.91
	17-Nov-08,88.14
	14-Nov-08,90.24
	13-Nov-08,96.44
	12-Nov-08,90.12
	11-Nov-08,94.77
	10-Nov-08,95.88
	7-Nov-08,98.24
	6-Nov-08,99.10
	5-Nov-08,103.30
	4-Nov-08,110.99
	3-Nov-08,106.96
	31-Oct-08,107.59
	30-Oct-08,111.04
	29-Oct-08,104.55
	28-Oct-08,99.91
	27-Oct-08,92.09
	24-Oct-08,96.38
	23-Oct-08,98.23
	22-Oct-08,96.87
	21-Oct-08,91.49
	20-Oct-08,98.44
	17-Oct-08,97.40
	16-Oct-08,101.89
	15-Oct-08,97.95
	14-Oct-08,104.08
	13-Oct-08,110.26
	10-Oct-08,96.80
	9-Oct-08,88.74
	8-Oct-08,89.79
	7-Oct-08,89.16
	6-Oct-08,98.14
	3-Oct-08,97.07
	2-Oct-08,100.10
	1-Oct-08,109.12
	30-Sep-08,113.66
	29-Sep-08,105.26
	26-Sep-08,128.24
	25-Sep-08,131.93
	24-Sep-08,128.71
	23-Sep-08,126.84
	22-Sep-08,131.05
	19-Sep-08,140.91
	18-Sep-08,134.09
	17-Sep-08,127.83
	16-Sep-08,139.88
	15-Sep-08,140.36
	12-Sep-08,148.94
	11-Sep-08,152.65
	10-Sep-08,151.61
	9-Sep-08,151.68
	8-Sep-08,157.92
	5-Sep-08,160.18
	4-Sep-08,161.22
	3-Sep-08,166.96
	2-Sep-08,166.19
	29-Aug-08,169.53
	28-Aug-08,173.74
	27-Aug-08,174.67
	26-Aug-08,173.64
	25-Aug-08,172.55
	22-Aug-08,176.79
	21-Aug-08,174.29
	20-Aug-08,175.84
	19-Aug-08,173.53
	18-Aug-08,175.39
	15-Aug-08,175.74
	14-Aug-08,179.32
	13-Aug-08,179.30
	12-Aug-08,176.73
	11-Aug-08,173.56
	8-Aug-08,169.55
	7-Aug-08,163.57
	6-Aug-08,164.19
	5-Aug-08,160.64
	4-Aug-08,153.23
	1-Aug-08,156.66
	31-Jul-08,158.95
	30-Jul-08,159.88
	29-Jul-08,157.08
	28-Jul-08,154.40
	25-Jul-08,162.12
	24-Jul-08,159.03
	23-Jul-08,166.26
	22-Jul-08,162.02
	21-Jul-08,166.29
	18-Jul-08,165.15
	17-Jul-08,171.81
	16-Jul-08,172.81
	15-Jul-08,169.64
	14-Jul-08,173.88
	11-Jul-08,172.58
	10-Jul-08,176.63
	9-Jul-08,174.25
	8-Jul-08,179.55
	7-Jul-08,175.16
	3-Jul-08,170.12
	2-Jul-08,168.18
	1-Jul-08,174.68
	30-Jun-08,167.44
	27-Jun-08,170.09
	26-Jun-08,168.26
	25-Jun-08,177.39
	24-Jun-08,173.25
	23-Jun-08,173.16
	20-Jun-08,175.27
	19-Jun-08,180.90
	18-Jun-08,178.75
	17-Jun-08,181.43
	16-Jun-08,176.84
	13-Jun-08,172.37
	12-Jun-08,173.26
	11-Jun-08,180.81
	10-Jun-08,185.64
	9-Jun-08,181.61
	6-Jun-08,185.64
	5-Jun-08,189.43
	4-Jun-08,185.19
	3-Jun-08,185.37
	2-Jun-08,186.10
	30-May-08,188.75
	29-May-08,186.69
	28-May-08,187.01
	27-May-08,186.43
	23-May-08,181.17
	22-May-08,177.05
	21-May-08,178.19
	20-May-08,185.90
	19-May-08,183.60
	16-May-08,187.62
	15-May-08,189.73
	14-May-08,186.26
	13-May-08,189.96
	12-May-08,188.16
	9-May-08,183.45
	8-May-08,185.06
	7-May-08,182.59
	6-May-08,186.66
	5-May-08,184.73
	2-May-08,180.94
	1-May-08,180.00
	30-Apr-08,173.95
	29-Apr-08,175.05
	28-Apr-08,172.24
	25-Apr-08,169.73
	24-Apr-08,168.94
	23-Apr-08,162.89
	22-Apr-08,160.20
	21-Apr-08,168.16
	18-Apr-08,161.04
	17-Apr-08,154.49
	16-Apr-08,153.70
	15-Apr-08,148.38
	14-Apr-08,147.78
	11-Apr-08,147.14
	10-Apr-08,154.55
	9-Apr-08,151.44
	8-Apr-08,152.84
	7-Apr-08,155.89
	4-Apr-08,153.08
	3-Apr-08,151.61
	2-Apr-08,147.49
	1-Apr-08,149.53
	31-Mar-08,143.50
	28-Mar-08,143.01
	27-Mar-08,140.25
	26-Mar-08,145.06
	25-Mar-08,140.98
	24-Mar-08,139.53
	20-Mar-08,133.27
	19-Mar-08,129.67
	18-Mar-08,132.82
	17-Mar-08,126.73
	14-Mar-08,126.61
	13-Mar-08,127.94
	12-Mar-08,126.03
	11-Mar-08,127.35
	10-Mar-08,119.69
	7-Mar-08,122.25
	6-Mar-08,120.93
	5-Mar-08,124.49
	4-Mar-08,124.62
	3-Mar-08,121.73
	29-Feb-08,125.02
	28-Feb-08,129.91
	27-Feb-08,122.96
	26-Feb-08,119.15
	25-Feb-08,119.74
	22-Feb-08,119.46
	21-Feb-08,121.54
	20-Feb-08,123.82
	19-Feb-08,122.18
	15-Feb-08,124.63
	14-Feb-08,127.46
	13-Feb-08,129.40
	12-Feb-08,124.86
	11-Feb-08,129.45
	8-Feb-08,125.48
	7-Feb-08,121.24
	6-Feb-08,122.00
	5-Feb-08,129.36
	4-Feb-08,131.65
	1-Feb-08,133.75
	31-Jan-08,135.36
	30-Jan-08,132.18
	29-Jan-08,131.54
	28-Jan-08,130.01
	25-Jan-08,130.01
	24-Jan-08,135.60
	23-Jan-08,139.07
	22-Jan-08,155.64
	18-Jan-08,161.36
	17-Jan-08,160.89
	16-Jan-08,159.64
	15-Jan-08,169.04
	14-Jan-08,178.78
	11-Jan-08,172.69
	10-Jan-08,178.02
	9-Jan-08,179.40
	8-Jan-08,171.25
	7-Jan-08,177.64
	4-Jan-08,180.05
	3-Jan-08,194.93
	2-Jan-08,194.84
	31-Dec-07,198.08
	28-Dec-07,199.83
	27-Dec-07,198.57
	26-Dec-07,198.95
	24-Dec-07,198.80
	21-Dec-07,193.91
	20-Dec-07,187.21
	19-Dec-07,183.12
	18-Dec-07,182.98
	17-Dec-07,184.40
	14-Dec-07,190.39
	13-Dec-07,191.83
	12-Dec-07,190.86
	11-Dec-07,188.54
	10-Dec-07,194.21
	7-Dec-07,194.30
	6-Dec-07,189.95
	5-Dec-07,185.50
	4-Dec-07,179.81
	3-Dec-07,178.86
	30-Nov-07,182.22
	29-Nov-07,184.29
	28-Nov-07,180.22
	27-Nov-07,174.81
	26-Nov-07,172.54
	23-Nov-07,171.54
	21-Nov-07,168.46
	20-Nov-07,168.85
	19-Nov-07,163.95
	16-Nov-07,166.39
	15-Nov-07,164.30
	14-Nov-07,166.11
	13-Nov-07,169.96
	12-Nov-07,153.76
	9-Nov-07,165.37
	8-Nov-07,175.47
	7-Nov-07,186.30
	6-Nov-07,191.79
	5-Nov-07,186.18
	2-Nov-07,187.87
	1-Nov-07,187.44
	31-Oct-07,189.95
	30-Oct-07,187.00
	29-Oct-07,185.09
	26-Oct-07,184.70
	25-Oct-07,182.78
	24-Oct-07,185.93
	23-Oct-07,186.16
	22-Oct-07,174.36
	19-Oct-07,170.42
	18-Oct-07,173.50
	17-Oct-07,172.75
	16-Oct-07,169.58
	15-Oct-07,166.98
	12-Oct-07,167.25
	11-Oct-07,162.23
	10-Oct-07,166.79
	9-Oct-07,167.86
	8-Oct-07,167.91
	5-Oct-07,161.45
	4-Oct-07,156.24
	3-Oct-07,157.92
	2-Oct-07,158.45
	1-Oct-07,156.34
	28-Sep-07,153.47
	27-Sep-07,154.50
	26-Sep-07,152.77
	25-Sep-07,153.18
	24-Sep-07,148.28
	21-Sep-07,144.15
	20-Sep-07,140.31
	19-Sep-07,140.77
	18-Sep-07,140.92
	17-Sep-07,138.41
	14-Sep-07,138.81
	13-Sep-07,137.20
	12-Sep-07,136.85
	11-Sep-07,135.49
	10-Sep-07,136.71
	7-Sep-07,131.77
	6-Sep-07,135.01
	5-Sep-07,136.76
	4-Sep-07,144.16
	31-Aug-07,138.48
	30-Aug-07,136.25
	29-Aug-07,134.08
	28-Aug-07,126.82
	27-Aug-07,132.25
	24-Aug-07,135.30
	23-Aug-07,131.07
	22-Aug-07,132.51
	21-Aug-07,127.57
	20-Aug-07,122.22
	17-Aug-07,122.06
	16-Aug-07,117.05
	15-Aug-07,119.90
	14-Aug-07,124.03
	13-Aug-07,127.79
	10-Aug-07,125.00
	9-Aug-07,126.39
	8-Aug-07,134.01
	7-Aug-07,135.03
	6-Aug-07,135.25
	3-Aug-07,131.85
	2-Aug-07,136.49
	1-Aug-07,135.00
	31-Jul-07,131.76
	30-Jul-07,141.43
	27-Jul-07,143.85
	26-Jul-07,146.00
	25-Jul-07,137.26
	24-Jul-07,134.89
	23-Jul-07,143.70
	20-Jul-07,143.75
	19-Jul-07,140.00
	18-Jul-07,138.12
	17-Jul-07,138.91
	16-Jul-07,138.10
	13-Jul-07,137.73
	12-Jul-07,134.07
	11-Jul-07,132.39
	10-Jul-07,132.35
	9-Jul-07,130.33
	6-Jul-07,132.30
	5-Jul-07,132.75
	3-Jul-07,127.17
	2-Jul-07,121.26
	29-Jun-07,122.04
	28-Jun-07,120.56
	27-Jun-07,121.89
	26-Jun-07,119.65
	25-Jun-07,122.34
	22-Jun-07,123.00
	21-Jun-07,123.90
	20-Jun-07,121.55
	19-Jun-07,123.66
	18-Jun-07,125.09
	15-Jun-07,120.50
	14-Jun-07,118.75
	13-Jun-07,117.50
	12-Jun-07,120.38
	11-Jun-07,120.19
	8-Jun-07,124.49
	7-Jun-07,124.07
	6-Jun-07,123.64
	5-Jun-07,122.67
	4-Jun-07,121.33
	1-Jun-07,118.40
	31-May-07,121.19
	30-May-07,118.77
	29-May-07,114.35
	25-May-07,113.62
	24-May-07,110.69
	23-May-07,112.89
	22-May-07,113.54
	21-May-07,111.98
	18-May-07,110.02
	17-May-07,109.44
	16-May-07,107.34
	15-May-07,107.52
	14-May-07,109.36
	11-May-07,108.74
	10-May-07,107.34
	9-May-07,106.88
	8-May-07,105.06
	7-May-07,103.92
	4-May-07,100.81
	3-May-07,100.40
	2-May-07,100.39
	1-May-07,99.47
	30-Apr-07,99.80
	27-Apr-07,99.92
	26-Apr-07,98.84
	25-Apr-07,95.35
	24-Apr-07,93.24
	'''
}