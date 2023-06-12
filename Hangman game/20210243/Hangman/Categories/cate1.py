# category 1 Sports
# each category has 5 rounds

def cat_1():
    "Store  guessing words, if player select category 1 display category relevant guessing words"
    sports = ["golf","cricket","football","karate","basketball"]
    animals = ["dog","giraffe","elephant","snake","parrot"]
    countries = ["canada","srilanka","newzeland","korea","england"]
    fruits = ["pear","apple","watermelon","orange","dragonfruit"]

# connect database

    import mysql.connector 

    import random

# open  hangman database connection using dictionary

    conDict = {"host":"localhost",
           "database":"Hangman",
           "user":"root",
           "password":""}

    db = mysql.connector.connect(**conDict)

# prepare a cursor object using cursor() method

    cursor = db.cursor()


# create variables

    gword = 0
    total_w = 0
    total_l = 0
    total_wins = 0
    total_loses = 0
    p_name = 0
    player = 0


# get player name and assign player number
    p_name = input("Enter Your name:")
    p_no = random.randrange(1,1000)


# each category has five rounds

    while gword < 5:
        guesses = ""

        
# randomly display guess word       
        rand = random.shuffle(sports)
        word = sports[1]
        lens = len(word)
        turns = lens

# Display hint
        if lens == 4:
            print("\nHINT :Very popular among rich people" )
                  
        elif lens == 6:
            print("\nHINT: One of the martial arts")
                   
        elif lens == 7:
            print("\nHINT :England's national sport")
            
        elif lens == 8:
            print("\nHINT : A sport that uses legs")
        
        elif lens == 10:
            print("\nHINT :Tallest players can easily score in this game")
           
# Display spaces according to word

        if lens == 4:
            for letter in word:
                print(" _ ",end="")
            
            
        elif lens == 6:
            for letter in word:
                 print(" _ ",end="")
            
            
        elif lens == 7:
            for letter in word:
                 print(" _ ",end="")
            
                
        elif lens == 8:
            for letter in word:
                print(" _ ",end="")
            
           
        elif lens == 10:
            for letter in word:
                print(" _ ",end="")

                
# Get Guessing letter from player
                
        while turns > 0:

            print("\n")
            guess = input(" enter guess letter :")
            print("\n")

            if guess in word:
                print("\t","you have",turns,"left")
            else:
                 turns -= 1
                 print("\t","you guessed wrong  you have",turns,"left")


            guesses = guesses + guess
            wrongletter = 0

            for letter in word :
                if letter in guesses:
                    print(" ",letter," ",end="")
                else:
                    print(" _ ",end="")
                    wrongletter+=1

#If player gussed correct word display win
                    
            if wrongletter == 0:
                print("\t","Congratulations! guess word is : ",word,"\n","You Won !")
                total_w += 1
                print("\nTOTAl OF WINS:",total_w)  
                gword+=1
                print("\nTOTAL ROUNDS:",gword)

# read player info
                player = p_name
                total_wins = total_w
                total_loses = total_l
                print("\n")
                
                break

       
        else:
            print("\t","You Lose!","\n","you can try again")
            total_l +=1
            print("\nTOTAl OF LOSES:",total_l)
            gword+=1
            print("\nTOTAL ROUNDS:",gword)
            player = p_name
            total_wins = total_w
            total_loses = total_l
            print("\n")
            
# execute sql query method() input data to table


    mySQLtext = "INSERT INTO records  VALUES (%s,%s,%s,%s)"
    myValues= (p_no,p_name,total_wins,total_loses)
    cursor.execute(mySQLtext,myValues)
    
# Commit the change

    db.commit()
    print(cursor.rowcount,"Record Added")
    
# disconnect from server
    db.close()
    
    
