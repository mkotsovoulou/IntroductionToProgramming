
/**
 * Write a description of class StudentBalance here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class StudentBalance
{
    // instance variables - replace the example below with your own
    private int studentID;
    private double balance;
    
    /**
     * Constructor for objects of class StudentBalance
     */
    public StudentBalance(int sID)
    {
        // initialise instance variables
        studentID = sID;
        balance = 0;
    }
    
    public void chargeStudent(double amount) {
       balance += amount;
    }
    
    public void acceptPayment(double amount) {
      balance -= amount;
    }
   
    public double getBalance() {
         return balance;
    }
    
    public int getID() {
        return studentID;
    }
    
    public String toString() {
      return "Student ID:" + studentID + ", Balance:" + balance;
    }
}
