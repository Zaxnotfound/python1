
print("This program create a simple movie library system with admin and user access.")
list_UserLogs = []
list_Movies = []

while True:



    userinpt = input("Are you a admin? (Y/N): ")
    if userinpt == "Y" or userinpt == "y":
        username_Admin = input("Enter your Admin name: ")
        password_Admin= input("Enter a Keypass: ")
        if password_Admin == "adminako":
            print(f"Access Granted. Welcome Adminstrator {username_Admin} ")
        elif password_Admin!= "adminako":
            print("Access Denied. Wrong Keypass.")
            break
        while True:
            print("You are signed in as the ADMIN. Please select an option:")
            print("1. View Movie Library")
            print("2. Check User Logs")
            print("3. Add new Movie")
            print("4. Remove Movies")     
            choice = input("Enter your choice (1-4) or 'Exit' to go back: ")

            if choice == "1":
                print("Viewing Movie Library...")
                print("------------------------------------")
                print("Movie Library:")
                print(f"There are currently {len(list_Movies)} Movies")
                for movie in list_Movies:
                    print(f"- {movie}")
                print("------------------------------------")
            elif choice == "2":
                print("Checking User Logs...")
                print("------------------------------------")
                print("User Logs:")
                for log in list_UserLogs:
                    print(log)
                print("------------------------------------")
            elif choice == "3":
                print("------------------------------------")
                print("Add new Movies")
                print(f"There are currently {len(list_Movies)} Movies")
                new_Movie = input("Enter the name of the new movie to add else type 'Exit' to return to main menu: ")
                if new_Movie == "Exit":
                    print("Returning to main menu.")
                else:
                    list_Movies.append(new_Movie)
                    print(f"Movie '{new_Movie}' has been added to the library.")
                    print("------------------------------------")
            elif choice == "4":
                print("------------------------------------")
                print("Remove Movies")
                print(f"Movie available are {list_Movies} in the library")
                remove_Movie = input("Enter the name of the movie to remove else type 'Exit' to return to main menu: ")
                if remove_Movie == "Exit":
                    print("Returning to main menu.")
                elif remove_Movie in list_Movies:
                    list_Movies.remove(remove_Movie)
                    print(f"Movie '{remove_Movie}' has been removed from the library.")
                print('------------------------------------')
            elif choice == "Exit":
                print("Exiting Admin Menu.")
                break
            
    elif userinpt == "N":
        userinpt_Name = input("Enter your User name: ")
        list_UserLogs.append(userinpt_Name)
        password_User = input("Enter your Password: ")
        if password_User == "userAko":
            print(f"Access Granted. Welcome User {userinpt_Name}: ")
        elif password_User != "userAko":
            print("Access Denied. Wrong Password.")
            break

        print(f"Welcome {userinpt_Name} to the Movie Library!")
        user_input = input("Would you like to view the movie library? (Y/N (go back to movie list)): ")
        if user_input == "Y" or user_input == "y":
            print("Viewing Movie Library...")
            print("------------------------------------")
            print("Movie Library:")
            print(f"There are currently {len(list_Movies)} Movies")
            print(f"Movies available are {list_Movies} in the library")
            if len(list_Movies) == 0:
                print("No movies available at the moment.")
            elif len(list_Movies) > 0:
                watch_movie = input("What would movie would you like to watch: ")
                if watch_movie in list_Movies:
                    choice1 = input(f"Enjoy watching {watch_movie}! Would you like to go back? (Y/N): ")
                    if choice1 == "Y" or choice1 == "y":
                        print("Returning to main menu.")
                    elif choice1 == "N" or choice1 == "n":
                        print("Thank you for using the Movie Library. Goodbye!")
            print("------------------------------------")
    elif user_input == "N" or user_input == "n":
            print("Returning to main menu.")
            break