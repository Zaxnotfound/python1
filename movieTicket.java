import java.util.Scanner;

public class movieTicket {
public static void main (String[] args) {
Scanner input =new Scanner(System.in);
System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
System.out.println("HELLO AND WELCOME TO THE MOVIE TICKETING SYSTEM!");

String userName = " ";
String[] movieName = {"Shell", "Good Boy", "The Shadow's Edge", "The Last BeerGin", "Minamahal"};
String[] cinemaList = {"Cinema 1", "Cinema 2", "Cinema 3", "Cinema 4", "Cinema 5"};
String cinema = " ";
String seats = " ";
String userEmail = " ";
String payment = " ";
int userPass = 0;
int userNum  = 0;
double[] moviePrice = {50.0, 75.0, 50.0, 80.0, 50.0};
int movieSelect = 0;
int accountNum = 0;
String confirmation = " ";


//Start of the program where user will be loging in or registring in.
System.out.println("Would you like to Login or Register?");
String loginRegister = input.nextLine();

switch (loginRegister) {
//where user register
case "Register":
System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
   System.out.println("Welcome to the Register page!");

   System.out.print("Please enter your email: ");
   userEmail = input.nextLine();

   System.out.print("please enter your Name: ");
   userName = input.nextLine();

   System.out.print("Please put your Phone number: ");
   userNum = input.nextInt();

   System.out.print("Please enter your password: ");
   userPass = input.nextInt();
System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
break;

//where user wants to log in
case "Login": 
System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
   System.out.println("Welcome to the Login page!");

   System.out.print("please enter your Name: ");
   userName = input.nextLine();

   System.out.print("please enter your Password: ");
   userPass = input.nextInt();
System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
break;

default: 
System.out.println("Error no in the choices.");

input.close();
}


//Movie selection
System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
   System.out.println("Welcome " + userName + "!");

   
//Movie list
   System.out.println("1. " + movieName[0]);
   System.out.println("2. " + movieName[1]);
   System.out.println("3. " + movieName[2]);
   System.out.println("4. " + movieName[3]);
   System.out.println("5. " + movieName[4]);

   System.out.println("What movie would you like to watch? (Please enter the number only)");
   movieSelect = input.nextInt();

System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

//information/price of the movie
switch(movieSelect) {
case 1:
System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
   System.out.println("You have choosen: Shell(2025)");
   System.out.println("Duration: 1 hours and 40 minutes");
   System.out.println("Movie Genre: Horror, Thriller");
   System.out.println("Released on: October 3, 2025");
   System.out.println("Movie time available:\n12:30PM\n2:45PM\n5:00PM\n7:15PM"); 
   System.out.println("Ticket Price: $" + moviePrice[0] );

//confirmation payment
   System.out.println("Do you want to purchase this ticket?");
   confirmation = input.nextLine();
   if (confirmation.equalsIgnoreCase("Yes")) {
    System.out.print("You may proceed to selection of cinema");
} else if (confirmation.equalsIgnoreCase("No")) {
    System.out.print("Please select another");
System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
}

break;

case 2:
System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
   System.out.println("You have choosen: Good Boy");
   System.out.println("Duration: 1 hours and 13 minutes");
   System.out.println("Movie Genre: Horror");
   System.out.println("Released on: October 3, 2025");
   System.out.println("Movie time available:\n1:15PM\n3:00PM\n4:45PM\n6:30PM"); 
   System.out.println("Ticket Price: $" + moviePrice[1]);

//confirmation payment
   System.out.println("Do you want to purchase this ticket?");
   confirmation = input.nextLine();
   if (confirmation.equalsIgnoreCase("Yes")) {
    System.out.print("You may proceed to selection of cinema");
} else if (confirmation.equalsIgnoreCase("No")) {
    System.out.print("Please select another");
System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
}

break;

case 3:
System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
   System.out.println("You have choosen: The Shdow's Edge");
   System.out.println("Duration: 2 hours and 23 minutes");
   System.out.println("Movie Genre: Action, Drama, Thriller, Crime film, Action Thriller");
   System.out.println("Released on: August 3, 2025");
   System.out.println("Movie time available:\n11:30PM\n2:30PM\n5:30PM\n8:30PM"); 
   System.out.println("Ticket Price: $" + moviePrice[2]);

//confirmation payment
   System.out.println("Do you want to purchase this ticket?");
   confirmation = input.nextLine();
   if (confirmation.equalsIgnoreCase("Yes")) {
    System.out.print("You may proceed to selection of cinema");
} else if (confirmation.equalsIgnoreCase("No")) {
    System.out.print("Please select another");
System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
}

break;

case 4:
System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
   System.out.println("You have choosen: The Last BeerGin");
   System.out.println("Duration: 1 hours and 32 minutes");
   System.out.println("Movie Genre: Drama-Comedy");
   System.out.println("Released on: October 1, 2025");
   System.out.println("Movie time available:\n12:45PM\n5:30PM\n8:00PM"); 
   System.out.println("Ticket Price: $" + moviePrice[3]);

//confirmation payment
   System.out.println("Do you want to purchase this ticket?");
   confirmation = input.nextLine();
   if (confirmation.equalsIgnoreCase("Yes")) {
    System.out.print("You may proceed to selection of cinema");
} else if (confirmation.equalsIgnoreCase("No")) {
    System.out.print("Please select another");
System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
}

break;

case 5:
System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
   System.out.println("You have choosen: Minamahal");
   System.out.println("Duration: 1 hours and 57 minutes");
   System.out.println("Movie Genre: Romance, Comedy, Drama");
   System.out.println("Released on: September 24, 2025");
   System.out.println("Movie time available:\n3:15PM"); 
   System.out.println("Ticket Price: $" + moviePrice[4]);

//confirmation payment
   System.out.println("Do you want to purchase this ticket?");
   confirmation = input.nextLine();
   if (confirmation.equalsIgnoreCase("Yes")) {
    System.out.print("You may proceed to selection of cinema");
} else if (confirmation.equalsIgnoreCase("No")) {
    System.out.print("Please select another");
System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");   
}

break;

default: 
   System.out.print("Error, Not in the list.");
}

input.nextLine();


//Cinema selection
System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
System.out.println("Cinema list");
System.out.println("Cinema 1");
System.out.println("Cinema 2");
System.out.println("Cinema 3");
System.out.println("Cinema 4");
System.out.println("Cinema 5");
System.out.println("Please select your cinema");
cinema = input.nextLine();
System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

switch (cinema) {
   case "Cinema 1": 
   System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
   System.out.println("You have choosen cinema 1");
   System.out.println("Sits available: 8");
   System.out.println("| A1 | Taken | A3 | Taken | Taken | A6 |\n| Taken | Taken | Taken | B5 | Taken | B6 |\n| C1 | Taken | Taken | Taken | C5 | C6 |\n");

   //choosing of seats
   System.out.println("Which seat would you like to choose?");
   seats = input.nextLine();
   if (seats.equals("A1") || seats.equals("A3") || seats.equals("A6") || seats.equals("B5") || seats.equals("B6") || seats.equals("C1") || seats.equals("C5") || seats.equals("C6")) {
    System.out.println("You have choosen " + seats + " as your seat. This will be added to your receipt.");   
   }else {
    System.out.println("Error, not in the list.");
   }
   System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
break;

   case "Cinema 2": 
   System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
   System.out.println("You have choosen cinema 1");
   System.out.println("Sits available: 7");
   System.out.println("| Taken | A2 | A3 | A4 | Taken | Taken |\n| Taken | Taken | Taken | Taken | Taken | Taken |\n| C1 | Taken | C13 | Taken | C5 | C6 |\n");

   System.out.println("Which seat would you like to choose?");
   seats = input.nextLine();
   if (seats.equals("A2") || seats.equals("A3") || seats.equals("A4") || seats.equals("C1") || seats.equals("C3") || seats.equals("C5") || seats.equals("C6")) {
    System.out.println("You have choosen " + seats + " as your seat. This will be added to your receipt.");   
   } else {
    System.out.println("Error, not in the list.");
   }
   System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
break;

   case "Cinema 3": 
   System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
   System.out.println("You have choosen cinema 1");
   System.out.println("Sits available: 7");
   System.out.println("| A1 | Taken | A3 | Taken | Taken | A6 |\n| Taken | Taken | Taken | B4 | Taken | B6 |\n| C1 | Taken | Taken | Taken | C5 | C6 |\n");

   System.out.println("Which seat would you like to choose?");
   seats = input.nextLine();
   if (seats.equals("A1") || seats.equals("A3") || seats.equals("A6") || seats.equals("B4") || seats.equals("B6") || seats.equals("C1") || seats.equals("C5") || seats.equals("C6")) {
    System.out.println("You have choosen " + seats + " as your seat. This will be added to your receipt.");   
   } else {
    System.out.println("Error, not in the list.");
   }
   System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
break;

   case "Cinema 4": 
   System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
   System.out.println("You have choosen cinema 1");
   System.out.println("Sits available: 10");
   System.out.println("| Taken | A2 | Taken | A4 | A5 | Taken |\n| B1 | B2 | B3 | Taken | B5 | Taken |\n| C1 | Taken | Taken | Taken | C5 | C6 |\n");

   System.out.println("Which seat would you like to choose?");
   seats = input.nextLine();
   if (seats.equals("A2") || seats.equals("A4") || seats.equals("A5") || seats.equals("B1") || seats.equals("B2") || seats.equals("B3") || seats.equals("B5") || seats.equals("C1") || seats.equals("C5") || seats.equals("C6")) {
    System.out.println("You have choosen " + seats + " as your seat. This will be added to your receipt.");   
   } else {
    System.out.println("Error, not in the list. ");
   }
   System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
break;

   case "Cinema 5": 
   System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
   System.out.println("You have choosen cinema 1");
   System.out.println("Sits available: 8");
   System.out.println("| A1 | Taken | A3 | Taken | Taken | A6 |\n| Taken | Taken | B3 | Taken | Taken | B6 |\n| C1 | Taken | Taken | Taken | C5 | C6 |\n");
   
   System.out.println("Which seat would you like to choose?");
   seats = input.nextLine();
   if (seats.equals("A1") || seats.equals("A3") || seats.equals("A6") || seats.equals("B3") || seats.equals("B6") || seats.equals("C1") || seats.equals("C5") || seats.equals("C6")) {
    System.out.println("You have choosen " + seats + " as your seat. This will be added to your receipt.");   
   } else {
    System.out.println("Error, not in the list.");
   }
   System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
break;
default:
   System.out.println("Error, not in the list.");
}

//confirmation of the whole transactionq
System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
System.out.println("Are you okay with your selection?\n " + "Movie: " + movieName[movieSelect - 1] + "\n Cinema: " + cinema + "\n Seat: " + seats + "\n Price: $" + moviePrice[movieSelect - 1]);
confirmation = input.nextLine();
if (confirmation.equalsIgnoreCase("yes")) {
      System.out.println("what kind of payment would you like to use?\n Gcash\n PayMaya\n Credit Card\n Debit Card");
      payment = input.nextLine();
      System.out.print("You have choosen " + payment + " as your payment method. Please your " + accountNum + " account number.");
      accountNum = input.nextInt();
} else {
      System.out.println("Error. Invalid input.");
} 
System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
input.close();


System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
System.out.println("RECEIPT");
System.out.println("Name: " + userName);
System.out.println("Movie: " + movieName[movieSelect - 1]);
System.out.println("Cinema: " + cinema);
System.out.println("Seat: " + seats);
System.out.println("Price: $" + moviePrice[movieSelect - 1]);
System.out.println("Payment Method: " + payment);
System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

}
}
