import java.util.Scanner;
/**
 * Write a description of class InputDemo here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class InputDemo
{
    public static void main (String [] args) {
        Scanner input = new Scanner (System.in);
        int number=0;
        char initial='!';
        String name ="Apostalis";
         String name2 ="Papadopoulos";
          String name3 ="Smith";
        double price = 650000.21;
        double cash = 23439.64531;
        double price2 = 7650.21;
        double cash2 = 2659.6;
        double price3 = 4324750.21;
        double cash3 = 265121.6;
        
        System.out.println(name + " " + price + " " + cash);
        System.out.println(name2 + " " +price2 + " " + cash2);
        System.out.println(name3+" " + price3 + " " + cash3);
        System.out.printf("%20s %10.2f %10.2f %n",name, price, cash);
        System.out.printf("%20s %10.2f %10.2f %n",name2, price2, cash2);
        System.out.printf("%20s %10.2f %10.2f %n",name3, price3, cash3);
      //  String invalidInput="";
/*
        System.out.println("Type an integer :");
        if (input.hasNextByte()) { //This DOES not read the input just checks
            number = input.nextByte(); //This reads
            System.out.println("Integer typed: " + number);
        } 
       else 
        { 
            invalidInput = input.next(); //This reads
            System.out.println("Invalid Input Typed: " + invalidInput);
        }
        */
       

    }
}
