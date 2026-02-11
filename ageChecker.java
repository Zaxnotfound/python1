import java.util.Scanner;
public class ageChecker {
	public static void main (String[] args) {

	Scanner input =new Scanner(System.in);

	System.out.print("Enter your age: ");
	int age = input.nextInt();
	
	if (age >= 18) {
            System.out.println("your are at legal age");
        } else {
            System.out.println("Your are a minor");
        }
   }
}