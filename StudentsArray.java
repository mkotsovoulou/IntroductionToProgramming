import java.util.*;
/**
 * This program creates an Array with 20 student names
 * entered by the user.
 *
 * @author Maira Kotsovoulou
 * @version 5 March 2018
 */
public class StudentsArray
{
   public static void main (String [] args) {
       Scanner input = new Scanner(System.in);
       
       String [] classList = new String [5];
       
       //loop through the classList array
       for (int i=0; i<classList.length;i++) {
         //ask the user to type student i name 
         System.out.println("Type student " + (i+1) + " name:");
         classList[i] = input.nextLine();
        }
       //print the classList array using one line of code
       System.out.println(Arrays.toString(classList));
       classList = swap(classList);
       System.out.println(Arrays.toString(classList));
   }
   
   /**
    * This method swaps the first and the last element of an array and 
    * returns the changed array.
    * 
    * @param String[] The array which will be used to swap its elements
    * @return String[] The changed array
    */
   public static String[]  swap(String [] temp) {
       int lastElement = temp.length-1;
       String tempHolder = temp[0];
       temp[0] = temp[lastElement];
       temp[lastElement] = tempHolder;
       return temp;
   }
   
}
