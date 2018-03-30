import java.util.*;
/**
 * Write a description of class AdvancedStrings here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class AdvancedStrings
{
   public static void main (String [] args) {
   
   String name1 = "Smith";
   String name2 = "SMITH";
   
   //System.out.println(name2.toLowerCase().compareTo(name1.toLowerCase()));
   
   if (name1.compareToIgnoreCase(name2) > 0) 
      System.out.println(name2 + " comes first ");
      else   if (name1.compareToIgnoreCase(name2) < 0)
        System.out.println(name1 + " comes first ");
      else  
        System.out.println(name1 + " equals to "+ name2);
   
   
   
   String sampleData="65;12;65;122;435;878";
   String sampleData2="Maira Kotsovoulou,Petros Papadakis,Nikolaos Platakis";
   String [] parts = sampleData.split(";");
   System.out.println(Arrays.toString(parts));
   
   String[]  parts2 = sampleData2.split(",");
   System.out.println(Arrays.toString(parts2));
}
}
