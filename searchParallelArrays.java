import java.util.*;
/**
 * Write a description of class searchParallelArrays here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class searchParallelArrays
{
   public static void main (String [] args) {
    Scanner input = new Scanner (System.in);
    
    String names[] = {"Mary", "Nick", "John", "Steve"};
    int grades[]   = {80,20,99,65};
    System.out.println("Type a name to search for :");
    String searchFor = input.next();
    boolean found=false;
    for (int i=0; i<names.length; i++) {
       if (names[i].equalsIgnoreCase(searchFor)) {
          System.out.println(names[i] + "  " + grades[i]);
          found=true;
        }
    }
    
    if (!found) System.out.println("Name not found in the list");
   
   }
}
