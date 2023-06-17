from django.contrib import admin

from .models import Movie, Category, Cast

admin.site.register(Movie)
admin.site.register(Category)
admin.site.register(Cast)
