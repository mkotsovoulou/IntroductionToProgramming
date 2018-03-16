import java.util.*;
import java.text.*;
import java.io.*;
/**
 * Write a description of class WriteToFile here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class WriteToFile
{
    public static void main(String[] args) throws FileNotFoundException
    {
        Date date = new Date(); //Get Today's Date
        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy"); //Format it
        
        Scanner console = new Scanner(System.in);
        // Prompt for the input and output file names
        System.out.println("Enter a filename: ");
        String outputFileName = console.next();

        // Construct PrintWriter object for writing
        PrintWriter out = new PrintWriter(outputFileName); //import java.io.*;
        //Anything you print using the out object will be written to the file!
        out.println(dateFormat.format(date));
        out.println("This is some text");
        out.printf("and %20s also prints formatted output", "the PrintWriter");
        out.close(); //Remember to close the file
       
        System.out.println("Check your file! ");
    }
}
