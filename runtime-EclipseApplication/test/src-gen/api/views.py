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
