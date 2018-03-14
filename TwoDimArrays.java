
/**
 * Write a description of class TwoDimArrays here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class TwoDimArrays
{
   public static void main (String [] args) {
    int [][] grades = new int[6][4];
      grades[0][0] = 78;
      grades[1][0] = 88;
      grades[2][0] = 50;
      grades[3][0] = 43;
      grades[4][0] = 80;
      grades[5][0] = 73;
     
      grades[0][1] = 39;
      grades[1][1] = 45;
      grades[2][1] = 68;
      grades[3][1] = 72;
      grades[4][1] = 99;
      grades[5][1] = 81; 
   
      grades[0][2] = 44;
      grades[1][2] = 41;
      grades[2][2] = 49;
      grades[3][2] = 71;
      grades[4][2] = 87;
      grades[5][2] = 82; 
   
      grades[0][3] = 44;
      grades[1][3] = 42;
      grades[2][3] = 98;
      grades[3][3] = 23;
      grades[4][3] = 67;
      grades[5][3] = 74; 
      
      
      //Find the average per column
      int sum1=0;
      for (int i=0; i<grades.length; i++) {
        sum1+=grades[i][0];
      }
        
      int sum2=0;
      for (int i=0; i<grades.length; i++) {
        sum2+=grades[i][1];
      }
      
      double avg1 = (double) sum1 /  grades.length;
      double avg2 = (double) sum2 /  grades.length;
      
      System.out.println("The average of column 0 is :" + avg1);
      System.out.println("The average of column 1 is :" + avg2);
        
      
   }
}
