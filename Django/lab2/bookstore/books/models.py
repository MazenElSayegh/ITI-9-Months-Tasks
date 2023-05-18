from django.db import models

# Create your models here.
class Books(models.Model):
    # slug = models.SlugField()
    title = models.CharField("Book Title", max_length=255, unique=True)
    description = models.TextField("Book description")
    views = models.IntegerField(default=0)
    rate = models.PositiveIntegerField(default=0) 
    created_at = models.DateTimeField(auto_now_add=True)
    updated_at = models.DateTimeField(auto_now=True)
    
    def __str__(self):
        return f"Title {self.title}"