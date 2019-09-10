import java.util.Scanner;
public class LABEXERCISE2Prob2 {
    public static void main(String[] args) {
       Scanner in = new Scanner(System.in);
       //Declare
       int n1, n2, n3, n4, n5, n6, n7 ,n8, n9, n10;
       System.out.println("Enter 1st number: ");
       n1 = in.nextInt();
       System.out.println("Enter 2nd number: ");
       n2 = in.nextInt();
       System.out.println("Enter 3rd number: ");
       n3 = in.nextInt();
       System.out.println("Enter 4th number: ");
       n4 = in.nextInt();
       System.out.println("Enter 5th number: ");
       n5 = in.nextInt();
       System.out.println("Enter 6th number: ");
       n6 = in.nextInt();
       System.out.println("Enter 7th number: ");
       n7 = in.nextInt();
       System.out.println("Enter 8th number: ");
       n8 = in.nextInt();
       System.out.println("Enter 9th number: ");
       n9 = in.nextInt();
       System.out.println("Enter 10th number: ");
       n10 = in.nextInt();
       
       //Compute
       int running2 = n1+ n2;
       int running3 = running2 + n3;
       int running4 = running3 + n4;
       int running5 = running4 + n5;
       int running6 = running5 + n6;
       int running7 = running6 + n7;
       int running8 = running7 + n8;
       int running9 = running8 + n9;
       int running10 = running9 + n10;
       
       //Display
       System.out.println("Running Sum : " + n1 + " " + running2 + " " + " " + running3 + " "+ running4 + " "+ running5 + " "+ running6 + " "+ running7 + " "+ running8 + " " +running9 + " "+ running10);
    }
    
}
