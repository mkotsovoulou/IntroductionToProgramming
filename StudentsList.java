import java.util.*;
/**
 * Write a description of class StudentsList here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class StudentsList
{
   public static void main (String [] args) {
       
       ArrayList<String> studentList = new ArrayList<String>();
       ArrayList<String> studentGrades = new ArrayList<String>();
       studentList.add("Mary"); //starting with position 0
       studentList.add("Mark"); 
       studentList.add("John");
       studentList.add("Mary");
       studentList.add("Jack");
       studentList.add("Danielle");
       studentList.add("Peter");
       studentList.add("Bob");
       studentList.add(0,"Alex");
       while (studentList.contains("Mary")) {
          studentList.remove("Mary");
       }
       
       for (int i=0; i<studentList.size(); i++) {
         System.out.println(studentList.get(i));
       }
       
        printArray(studentList);
       Collections.sort(studentList);
       System.out.println(Arrays.toString(studentList.toArray()));
       System.out.println(studentList.size()); 
       System.out.println(studentList.contains("Nick")); 
   
   }
   
   public static void printArray ( ArrayList<String> temp   ) {
    for (String x: temp) {
          System.out.println(x);
       }
       
    }
}
