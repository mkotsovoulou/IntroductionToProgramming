
/**
 * Write a description of class ForLoop here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ForLoop
{
    public static void main (String args[]) {  
        printPowerTable(5, 3);
    }
    
    public static void printPowerTable(int columns, int rows) {
    
         for (int x=1; x<=rows; x++) {
          for (int power=1; power<=columns; power++) {
            System.out.printf("%6.0f ", Math.pow(x, power));   
          }
          System.out.printf("%n");
      }
    
    }
    
    
    
    
    
    
    
    
    
    
    
}
