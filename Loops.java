import java.util.*;
/**
 * Write a description of class Loops here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Loops
{
   public static void main (String [] args) {
   
       Scanner input = new Scanner (System.in);
       String answer;
       
       do {
           System.out.println("Hello");
           System.out.println("Print another Hello? (Y/N)");
           answer = input.next();
        } while (answer.equalsIgnoreCase("Y"));
        
       System.out.println("Thank you for playing!");
   }
}
