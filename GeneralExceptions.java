
/**
 * Write a description of class GeneralExceptions here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class GeneralExceptions
{
    public static void main (String [] args) {
        int x,y;
     //   if ( args.length ==1) {
           
            try {
                String toConvert=args[0];
                x = Integer.parseInt(toConvert);
                System.out.println("The number typed is: " + x );
               // y=x/0;
            } 
            catch (Exception e) {
               System.out.println ("Something went wrong...");
            }
            System.out.println("End of program");

   //     }
    }
}

