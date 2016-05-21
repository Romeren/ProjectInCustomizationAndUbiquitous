from django.conf.urls import include,url

from django.contrib.auth.models import User
from rest_framework import routers, serializers, viewsets

from api.views import UserViewSet, TestDataViewSet


# Routers provide an easy way of automatically determining the URL conf.
router = routers.DefaultRouter()
router.register(r'users', UserViewSet)
router.register(r'testdata', TestDataViewSet)

urlpatterns = [
	url(r'^api/', include(router.urls)),
]
