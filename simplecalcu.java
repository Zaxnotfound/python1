package javacompetition;

import java.util.Scanner;
public class simplecalcu  {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Simple Calculator");

        System.out.print("Enter the first number: ");
        double num1 = input.nextDouble();
        System.out.print("Enter the second number: ");
        double num2 = input.nextDouble();

        System.out.println("Choose an operator: +, -, *, /");
        char operator = input.next().charAt(0);

        switch(operator) {
            case '+':
                System.out.println(num1 + " +  " + num2 + " = " + (num1 + num2));
                break;
            case '-':
                System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));
                break;
            case '*':
                System.out.println(num1 + " * " + num2 + " = " + (num1 * num2));
                break;
            case '/':
                if (num2 != 0) {
                    System.out.println(num1 + " / " + num2 + " = " + (num1 / num2));
                } else {
                    System.out.print("Division from zero is unavailable");
                }
                break;
            default: 
            System.out.println("invalid operator");
        }
        
    }
}