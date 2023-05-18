from django.shortcuts import render, redirect
from django.http import HttpResponse, JsonResponse, HttpResponseRedirect
from .models import Books
from .forms import BooksForm

# Create your views here.

def index(request):
    print("hello")
    print(request.body)
    all_books = Books.objects.all()
    return render(request, 'book/book_list.html', context={"books": all_books})

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

def book_details(request, pk):
    book= Books.objects.get(pk=pk)
    return render(request ,'book/book_details.html',context={"book":book})

def book_delete(request, pk):
    Books.objects.get(pk=pk).delete()
    return redirect("book:book-index")

def book_edit(request):
    return render(request, 'book/book_edit.html')

def book_update(request, pk):
    book=Books.objects.get(pk=pk)
    form=BooksForm(instance=book)
    if request.method == "POST":
        form= BooksForm(data=request.POST, instance=book)
        if form.is_valid():
            form.save()      
            return redirect('book:book-detail',pk=book.id)
            # return render(request, 'book:book-detail',pk=book.id)
    return render(request, 'book/book_edit.html', context={
        'form': form, 
        'book': book
    })

def book_create(request):
    return render(request, 'book/book_create.html')

def add_book(request):
    form = BooksForm()
    if request.method == 'POST':
        form= BooksForm(data=request.POST)
        if form.is_valid():
            form.save()
            return redirect("book:book-index")
    return render(request, 'book/book_create.html', context={
        'form':form
    })



# def movie_update(request, pk):
#     movie = Movie.objects.get(pk=pk)
#     form = MovieForm(instance=movie)
#     if request.method == "PUT":
#         form = MovieForm(data=request.POST, instance=movie)
#         if form.is_valid():
#             form.save()
#             return redirect("movie:movie-detail", pk=movie.id)
        
#     return render(request, 'movie/movie_update.html', context={
#         'form': form, 
#         'movie': movie
#     })
