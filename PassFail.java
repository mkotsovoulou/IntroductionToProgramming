import java.util.Scanner;
/**
 * This program calculates how many students passed an exam,
 * and displays whether this was a successful class.
 *
 * @author Maira Kotsovoulou
 * @version 23/3/2018
 */
public class PassFail
{
    public static void main (String [] args) {
        Scanner input= new Scanner(System.in);
       // int pasr; The name of this variable is wrong and there is no initialization
        int pass=0;
        
        int fails=0;
        int grade=0;
        int numberOfStudents=0;
        boolean correct=false;
        System.out.println("How many students are registered in this course?");
        //this loop validates a correct datatype for numberOfStudents and
        // a valid range
        do {
            if (input.hasNextInt()) {
                numberOfStudents = input.nextInt();
                if (numberOfStudents<0 || numberOfStudents<=20) {
                    correct=true;
                } else {
                    System.out.println("Class size should be between 1 -20");
                }
            } else  {
                System.out.println("You did not type an integer. Try Again...");
                input.next();
            }
        }while (!correct);   

        System.out.println("You class size is :" + numberOfStudents);

        for (int i=1; i<=numberOfStudents; i++) {
             correct=false;
            //this loop will read and validate a student grade
            do { 
                System.out.println("Type the grade for student " + i);
                if (input.hasNextInt()) {
                    grade = input.nextInt();
                    if (grade>=0 && grade<=100) {
                        correct=true;
                    } else {
                        System.out.println("Grade should be between 1 - 100");
                    }
                } else  {
                    System.out.println("You did not type an integer. Try Again...");
                    input.next();
                }
            }while (!correct);   

            if (grade>=40) pass++;

        } //end of for loop

        System.out.println(pass + " students passed the exam");
        System.out.println((numberOfStudents - pass) + " students failed the exam");
        fails = numberOfStudents - pass;
        if (pass > fails) 
            System.out.println("Excellent Class");
        else  System.out.println("More work is needed");
    }
}
