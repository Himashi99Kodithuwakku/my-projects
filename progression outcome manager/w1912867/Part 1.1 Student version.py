# part 1 main version (student version)


# I declare that my work contains no examples of miscounduct, such as plagarism, or collusion.
# Any code taken from other sources is referenced within my code solution.
# student ID: w1912867
# 2022.03.13

# create variables 
credit_p = 0 
credit_d = 0
credit_f = 0
total_of_credits = 0

try:
     credit_p = int(input("Please enter your credits at pass :")) # get user inputs 
     
     if  credit_p in range (0,121,20):
         credit_d = int(input("Please enter your credits at defer :"))
         if credit_d in range (0,121,20):
             credit_f= int(input("Please enter your credits at fail :"))
             if credit_f in range (0,121,20):
                 total_of_credits = credit_p + credit_d + credit_f
                 if total_of_credits  <120 or  total_of_credits>120:
                     print("\nTotal incorrect")
                     
                 elif total_of_credits == 120:   # display outcomes according to inputs
                    if credit_p  == 120:
                        print("\nProgress")

                    elif credit_p == 100 and credit_d  in (0,20) and credit_f in (0,20):
                        print("\nProgress (module trailer)")
                        
                    elif credit_p in (0,20,40) and credit_d  in (0,20,40) and credit_f in (80,100,120):
                        print("\nExclude")

                    elif credit_p in (0,20,40,60,80) and credit_d in (0,20,40,60,80,100,120) and credit_f in( 0,20,40,60):
                        print("\nModule retriever")
                        
             else:
                 print("Out of range")

         else:
             print("Out of range")
     else:
         print("Out of range")

    

    
                         
except ValueError:
     print("Integer required")
