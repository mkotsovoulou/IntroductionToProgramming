import javax.swing.JOptionPane;
/**
 * Write a description of class InputWithDialog here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class InputWithDialog
{
   public static void main (String [] args) {
   
       String name;
       String lastname;
       int age;
     
        name = JOptionPane.showInputDialog(null, "What's your name?");
       JOptionPane.showMessageDialog(null,"So, your name is :" + name);
              
       lastname = JOptionPane.showInputDialog(null, "What's your lastname?");
       JOptionPane.showMessageDialog(null,"So, your lastname is :" + name);
       
       //This is wrong because showInputDialog method returns a String 
       //not a number, Change the age variable to a String and it will
       //compile
        //age = JOptionPane.showInputDialog(null, "How old are you?"); 

        int buttonSelected;
        buttonSelected= JOptionPane.showConfirmDialog(null, "Are you ready?", "Window Title", 
                                     JOptionPane.YES_NO_OPTION);
                                     
        System.out.println("Your pressed " + buttonSelected);
        //Yes is 0, No is 1
   }
}
