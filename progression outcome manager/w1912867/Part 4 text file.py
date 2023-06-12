# part 1.3 Multiple outcomes & Histrogrames


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
credit_p = 0
credit_d = 0
credit_f = 0
dlist = [] 
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

                          
                          
                      elif total_of_credits == 120:     # display outcomes according to user inputs
                         if credit_p  == 120:
                             print("\nProgress")
                             outcome = "Progress"
                             progress+=1
                             
                             
                         elif credit_p == 100 and credit_d  in (0,20) and credit_f in (0,20):
                             print("\nProgress (module trailer)")
                             outcome = "Progress (module trailer)"
                             trailer+=1
                            
                             
                         elif credit_p in (0,20,40) and credit_d  in (0,20,40) and credit_f in (80,100,120):
                             print("\nExclude")
                             outcome = "Exclude"
                             excluded+=1
                            
                             

                         elif credit_p in (0,20,40,60,80) and credit_d in (0,20,40,60,80,100,120) and credit_f in( 0,20,40,60):
                             print("\nModule retriever")
                             outcome = "Module retriever"
                             retriever+=1
                            
                         dlist.append([outcome,credit_p,credit_d,credit_f])  
                         stored_data=open("stored data.txt","a")                   # open a file name stored data
                         stored_data.write(f'{outcome}  :{credit_p}, {credit_d}, {credit_f}\n ')  # write data in file 
                         stored_data.close()
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

          print("\nSelect Histrogram version")
          histrogram = input("Enter h for horizontal v for vertical :")
          print("-"*80,end="")
          
          if histrogram == "h":

               print("Horizontal Histrogram")
               print("\n Progress", progress," :","*"*progress,end="")
               print("\n Trailer",  trailer,"  :","*"*trailer,end="")
               print("\n Retriever",retriever,":","*"*retriever,end="")
               print("\n Excluded",excluded," :","*"*excluded,end="")

               

          
          elif histrogram == "v":
          
               print("Vertical Histrogram")  

               print("%-5s %s %-5s %s %-5s %s   %-5s %s" %("Progress",progress,"Trailer",trailer,"Retriever",retriever,"Excluded",excluded))

               for x in range (max(progress,trailer,retriever,excluded)):
                    print(f'{"   *" if x < progress else " " :9}  {"   *" if x < trailer else " " :12} {" *" if x < retriever else " " :13} {" *" if x < excluded else " " :14} ')


          outcome = progress + trailer + retriever +excluded
          print("\n",outcome,"outcomes in total")
          print("-"*80,end="")

          stored_data = open("stored data.txt","r")
          read_data = stored_data.readlines()    # read data stored in a file  
          for item in read_data:           # dispaly data from a file 
               print(item)
               stored_data.close()
        
