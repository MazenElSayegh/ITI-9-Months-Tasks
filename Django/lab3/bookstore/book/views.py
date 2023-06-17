from django.shortcuts import render, redirect
from django.http import HttpResponse
from .models import Book
from .forms import BookFrom
from django.contrib.auth.decorators import login_required, permission_required

# Create your views here.

books = [
    {
        'id': 1,
        'name': "clean code",
        'description': "clean code book",
        'price': 20
    },
    {
        'id': 2,
        'name': "learn laravel",
        'description': "learn laravel book",
        'price': 40
    },
    {
        'id': 3,
        'name': "learn js",
        'description': "learn js book",
        'price': 30
    },

]


def index(request, **kwargs):
    books = Book.objects.all()
    return render(request, 'book/index.html', context={'books': books})


@login_required(login_url='login')
def show(request, id):
    book = Book.objects.get(id=id)
    return render(request, 'book/show.html', {'book': book})


@permission_required("view_book")
@login_required(login_url='login')
def create(request):
    form = BookFrom()
    if request.method == 'POST':
        form = BookFrom(data=request.POST)
        if form.is_valid():
            form.save()
            return redirect("book:index")
    return render(request, 'book/create.html', context={'form': form})


@login_required(login_url='login')
def update(request, id):
    book = Book.objects.get(id=id)
    form = BookFrom(instance=book)

    if request.method == "POST":
        form = BookFrom(data=request.POST, instance=book)
        if form.is_valid():
            form.save()
            return redirect("book:index")
    return render(request, 'book/update.html', context={
        'form': form,
        'book': book
    })


@login_required(login_url='login')
def delete(request, id):
    Book.objects.get(id=id).delete()
    return redirect('book:index')


def _get_book(book_id):
    for book in books:
        if book["id"] == book_id:
            return book
    return None


def _update_book(book_id):
    book = _get_book(book_id)
    book["name"] = f'updated {book["name"]}'
