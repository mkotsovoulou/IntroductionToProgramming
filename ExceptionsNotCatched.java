import java.util.*;

/**
 * Integer numbers in java do not have an infinity and/or NaN value in set 
 * whereas floating point numbers have a infinity and  NaN value. 
 * (According to IEEE 754 standards that java follows)
 * Division by Zero will throw an exception for integers 
 * but give a result of INFINITY for floating point numbers. 
 * If you want to force java throw an Exception you can do so manually...
 * 
 *
 * @author Maira Kotsovoulou
 * @version (a version number or a date)
 */
public class ExceptionsNotCatched
{
    public static void main (String args[]) {
    
    Scanner input = new Scanner (System.in);
    System.out.println("Type a number:");
    int answer = input.nextInt();
    if (answer == 0 ) throw new ArithmeticException();
    int x = 10/answer;
    System.out.println(x);
    
    }
}
