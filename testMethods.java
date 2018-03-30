
/**
 * Write a description of class testMethods here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class testMethods
{
    public static void main (String args[]) {   
        findMax(3,1);
        findMax(3.2,1.4);
        findMax("anna", "john");
    }
    
    /**
     * This method finds the greater number between two numbers.
     * 
     * @param a    an <code>int</code> which will be compared to the other parameter
     * @param b    another <code>int</code> which will be compared to the previous one
     * @return    an <code>int</code> which is the greatest number of the two
     * @see        Math.max
     */
    public static int findMax(int a, int b) {
        if (a>b)
            return a;
        else 
            return b;
    }
    
    
     /**
     * This method finds the greater number between two numbers.
     * 
     * @param a    an <code>int</code> which will be compared to the other parameter
     * @param b    another <code>int</code> which will be compared to the previous one
     * @return    an <code>int</code> which is the greatest number of the two
     * @see        Math.max
     */
    public static double findMax(double a, double b) {
        if (a>b)
            return a;
        else 
            return b;
    }
    
     public static String findMax(String a, String b) {
        if (a.compareTo(b) > 0 )
            return a;
        else 
            return b;
    }
}
