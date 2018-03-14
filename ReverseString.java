import javax.swing.JOptionPane;
/**
 * Write a description of class ReverseString here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ReverseString
{
    public static void main (String [] args) {
        String word;
        word= JOptionPane.showInputDialog(null, "Type a word for the game");
        
        char guess = 'r';
        for (int i=word.length()-1; i>=0; i--)  {
            System.out.print(word.charAt(i));
        }
        System.out.println();
        // check if letter guess exists in the word Programming
        for (int i=0; i<word.length(); i++)  {
            if (word.charAt(i) == guess)
                System.out.print(guess);
            else System.out.print("_");
        }


       
    }
}
