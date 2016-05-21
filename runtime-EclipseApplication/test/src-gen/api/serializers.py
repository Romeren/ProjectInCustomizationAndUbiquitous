from rest_framework import serializers
from api.model import api, TestDataModel
from django.contrib.auth.models import User



class UserSerializer(serializers.HyperlinkedModelSerializer):

    class Meta:
        model = User
        fields = ('url', 'username', 'email', 'is_staff')

class TestDataSerializer(serializers.Serializer):
	name = serializers.CharField(max_length=200)
	content = serializers.CharField(max_length=200)
	created = serializers.DateTimeField()

	def create(self, validated_data):
		return TestDataModel(**validated_data)

	def update(self, instance, validated_data):
		instance.email = validated_data.get('name', instance.name)
		instance.content = validated_data.get('content', instance.content)
		instance.created = validated_data.get('created', instance.created)
		return instance