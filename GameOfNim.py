"""
#Game of Nim
#By Zavier Rahman
"""
import random
print("Welcome to the game of Nim")
stones = random.randrange(10,60)
print("We will flip a coin to decide who goes first.")
cf = random.randrange(1,3)
pf = input("Heads or Tails?>> ")
s = 0
if cf == 1: #player loses flip; computer goes first
    if pf == "tails":
        print("Computer goes first")
        s = 1   #Computer is going first when s is 1
    else:
        print("Player goes first")
        s = 2
if cf == 2: #Computer loses flip; player goes first
    if pf == "heads":
        print("Player goes first")
        s = 2   #Player goes first when s is 2
    else:
        print("Computer goes first")
        s = 1
print("You have",stones,"starting stones.")
while stones > 0:   #lines after is the game
    if s == 1:  #Computer goes first
        if stones > 1:
            sct = random.randrange(1,3)
            if stones < 5:
                sct = 1
            stones = stones - sct
            print("Computer took",sct,"Stone(s)")
            a = 0
        if stones > 1:
            spt = int(input("How many stones do you want to take?>> "))
        if spt > 2 or spt < 1:
            print("INVALID ANSWER: You can only pick up a max of 2 stones and a minimum of 1 stone.")
            spt = int(input("How many stones do you want to take?>> "))
        else:
            stones = stones - spt
            a = 1
    if s == 2:  #Player goes first
        if stones > 1:
                spt = int(input("How many stones do you want to take?>> "))
        if spt > 2 or spt < 1:
            print("INVALID ANSWER: You can only pick up a max of 2 stones and a minimum of 1 stone.")
            spt = int(input("How many stones do you want to take?>> "))
        else:
            stones = stones - spt
            a = 1
        if stones > 1:
            sct = random.randrange(1,3)
            if stones < 5:
                sct = 1
            stones = stones - sct
            print("Computer took",sct,"Stone(s)")
            a = 0
    if stones <= 10 and stones >= 8:
        print("WARNING: you have 10 stones left, or less.")
if stones <= 0:
    if a == 0:  #Means player wins
        print("You win!")
    if a == 1:  #Means Computer wins
        print("You lost; computer won.")          
