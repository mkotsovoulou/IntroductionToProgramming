
/**
 * The purpose of this program is to teach
 * primitive datatypes and the if statement.
 *
 * @author Maira Kotsovoulou
 * @version 0.1 24/01/2018
 */
public class demo
{
    public static void main (String [] args) {
        // Primitive Datatypes
        int x=12;
        int z=33;
        boolean ok=true;
        char initial = 'A'; //Single Quotes ONLY
        double y = 6.4;
        // Complex Datatype : Class 
        String name = "Maira"; //Double Quotes ONLY

        if (x>=129 && y<6.4) {
            System.out.println("TRUE");
        } else if (x>=129){
            System.out.println("FALSE");
        }else {
             System.out.println("FALSE");
        }

        if (!ok) {
            System.out.println("Result:");
            System.out.println("Ok is false");
        }
        else {
            System.out.println("Result:");
            System.out.println("Ok is true");
        }

        if (initial == 'A' || initial == 'a') {
            System.out.println("Result:");
            System.out.println("First in the alphabet");
        }
        else  {
            System.out.println("NOT First in the alphabet");
        }

    }
}
