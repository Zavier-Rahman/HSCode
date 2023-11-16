import time
def wordle(word):
    print("Welcome to wordle!")
    print("Guess the 5 letter word in 6 tries")
    print("The symbol will indicate the accuracy of the letter.")
    print("* means the letter is in the word and in the correct spot.")
    print("+ means the letter is in the word but in the wrong spot")
    print("- means the letter in not in the word at all.")
    
    attempts = 0
    for i in range(6): # The limited attempts for the game 
        acc = ""
        if acc != "*****":
            inp = guess()
            for x in range(5): # checking which letters match
                if inp[x] == word[x]:
                    acc += "*"

                elif inp[x] in word:
                    acc += "+"

                else:
                    acc += "-"
                print(acc)
                time.sleep(0.5)
            attempts += 1

            print(inp)
            if inp != word:
                time.sleep(1)
                print("")
                print(i+1, "out of 6 attempts")
        
        if inp == word: 
            time.sleep(1)
            print("\nCorrect!")
            if attempts == 6:
                print("phew!")
            print("You got it in", attempts, "out of 6 attempts!")
            break
  
def guess():
    wd = input("Type in a 5 letter word>> ")
    if len(wd) == 5:
        return wd
    else:
        print("Word is not exactly 5 letters long")
        print("try again.")
        return guess()

tp = input("in cmd?>> ")  

wordle("plain")  

      
if tp == "yes":
    time.sleep(5)
