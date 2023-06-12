# import modules 


import Categories.cate1
import Categories.cate2
import Categories.cate3
import Categories.cate4



     
print("\nWelcome to guessing game")

# display categories

print("\nSelect Category")
print("\n(1) - Sports\n(2) - Animals\n(3) - Countries\n(4) - Fruits")

# get category  number from player
cat = int(input("\nEnter Category number:"))

# display according to player select category  relevant words


if cat == 1:
    Categories.cate1.cat_1()

elif cat == 2:
    Categories.cate2.cat_2()    
        
elif cat == 3:
    Categories.cate3.cat_3()
          
elif cat == 4:
    Categories.cate4.cat_4()
    
    


