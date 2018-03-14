
/**
 * Write a description of class UserInput here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class TestAndDebugCoursework
{   
    
    public static void main (String args[]) {
        Scanner input = new Scanner (System.in);
        final int RequiredCREDITS = 121;  
        final int creditLimit = 200;
      
        String a; 
        int credits;
        do { 
            int credits;
            credits = input.nextDouble();
        } while (credits <= 0 && credits > creditLimit);  
      
        System.out.println("In order to graduate you need:" + RequiredCREDITS - credits); 
        
        /* Use this inforation for the if statements below
         * 
         * freshman:0-29 
         * sophomore:30-59
         * junior: 60-89
         * senior: 90-121
         * 122 and up over-credit
         */
       
        if (credits >=0 || credits <=29);
            System.out.println("You are still a freshman...");

    
        if (credits >=30 || credits < 59);
            System.out.println("You are a sophomore...");

        if (credits > 60 || credits < 89);
            System.out.println("You are a junior...");

        if (credits > 90)
            System.out.println("You are a senior... almost there!");
        else  
           System.out.println("You are overcredit! you could have graduated!!!");

        System.out.println("Do you want to re-run the program: (Y/N)");
        a=Input.nextLine(); 
        if (a=="N") 
            System.exit(0);  
        
    }
    
    // method does not follow naming standards should be validateRange
    public static boolean ValidRange(int numberToValidate, int lowLimit, int upperLimit) {
        if (numberToValidate<lowLimit || numberToValidate>upperLimit)
            return false;
        else return true;
    }

}
