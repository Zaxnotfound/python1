import java.util.Scanner;

public class discount {
public static void main(String[] args) {
Scanner input =new Scanner(System.in);
System.out.println("up to 2000 price will have a discount of 20" +  "%");
System.out.print("Enter price: ");
double OGprice = input.nextDouble();

double discount = 20.0;
double discountPercent = discount / 100;
double discountedAmount =  OGprice * discountPercent;
double finalPrice = OGprice - discountedAmount;
double discountedPrice = OGprice - discount;


System.out.println("Orginal ammount: " + OGprice);
String totalprice = (OGprice >= 2000) ? "Discounted applied: Yes\n Final Pay: " + finalPrice :
                                                                "Discoutned applied: No.\n Final Pay: " + OGprice;
                                                                  
System.out.println(totalprice);

}
}