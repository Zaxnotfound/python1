import java.util.Scanner;
public class todayTemp {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.print("Enter the tempearture: ");
        double temp = input.nextDouble();

        if (temp >= 30) {
            System.out.println("Its a hot day");
        } else if (temp < 30) {
            System.out.println("Its a cold day");
        }
    }
}
