# -*- coding: utf-8 -*-
# Generated by Django 1.9.5 on 2016-06-27 01:03
from __future__ import unicode_literals

from django.db import migrations, models


class Migration(migrations.Migration):

    dependencies = [
        ('app', '0015_auto_20160625_1802'),
    ]

    operations = [
        migrations.AddField(
            model_name='student',
            name='birthdate',
            field=models.DateField(null=True),
        ),
    ]
