import java.io.*;
import java.util.*;
/**
 * Write a description of class MenuWithFile here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class MenuWithFile
{
    
    static int [] grades = new int[10];
    static Scanner consoleInput = new Scanner(System.in);
    
    public static void main (String [] args) throws FileNotFoundException{
    
        int choice;
      
        boolean correctInput=false;
        while (true) {
        System.out.println("----- MAIN MENU -----");
        System.out.println("1. Load a file");
        System.out.println("2. Display the sorted grades");
        System.out.println("3. Calculate and display the average");
        System.out.println("4. Display all grades which are greater than a number");
        System.out.println("5. Exit");
        System.out.println("----------------------");
       
            System.out.println("Make your choice: ");

            while (!consoleInput.hasNextInt()){ //kind of reads the input 
                System.out.println("Not an integer");
                consoleInput.next();
            }
            choice = consoleInput.nextInt(); 

        switch (choice) {
        case 1: loadFile(); break;
        case 2: sortData(); break;
        case 3: calcAvg(); break;
        case 4: findGrades(); break;
        case 5: System.exit(0);
        default: System.out.println("Not a valid choice! Try again.");
        }
    }  
    }
    
    public static void loadFile() throws FileNotFoundException{
      File f = new File("grades.txt");
      Scanner fileInput = new Scanner(f);
      System.out.println("Here I will write the code to load the file");
    }
    
     public static void sortData() {
      System.out.println("Here I will write the code to sort the data");
    }
    
     public static void findGrades() {
      System.out.println("Here I will write the code to find");
    }
    
     public static void calcAvg() {
      System.out.println("Here I will write the code to lead the file");
    }
    
}
