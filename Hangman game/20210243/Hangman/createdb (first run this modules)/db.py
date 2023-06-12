

# create database

import mysql.connector

# open database connection

db =  mysql.connector.connect( host = "localhost", user = "root", password = "")

#prepre a cursor object using cursor() method

cursor = db.cursor()

#execute sql query using execute() method

cursor.execute ("CREATE DATABASE Hangman")

# disconnect from server

db.close()
