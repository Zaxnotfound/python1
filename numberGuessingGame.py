import random

print("Welcome to the number guessing game!")
print("i will be thinking of a number between 1 to 100")
print("you will have the choice how many attempts you want to guess my number!")

num = random.randint(1, 100)

print("1. Easy Level: 20 attempts")
print("2. Medium Level: 10 attempts")
print("3. Hard Level: 5 attempts")

level_choosen = input("How many attempts do you want to guess my number: ")


while True:
    if level_choosen == "1":
        print("You have chosen Easy Level")
        print("You have 20 attempts to guess my number")
        attempt = 20
        for i in range(attempt):
            print(f"you have {attempt - i} attempts left")
            if i == attempt - 1:
                print(f"Sorry! you have used all your attempts. The number was {num}")
                break
            guess = int(input("Enter your guess: "))
            if guess < num:
                print("nyakk Too Low!")
            elif guess > num:
                print("nyakk Too High!")
            else:
                print("Congrats! u guessed it!")
                break
    elif level_choosen == "2":
        print("You have chosen Medium Level")
        print("You have 10 attempts to guess my number")
        attempt = 10
        for i in range(attempt):
            print(f"you have {attempt - i} attempts left")
            if i == attempt - 1:
                print(f"Sorry! you have used all your attempts. The number was {num}")
                break
            guess = int(input("Enter your guess: "))
            if guess < num:
                print("nyakk Too Low!")
            elif guess > num:
                print("nyakk Too High!")
            else:
                print("Congrats! u guessed it!")
                break
    elif level_choosen == "3":
        print("You have chosen Hard Level")
        print("You have 5 attempts to guess my number")
        attempt = 5
        for i in range(attempt):
            print(f"you have {attempt - i} attempts left")
            if i == attempt - 1:
                print(f"Sorry! you have used all your attempts. The number was {num}")
                break
            guess = int(input("Enter your guess: "))
            if guess < num:
                print("nyakk Too Low!")
            elif guess > num:
                print("nyakk Too High!")
            else:
                print("Congrats! u guessed it!")
                break