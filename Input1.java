import java.util.*;
/**
 * Write a description of class Input1 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Input1
{
   public static void main (String [] args) {
   Scanner input = new Scanner(System.in);
   String username = new String("Maira");
   
   double weight =54;
   System.out.println(weight);
   int height;
   
   System.out.println("Enter your name:");
   username=input.nextLine(); 
   //nextLine = Read a String until  ENTER is pressed
   //next = will read a String until the first space
   System.out.println("Enter your height in cm:");
   height = input.nextInt();
   //nextInt = Read an integer
   System.out.println("you typed : " + height);
   
   System.out.println("Enter your weight in kg:");
   weight = input.nextDouble();
   //nextDouble = Read a double number (with decimals)
   System.out.println("you typed : " + weight);
   
   
   }
}
