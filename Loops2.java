import java.util.*;
/**
 * Write a description of class Loops here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Loops2
{
   public static void main (String [] args) {
   
       Scanner input = new Scanner (System.in);
     
       int counter=1;
       do {
           System.out.println("Hello, " + counter);
           counter++;
        } while (counter<11);
        
       counter=1;
       while (counter<11) {
           System.out.println("Hello, " + counter);
           counter++;
        }
       
       for (counter=1; counter < 11; counter++){
         System.out.println("Hello, " + counter);
        }
       System.out.println("Thank you for playing!");
   }
}
