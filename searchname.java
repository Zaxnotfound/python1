package javacompetition;

import java.util.Scanner;
public class searchname {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);

        String[] names = {"Alice", " bob", "Lance", "Charlie", "David"};
        System.out.print("Enter a name to search: ");
        String searchName = input.nextLine(); 
        boolean found = false;

        for ( int i = 0; i < names.length; i ++) {
            if ( names[i].equalsIgnoreCase(searchName)) {
                found = true;
                break;
            }
        }
        if(found) {
            System.out.print(searchName + " is found in the array.");
        } else {
            System.out.print(searchName + " is not found in the array.");
        }
    }
}
