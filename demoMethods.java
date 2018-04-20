import java.util.*;
/**
 * Write a description of class demoMethods here.
 *
 * @author Maira Kotsovoulou
 * @version 20/4/2018
 */
public class demoMethods
{
   public static void main (String [] args) {
    
       String s3=printName("Maira","Papadopoulou");
       System.out.println(s3);
}
   
   /**
    * This method accepts two Strings (firstName and lastName)
    * and returns a new String with the First letter of the firstName
    * and the LastName.
    * 
    * @param String first
    * @param String last
    * @return String
    */
   
   public static String printName(String first, String last) {
  
    return first.charAt(0) + ". " + last;
    
    } 
   
   
}
