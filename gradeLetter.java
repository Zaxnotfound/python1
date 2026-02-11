import java.util.Scanner;

public class gradeLetter {
	public static void main(String[] args){ 
	Scanner sc =new Scanner(System.in);
	
	System.out.print("Please enter grade letter: ");
	char gradeLetter = sc.next().charAt(0);
	
	switch (gradeLetter) {
	case 'A': 
	System.out.print("Excellent!");
	break;
	case 'B':
	System.out.print("Good Job!");
	break;
	case 'C': 
	System.out.print("Fair");
	break;
	case 'D': 
	System.out.print("needs improvement");
	break;
	case 'F': 
	System.out.print("Failed");
	break;
	default: 
	System.out.print("Invalid grade");
	}
  }
}