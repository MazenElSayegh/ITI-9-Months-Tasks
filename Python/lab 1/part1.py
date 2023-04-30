#! /usr/bin/env python
#1-- Write a Python program which accepts the user's first and last name and print them in
#reverse order with a space between them.
# first_name=input("Enter your first name \n")
# last_name=input("Enter your last name \n")
# print(f"{last_name} {first_name}")

#2- Write a Python program that accepts an integer (n) and computes the value of
#n+nn+nnn.
# n=input('enter an integer')
# n1=int("{}".format(n))
# n2=int("{0}{0}".format(n))
# n3=int("{0}{0}{0}".format(n))
# print(n1+n2+n3)

#3- Write a Python program to print the following here document.
# print("""a string that you "don't" have to escape
# This
# is a ....... multi-line
# heredoc string --------> example """)

#4- Write a Python program to get the volume of a sphere with radius 6.
# volume= 4/3*3.14*6**3
# print(volume)

#5- Write a Python program that will accept the base and height of a triangle and compute
#the area.
# height=int(input("enter the height"))
# base=int(input("enter the base"))
# area=base*height/2
# print(area)

#6- Write a Python program to construct the following pattern, using a nested for loop.
# for i in range(5):
#     for j in range(i):
#         print("*",end=" ")
#     print(" ")
    
# for i in range(5,0,-1):
#     for j in range(i):
#         print("*",end=" ")
#     print(" ")

# 7- Write a Python program that accepts a word from the user and reverse it.
# w=input("enter a word")
# inv_word=w[::-1]
# print(inv_word)

# 8- Write a Python program that prints all the numbers from 0 to 6 except 3 and 6.
# for i in range(7):
#   if i == 3 or i == 6:
#     continue
#   else:
#     print(i)

# 9-Write a Python program to get the Fibonacci series between 0 to 50
# x,y=0,1
# tmp=0
# while (y<50):
#     print(y,end=' ')  #1  
#     tmp=y  #1
#     y=x+y  
#     x=tmp

# 10-Write a Python program that accepts a string and calculates the number of digits and letters
# str=input('Enter a mixed string \n')
# letters,digits =0,0
# for char in str:
#     if char.isdigit():
#         digits+=1
#     elif char.isalpha():
#         letters+=1
# print(f"Letters= {letters} \nDigits={digits} ")
