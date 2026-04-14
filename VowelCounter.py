string = "hippopotamus"
vowelcount = 0

for i in string:
    if i in "AEIOUaeiou":
        vowelcount += 1
print("there are " + str((vowelcount)) + " vowels in the string")