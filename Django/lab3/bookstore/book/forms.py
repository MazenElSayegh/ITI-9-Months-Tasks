from django.forms import ModelForm
from .models import Book


class BookFrom(ModelForm):

    class Meta:
        model = Book
        fields = '__all__'
