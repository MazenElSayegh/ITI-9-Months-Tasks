from django.urls import path
from .views import loginpg, signupPg, signoutPg

# app_name = 'book'
urlpatterns = [
    path('login', loginpg, name='login'),
    path('signup', signupPg, name='signup'),
    path('signout', signoutPg, name='signout')

]
