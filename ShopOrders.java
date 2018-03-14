import java.util.*;
/**
 * ShopOrders program displays a coffee shop menu
 * accepts orders, calculates and displays the price.
 *
 * @author Maira Kotsovoulou
 * @version 14/2/2018
 */
public class ShopOrders
{
    static Scanner input = new Scanner (System.in);
       
        
    public static void main (String args[]) {   
        
        bou();
        final double SODA_PRICE = 0.60;
        final double COFFEE_PRICE = 1.20;
        final double TEA_PRICE = 0.80;
        final double TOAST_PRICE = 1.10;
        double total_cost=0;
        int quantity=0;
        int choice=0;
        boolean correctInput=false;
        System.out.println("MENU: 1. Soda, 2.Coffee, 3. Tea, 4. Toast, 5. Finish");
        do {
            System.out.println("Make your Choice (1-5):");
            if (input.hasNextInt()) {
                choice=input.nextInt();
                switch (choice) {
                    case 1: total_cost+=order(SODA_PRICE);break;
                    case 2: total_cost+=order(COFFEE_PRICE);break;
                    case 3: total_cost+=order(TEA_PRICE);break;
                    case 4: total_cost+=order(TOAST_PRICE);break;
                    case 5: System.out.println("Total Cost:" + total_cost);bou();System.exit(0);
                    default: System.out.println("Invalid Choice! Options in the menu are 1,2,3,4,5");
                }
                System.out.println("Cost up to now is: " + total_cost);
            } else {
                input.next();
                System.out.println("You did not type an integer");
            }
        } while ( !correctInput);
    }
    
    
    public static double order(double PRICE) {
    boolean correctInput=false;
    double temp_price;
    int quantity=0;
    System.out.println("Unit price is: " + PRICE + " How many do you want?");
    do {
        if (input.hasNextInt()) {
           quantity=input.nextInt();
           correctInput=true;
        } else {
          input.next();
          System.out.println("You did not type an integer");
        }
    }while (!correctInput);
    
    temp_price = quantity * PRICE;
    return temp_price;
}


public static void bou () {

System.out.println("Thank you for using ORDER APP");
System.out.println("Made by COFFEE shops.UK");

}

}