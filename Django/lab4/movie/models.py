from django.db import models


class Category(models.Model):
    name = models.CharField(max_length=50)

    def __str__(self):
        return self.name

    class Meta:
        ordering = ('-name',)

class Cast(models.Model):
    name = models.CharField(max_length=50)


class CommonInfo(models.Model):
    title = models.CharField(max_length=50)
    description = models.TextField()
    release_date = models.DateField()
    poster = models.ImageField(upload_to='pintrest_posters',null=True,blank=True)
    watch_count = models.IntegerField(null=True)
    likes = models.IntegerField(null=True)
    categories = models.ManyToManyField(Category)
    casts = models.ManyToManyField(Cast)

    def __str__(self):
        return self.title

    class Meta:
        abstract = True


class Movie(CommonInfo):
    pass


class Series(CommonInfo):
    season = models.CharField(max_length=50)
    episode = models.CharField(max_length=50)


