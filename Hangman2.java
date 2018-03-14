import javax.swing.JOptionPane;
import java.util.*;
/**
 * Write a description of class Hangman here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Hangman2

{
    public static void main (String [] args) {
        char [] lastGuess;
        int counter=0;
        String word;
        word= JOptionPane.showInputDialog(null, "Type a word for the game");
        word = word.toLowerCase();
        lastGuess = new char[word.length()];
        
        lastGuess[0] = word.charAt(0);
        for (int i=1; i<word.length(); i++)  {
              lastGuess[i] = '_';
        }

        System.out.println(String.valueOf(lastGuess));
 
        do { 
            boolean characterFound=false;
            char guess = JOptionPane.showInputDialog(null, counter +") Type a letter").toLowerCase().charAt(0);
            System.out.println();
            // check if letter guess exists in the word Programming
            for (int i=1; i<word.length(); i++)  {
                 if (word.charAt(i) == guess) {
                     lastGuess[i] = guess;
                 }
            }
            if (!characterFound) counter++;
           System.out.println(String.valueOf(lastGuess));
           if (String.valueOf(lastGuess).equals(word)) {
              System.out.println("You win!!!");
              break;
            }
              
        } while (counter <=10);

    }
}
