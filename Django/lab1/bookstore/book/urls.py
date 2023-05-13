from django.urls import path
from .views import index , get_all_books, book_detail, book_delete, book_update, book_create, add_book

app_name = 'book'

# http://localhost:8000/post/2/comment/1
urlpatterns = [
    path('index', index, name='book-index'),
    path('book_list/', get_all_books, name="book-list"),
    path('book_create',book_create,name="book-create"),
    path('add_new_book',add_book,name="book-add"),
    path('book_detail/<int:book_id>', book_detail, name="book-detail"),
    path('book_delete/<int:book_id>', book_delete, name="book-delete"),
    path('book_update/<int:book_id>', book_update, name="book-update"),
]