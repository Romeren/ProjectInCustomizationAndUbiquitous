from django.shortcuts import render
from django.http import HttpResponse
from django.template import loader
from django.template import Context


def index(request):
	#now = datetime.datetime.now()
    #html = "<html><body>It is now hest.</body></html>"
	html = loader.get_template('index.html');
#	context = Context({"some_list" : [1,2,3] })

	return HttpResponse(html.render())#.render(context))