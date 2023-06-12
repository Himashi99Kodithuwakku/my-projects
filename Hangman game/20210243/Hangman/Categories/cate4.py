# category 4 Fruits
# each category has 5 rounds

def cat_4():
    "Store  guessing words, if player select category 4 display category relevant guessing words"
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
        rand = random.shuffle(fruits)
        word = fruits[1]
        lens = len(word)
        turns = lens

# Display hint
        if lens == 4:
            print("\nHINT :A fruit with pale green or brownish skin" )
                  
        elif lens == 5:
            print("\nHINT :Sir Aisek Newton found a law look at this tree ")
                   
        elif lens == 6:
            print("\nHINT :A color between red and yellow that is like the color of fire")
            
        elif lens == 10:
            print("\nHINT :A large ,round fruit that has green skin and inside red ")
        
        elif lens == 11:
            print("\nHINT :It  known as strawberry pear, and it has unique look")


# Display spaces according to word

        if lens == 4:
            for letter in word:
                print(" _ ",end="")
            
            
        elif lens == 5:
            for letter in word:
                print(" _ ",end="")
            
            
        elif lens == 6:
            for letter in word:
                print(" _ ",end="")
            
            
        elif lens == 10:
            for letter in word:
                print(" _ ",end="")
            
           
        elif lens == 11:
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
    
      


    
