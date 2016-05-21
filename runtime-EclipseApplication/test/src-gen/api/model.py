from django.db import models
import datetime

class api(models.Model):
    created = models.DateTimeField(auto_now_add=True)
    title = models.CharField(max_length=100, blank=True, default='')
    code = models.TextField()
    linenos = models.BooleanField(default=False)

    class Meta:
        ordering = ('created',)

class TestDataModel(models.Model):
	name = models.CharField(max_length=200, unique=True)
	content = models.CharField(max_length=100)
	created = models.DateTimeField()

	def __init__(self, name, content=None, created=None):
		self.name = name
		self.content = content or ''
		self.created = created or datetime.datetime.now()