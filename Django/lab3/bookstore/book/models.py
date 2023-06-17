from django.db import models
from django.contrib.auth.models import User

from django.core.validators import MaxLengthValidator, MinLengthValidator

from django.conf import settings
from .utils import create_auto_number

# Create your models here.


# class Author(models.Model):
#     user = models.OneToOneField(User, on_delete=models.CASCADE)


class Book(models.Model):
    title = models.CharField("Book Title", max_length=50,
                             validators=[MinLengthValidator(10), MaxLengthValidator(50)], unique=True)
    description = models.TextField("Book Description")
    price = models.FloatField("Book price")
    isbn = models.OneToOneField('ISBN', on_delete=models.CASCADE, null=True)

    def __str__(self):
        return f"{self.title}"


class Category(models.Model):
    name = models.CharField(max_length=100, validators=[MinLengthValidator(2)])
    book = models.ForeignKey(
        'Book', on_delete=models.CASCADE, null=True)

    def __str__(self):
        return f"{self.name}"


class ISBN(models.Model):
    author_title = models.CharField(
        "Author Name", max_length=100)
    book_title = models.CharField("Book Name", max_length=100)
    isbn = models.CharField("Book ISBN", max_length=50,
                            default=create_auto_number, null=True)

    def __str__(self):
        return f"{self.isbn}"
