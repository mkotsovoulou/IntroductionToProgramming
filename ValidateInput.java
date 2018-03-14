import java.util.*;
/**
 * Write a description of class ValidateInput here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ValidateInput
{
    public static void main (String [] args) {
        Scanner input = new Scanner(System.in);
        int myNumber=0;
        boolean correctInput=false;
        do {
            System.out.println("Type an integer (from 1 to 10)");
            if (input.hasNextInt()) {
                myNumber=input.nextInt();
                if (myNumber>=1 && myNumber<=10)
                    correctInput=true;
                else {
                    System.out.println("Invalid range! Values only from 1 to 10 are accepted");
                }
            } else {
                input.next();
                System.out.println("You did not type an integer");

            }
        } while ( !correctInput);

        System.out.println("OK! Good Int:" + myNumber);
    }
}
