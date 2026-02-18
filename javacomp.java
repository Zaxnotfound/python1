package javacompetition;
import java.util.Scanner;

public class javacomp {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);

        System.out.println("Odd or even number checker");
        
        System.out.print("Enter the a number: ");
        int num1 = input.nextInt();

        if (num1 % 2 == 0) {
            System.out.println(num1 + " is an even number.");
        } else {
            System.out.println(num1 + " is an odd number.");
        }
    }
}
