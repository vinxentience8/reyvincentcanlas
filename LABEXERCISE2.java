import java.util.Scanner;
public class LABEXERCISE2 {
    public static void main(String[] args) {
       Scanner in = new Scanner(System.in);
       //Declare
       final double inTax = 0.15, stax = 0.035, sstax = 0.0575, mtax = 0.0275, pplan = 0.05, hinsure = 75.0, npay;
       
       //Prompt
       System.out.println("Enter your name: ");
       String name = in.nextLine();
       System.out.println("Gross Amount: ");
       double gAMT = in.nextDouble();
       
       //Calculate
       double npayVal =  gAMT * inTax;
       double staxVal = stax * gAMT;
       double sstaxVal = sstax * gAMT;
       double mtaxVal = mtax * gAMT;
       double pplanVal = pplan * gAMT;
       npay = gAMT - (npayVal + sstaxVal + staxVal + mtaxVal + pplanVal + hinsure);
       
       
       //Display
       System.out.println(name);
       System.out.printf("Gross Amount          : $%.2f", gAMT);
       System.out.printf("\nFederal Tax           : $%.2f", npayVal);
       System.out.printf("\nState Tax             : $%.2f", staxVal);
       System.out.printf("\nSocial Security Tax   : $%.2f", sstaxVal);
       System.out.printf("\nMedicare/Medicaid Tax : $%.2f", mtaxVal);
       System.out.printf("\nPension Plan          : $%.2f", pplanVal);
       System.out.printf("\nHealth Insurance      : $%.2f", hinsure);
       System.out.printf("\nNet Pay               : $%.2f", npay);
       
       
    }
    
}
