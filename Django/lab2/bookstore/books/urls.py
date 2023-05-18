from django.urls import path
from .views import index , book_details, book_delete, book_update, book_create, add_book

app_name = 'book'

# http://localhost:8000/post/2/comment/1
urlpatterns = [
    path('index', index, name='book-index'),
    path('book_create',book_create,name="book-create"),
    path('add_new_book',add_book,name="book-add"),
    path('book_details/<int:pk>', book_details, name="book-detail"),
    path('book_delete/<int:pk>', book_delete, name="book-delete"),
    path('book_update/<int:pk>', book_update, name="book-update"),
]