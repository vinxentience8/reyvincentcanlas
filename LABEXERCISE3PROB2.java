import java.util.Scanner;
public class LABEXERCISE3PROB2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //Declare
        System.out.print("Enter the driving distance: ");
        double distance = in.nextDouble();
        System.out.print("Enter miles per gallon    : ");
        double Mgallon = in.nextDouble();
        System.out.print("Enter price per gallon    : ");
        double Pgallon = in.nextDouble();
        
        //Calculate
        double cost =  (distance / Mgallon) * Pgallon;
        
        //Display
        System.out.printf("The cost of driving is   : $%.2f", cost);
    }
    
}
