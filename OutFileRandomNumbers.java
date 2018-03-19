import java.io.*;
import java.util.*;
/**
 * Write a description of class OutFileRandomNumbers here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class OutFileRandomNumbers
{
   public static void main (String [] args) throws FileNotFoundException {
   PrintWriter outFile = new PrintWriter("myData.csv");
   double randomNumbers [][] = new double [100][3]; 
   System.out.println("This program will create a csv file with numbers: myData.csv");
   char delimeter = ',';
   // randomNumbers[0].length -> returns the number of columns in the Array
 
   for (int rows=0; rows<randomNumbers.length; rows++) {
       for (int columns=0; columns < randomNumbers[0].length; columns++) {
           randomNumbers [rows][columns] = Math.random() * 100;
           outFile.printf("%.2f",randomNumbers [rows][columns]);
           outFile.print(delimeter);
        }
        outFile.println();
    }
    outFile.close();
    System.out.println("File is created");
    
   // Arrays.sort(randomNumbers);
    for (int rows=0; rows<randomNumbers.length; rows++) {
    System.out.println(Arrays.toString(randomNumbers[rows]));
}
   }
}
