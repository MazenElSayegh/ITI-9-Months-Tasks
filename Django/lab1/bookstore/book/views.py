from django.shortcuts import render, redirect
from django.http import HttpResponse, JsonResponse, HttpResponseRedirect

# Create your views here.

def index(request):
    print(request.body)
    print("hello")
    return render(request, 'main/base_layout.html')

books_list = [
    {
        'title':'Book1',
        'id':1,
        'description':'book one description',
        'quantity':3
    },
    {
       'title':'Book2',
        'id':2,
        'description':'book two description',
        'quantity':5 
    },
    {
       'title':'Book3',
        'id':3,
        'description':'book three description',
        'quantity':1
    },
]

def get_all_books(request):
    my_context = {'books_list': books_list}
    return render(request, 'book/book_list.html', context=my_context)

def _get_book(book_id):
    for book in books_list:
        if 'id' in book and book['id'] == book_id:
            return book
    return None

def book_detail(request, **kwrgs):
    book_id = kwrgs.get('book_id')
    book_object = _get_book(book_id)
    if book_object:
        my_context = {
            'book_id': book_object.get('id'),
            'book_title': book_object.get('title'),
            'book_quantity': book_object.get('quantity'),
            'book_description': book_object.get('description')
        }
    else:
        my_context = {
            'book_id': "unavailable",
            'book_title': "unavailable",
            'book_quantity': "unavailable",
            'book_description': "unavailable" 
        }

    return render(request, 'book/book_details.html', context=my_context)

def book_delete(request, **kwargs):
    book_id = kwargs.get('book_id')
    book_object = _get_book(book_id)
    if book_object:
        books_list.remove(book_object)
    return redirect('book:book-list') 

def book_update(request, **kwargs):
    book_id = kwargs.get('book_id')
    book_object = _get_book(book_id)
    for book in books_list:
        if book == book_object:
            book['title'] = f"{book_object['title']} is updated"       
    return redirect('book:book-list') 

def book_create(request):
    return render(request, 'book/book_create.html')

def add_book(request):
    if request.method == 'POST':
        my_context = {
            'id': request.POST['id'],
            'title': request.POST['title'],
            'quantity': request.POST['quantity'],
            'description': request.POST['description']
        }
        books_list.append(my_context)
    all_books = {'books_list': books_list}
    return render(request, 'book/book_list.html', context=all_books)
    


