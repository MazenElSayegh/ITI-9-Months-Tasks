#! /usr/bin/env python
#1- Given a list of numbers, create a function that returns a list where all similar adjacent elements have been reduced to a single element
# def remove_similar(list):
#     new_list = []
#     for i in list:
#         if i not in new_list:
#             new_list.append(i)

#     return new_list

# my_list = input("please enter numbers separated by space\n")
# my_list = my_list.split(" ")
# my_list = remove_similar(my_list)
# print(my_list)

# 2- Consider dividing a string into two halves
# def divide_string(x,y):
#     x_length = len(x)
#     y_length = len(y)
#     x_half=x_length //2 +x_length%2
#     y_half=y_length //2 +y_length%2
#     return x[:x_half] + y[:y_half] + x[x_half:] + y[y_half:]
# print(divide_string('Mazen', 'Sayegh')) 

# 3- Write a Python function that takes a sequence of numbers and determines whether all the numbers are different from each other.
# def check_if_distinct(numbers):
#     numbers_quantity = len(numbers)
#     unique_numbers = len(set(numbers))
#     return numbers_quantity==unique_numbers
# print(check_if_distinct([1,2,3,4,5,6]))

# 4- Given unordered list, sort it using algorithm bubble sort
# def bubble_sort(list):
#   # Iterate over the list comparing numbers
#   for i in range(len(list) - 1):
#     for j in range(len(list) - i - 1):
#         if list[j] > list[j + 1]:
#             list[j], list[j + 1] = list[j + 1], list[j]
#   return list
# print(bubble_sort([6,7,5,3,8,9,2]))

#5- Guessing game
import random
##initiating a random number , attempts = zero , and an empty array that demonstrates wrong guesses
random_number=random.randint(0,100)
attempts=0
wrong_numbers=[]
##while attempts of user didn't exceed 10 attempts
while attempts<10:
    ##taking the guess of the user
    inp=input("Enter a valid number: ")
    ##checking if input is not a digit
    if not inp.isdigit():
        print("Invalid entry")
    else:
        guess=int(inp)
        ##out of range
        if guess>100:
            print("Out of range! Number should be between 0 and 100.") 
        ##already guessed number
        elif guess in wrong_numbers:
            print("Number already guessed!")
        ##eligible guesses
        else:
            ##right guess
            if guess==random_number :
                print("Congratulations you are right!")
                attempts+=1
                wrong_numbers=[]
                print("Try to guess a new number")
                random_number=random.randint(0,100)
            #wrong guess
            else:
                #guess less than the number
                if(guess<random_number):
                    print("Your guess is less than the number")
                    wrong_numbers.append(guess)
                    attempts+=1
                #guess greater than the number
                else:
                    print("Your guess is grater than the number")
                    wrong_numbers.append(guess)
                    attempts+=1
        ##if user make 10 attempts an invite to play again or end game
        if attempts==9:
            response=input("Do you want to play again?\nRespond with Yes or No: ")
            ##play again -> then restart the variables of attempts and wrong_numbers array
            if response=="Yes"or"Y"or"y"or"yes":
                attempts=0
                wrong_numbers=[]
            ##end game
            else:
                print("Ok see you later!")
##END