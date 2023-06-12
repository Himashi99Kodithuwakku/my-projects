
# create table

import mysql.connector

# open database connection

db =  mysql.connector.connect( host = "localhost",database = "Hangman",user = "root", password = "")

#prepre a cursor object using cursor() method

cursor = db.cursor()

#execute sql query using execute() method

cursor.execute("CREATE TABLE records (playerNo INT(4), playerName VARCHAR(20),totalOfwins INT(2),totalOfloses INT(2))")

# disconnect from server
db.close()
