import java.util.Scanner;

public class oddEvenNum {
	public static void main(String[] args) {
	Scanner input =new Scanner(System.in);
	System.out.print("Enter an integer: ");
	int i = input.nextInt();
	
	String result = (i %2 == 0)? "The Number is Even":"The Number is Odd";
	System.out.print(result + " is " + i);
   }
}
	