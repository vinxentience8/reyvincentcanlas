import java.util.Scanner;
public class CanlasSecondActivity {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in); 
       //Declare
       int numPiz, numTop;
       final double taxAmt = 0.05;
       //Prompt
       System.out.print("Enter the number of pizzas   : ");
       numPiz = in.nextInt();
       System.out.print("Enter the number of toppings : ");
       numTop = in.nextInt();
       
       //Computation
       double regularPizz = numPiz * 12.00;
       double addons = numTop * 1.50;
       double totalPriceNoTax = regularPizz + addons;
       double totalPricewTax = totalPriceNoTax * taxAmt;
       double finalPrice = totalPricewTax + totalPriceNoTax;
       //Display
       System.out.println("\nReceipt: ");
       System.out.println("Number of Pizzas   : " + numPiz);
       System.out.println("Number of Toppings : " + numTop);
       System.out.println("Cost (incl tax)    :$" + finalPrice);
    }
    
}
