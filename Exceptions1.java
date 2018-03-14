
/**
 * Write a description of class Exceptions1 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Exceptions1
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
            catch (NumberFormatException nfe) {
                System.out.println("That was not a number!!!");
            }
            catch (ArithmeticException ae) {
                System.out.println("A division by zero was attempted");
            }
            catch (ArrayIndexOutOfBoundsException aobe) {
                System.out.println("You did not provide any command line arguments");
            } finally {
            System.out.println("Finally!!!");
            }
            
            System.out.println("End of program");

   //     }
    }
}
