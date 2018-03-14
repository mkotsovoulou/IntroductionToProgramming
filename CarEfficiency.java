import java.util.Scanner;
/**
 * Write a description of class CarEfficiency here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class CarEfficiency
{  //MAIN METHOD is like a procedure: IT DOES NOT RETURN ANYTHING 
   public static void main (String [] args) { 
   
   double cost1;
   double cost2;
   System.out.println("Calculating cost for car 1");
   cost1 = calculateCarCost ();
   System.out.println("CAR 1 total cost is : " + cost1);
   System.out.println("Calculating cost for car 2");
   cost2 = calculateCarCost ();
   System.out.println("CAR 2 total cost is : " + cost2);
   
   if (cost1 > cost2) 
      System.out.println("CAR 2 is cheaper");
   else if (cost1<cost2)
    System.out.println("CAR 1 is cheaper");
   else System.out.println("Both cars are the same");
   }
   
   public static double calculateCarCost () {
       int annualMilesDriven = 15000;
       int pricePerGallon = 4;
       int years=10;
       double fuelEfficiency=0;
       double purchasePrice=0;
       double annualFuelConsumed, annualFuelCost, operatingCost, totalCost;
       purchasePrice = readAndValidateDouble("Enter Car purchase price");
       fuelEfficiency = readAndValidateDouble("Enter Car fuel Efficiecy");
       
       annualFuelConsumed = annualMilesDriven / fuelEfficiency;
       annualFuelCost = pricePerGallon * annualFuelConsumed;
       operatingCost = years * annualFuelCost;
       totalCost = purchasePrice + operatingCost;
       return totalCost;
    
   }
   
   
   
   public static double readAndValidateDouble(String message) {
       Scanner input = new Scanner(System.in);
       double number=0;
         System.out.println(message);
         if (input.hasNextDouble()) {
            number= input.nextDouble();
          if (number <= 0) {
              System.out.println("Only positive numbers are valid.");
              System.exit(0);
            }
        } else {
        System.out.println("You did not type a number " + input.next());
        System.out.println("Please re-run the program");
        System.exit(0);
        }
       return number;
    }
}
