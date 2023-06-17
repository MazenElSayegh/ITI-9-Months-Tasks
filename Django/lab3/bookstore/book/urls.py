from django.urls import path
from .views import index, show, update, delete, create

app_name = 'book'
urlpatterns = [
    path('', index, name='index'),
    path('create/', create, name='create'),
    path('show/<int:id>', show, name='show'),
    path('update/<int:id>', update, name='update'),
    path('delete/<int:id>', delete, name='delete'),
]
