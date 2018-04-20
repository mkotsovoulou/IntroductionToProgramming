
/**
 * Write a description of class CollegeFinance here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class CollegeFinance
{
   public static void main (String [] args) {
     StudentBalance b1 = new StudentBalance(1);
     StudentBalance b2 = new StudentBalance(2);
     StudentBalance b3 = new StudentBalance(3);
     
     b1.chargeStudent(1000);
     b2.chargeStudent(200);
     b3.chargeStudent(100);
     
     b1.acceptPayment(200);
     
     System.out.println(b1);
     
     System.out.println("Student ID:" + b1.getID() + " Balance:" + b1.getBalance());
     System.out.println("Student ID:" + b2.getID() + " Balance:" + b3.getBalance());
     System.out.println("Student ID:" + b3.getID() + " Balance:" + b3.getBalance());

     
   
   }
}
