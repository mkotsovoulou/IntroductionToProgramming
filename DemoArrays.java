import java.util.Arrays;
/**
 * Write a description of class DemoArrays here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class DemoArrays
{
    public static void main (String [] args) {
        double myRandomNumber;
        int myIntRandom;
        int [] numbers = new int [100];

        for (int i=0; i<numbers.length; i++) {
            myRandomNumber = Math.random() * 100;
            myIntRandom = (int) Math.round(myRandomNumber);
            numbers[i]=myIntRandom;
        }
        
        
        System.out.println(Arrays.toString(numbers));
        int sum=0;
        for (int i=0; i<numbers.length; i++) {
            sum = sum + numbers[i]; 
         //   sum += numbers[i];
        }  
        System.out.println("The sum of the elements is :" + sum);
        System.out.println("The average of the elements is :" + (sum/numbers.length));
        
      
    }

   
}
