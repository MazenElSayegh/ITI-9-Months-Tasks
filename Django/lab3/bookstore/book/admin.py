from django.contrib import admin
from .models import Book
from .models import Category
from .models import ISBN
from django.conf import settings


class InlineCategory(admin.StackedInline):
    model = Category


class BookAdmin(admin.ModelAdmin):
    list_filter = ('title',)
    list_display = ('title', 'description', 'price')
    inlines = [InlineCategory]


# Register your models here.


admin.site.register(Book, BookAdmin)
admin.site.register(Category)
admin.site.register(ISBN)
