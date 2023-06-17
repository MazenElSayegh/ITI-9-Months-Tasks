from django.urls import path
from .views import (movie_list, movie_create, movie_detail, movie_delete,
                     movie_update)



app_name = "movie-api"


urlpatterns = [
    path('api/movies', movie_list, name='movie-index'),
    path('api/movie/create', movie_create, name='movie-create'),
    path('api/movie/<int:pk>', movie_detail, name='movie-detail'),
    path('api/movie/<int:pk>/delete', movie_delete, name='movie-delete'),
    path('api/movie/<int:pk>/update', movie_update, name='movie-update'),
]

