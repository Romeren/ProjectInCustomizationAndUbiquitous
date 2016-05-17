from django.shortcuts import render
from django.http import HttpResponse
from django.template import loader
from django.template import Context

def index(request):
	template = loader.get_template('index.html');
	
	with open('templates/data.csv') as f:
		content = f.readlines()

	context = Context({'graph_data' : content})
	return HttpResponse(template.render(context))

def pageOne(request):
	template = loader.get_template('pageOne.html');
	
	with open('templates/data.csv') as f:
		content = f.readlines()

	context = Context({'graph_data' : content})
	return HttpResponse(template.render(context))


