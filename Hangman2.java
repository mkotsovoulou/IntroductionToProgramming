import javax.swing.*;
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
        word= JOptionPane.showInputDialog(null, "Type a word for the game: ");
        word = word.toLowerCase();
        lastGuess = new char[word.length()];
        ImageIcon [] tries = new ImageIcon[11];
        for (int i=0; i<tries.length; i++){
            tries[i] = new ImageIcon(Hangman2.class.getResource("/try" + i + ".png"));
        }  
        
        lastGuess[0] = word.charAt(0);
        for (int i=1; i<word.length(); i++)  {
            lastGuess[i] = '_';
        }
        
       
        do { 
            boolean characterFound=false;
            String message = String.valueOf(lastGuess) + "\n You have " + (10 - counter) +" more tries.\n Type a letter:";
            String answer= (String) JOptionPane.showInputDialog(null, message,
               "Hangman", 
               JOptionPane.INFORMATION_MESSAGE, tries[counter], null,"");
            char guess = answer.toLowerCase().charAt(0);
            System.out.println();
            // check if letter guess exists in the word Programming
            for (int i=1; i<word.length(); i++)  {
                if (word.charAt(i) == guess) {
                    lastGuess[i] = guess;
                    characterFound=true;
                }

            }
            if (!characterFound) {
                counter++;
                JOptionPane.showMessageDialog(null, "Sorry..." + guess + " does not exist in the word");
            } else {
                JOptionPane.showMessageDialog(null, "Well done...");
            }

            if (String.valueOf(lastGuess).equals(word)) {
                JOptionPane.showMessageDialog(null, "You Found the Word!!!");
            }

        } while (counter >= 0);

        JOptionPane.showMessageDialog(null, "Game Over");
    }

}
