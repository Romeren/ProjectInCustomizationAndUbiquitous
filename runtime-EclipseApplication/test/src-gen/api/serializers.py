from rest_framework import serializers
from api.model import api
from django.contrib.auth.models import User


class UserSerializer(serializers.HyperlinkedModelSerializer):
    class Meta:
        model = User
		fields = ('url', 'username', 'email', 'is_staff')
