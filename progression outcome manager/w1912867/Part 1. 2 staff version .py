# part 1.3 Multiple outcomes & Histrogrames (staff version)


# I declare that my work contains no examples of miscounduct, such as plagarism, or collusion.
# Any code taken from other sources is referenced within my code solution.
# student ID: w1912867
# 2022.03.13

# create variables

progress = 0
trailer = 0
retriever = 0
excluded = 0
outcome = 0
val = "y"
while val == "y":
     try:
          credit_p = int(input("\nPlease enter your credits at pass :"))  # get user inputs
          
          if  credit_p in range (0,121,20):
              credit_d = int(input("Please enter your credits at defer :"))
              if credit_d in range (0,121,20):
                  credit_f= int(input("Please enter your credits at fail :"))
                  if credit_f in range (0,121,20):
                      total_of_credits = credit_p + credit_d + credit_f
                      if total_of_credits  <120 or  total_of_credits>120:
                          print("\nTotal incorrect")
                          
                      elif total_of_credits == 120:    # according to user inputs  display  outcome
                         if credit_p  == 120:
                             print("\nProgress")
                             progress+=1

                         elif credit_p == 100 and credit_d  in (0,20) and credit_f in (0,20):
                             print("\nProgress (module trailer)")
                             trailer+=1
                         elif credit_p in (0,20,40) and credit_d  in (0,20,40) and credit_f in (80,100,120):
                             print("\nExclude")
                             excluded+=1

                         elif credit_p in (0,20,40,60,80) and credit_d in (0,20,40,60,80,100,120) and credit_f in( 0,20,40,60):
                             print("\nModule retriever")
                             retriever+=1
                  else:
                      print("Out of range")

              else:
                  print("Out of range")
          else:
              print("Out of range")

         

         
                              
     except ValueError:
          print("Integer required")

     print("\nWould you like to enter another set of data?")
     val = input("Enter 'y' for yes or 'q' for quit to and view results:\n")
     if val == "q":
          print("-"*80,end="")
          print("Horizontal Histrogram")           # display historgram according to input data
          print("\n Progress", progress," :","*"*progress,end="")
          print("\n Trailer",  trailer,"  :","*"*trailer,end="")
          print("\n Retriever",retriever,":","*"*retriever,end="")
          print("\n Excluded",excluded," :","*"*excluded,end="")
          
          outcome = progress + trailer + retriever +excluded
          print("\n")
          print(outcome,"outcomes in total")
          print("-"*80,end="")

          

