import java.util.*;
/**
 * Write a description of class ArraysSort1 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ArraysSort2
{
   public static void main (String [] args) {
   int [] list = {56,40,20,30,67,56,98,43,543,12,324,7,8,65,3,56,554,567,4,1};
  
   System.out.println(Arrays.toString(list));
   System.out.println("Is array sorted ? " + isSorted(list));
   System.out.println("The smallest element in the array is: " + findMin(list));
   System.out.println("The largest element in the array is: "+ findMax(list));
}

/* 
 * Q3. Create a method: isSorted, accepts an int Array, returns a boolean
 */
public static boolean isSorted(int [] list) {
  boolean sorted = true;
   for (int i=0; i < (list.length-1); i++){
       if (list[i] > list[i+1]) {
          sorted = false;
          break;   
       }
   }
  
   return sorted;
}
/* 
 * Q4. Create a method: findMax, accepts an int Array, returns an int
 */
public static int findMax (int array []) {
  int largest=array[0];
  for (int i=1; i < array.length; i++) {
  
     if (array[i] > largest) {
        largest = array[i];
        }
    }
    return largest;
}
/* 
 * Q5. Create a method: findMin, accepts an int Array, returns an int
 */

public static int findMin (int array[]) {
int smallest = array[0];

for (int i=1; i < array.length; i++) {
  if (array[i] < smallest) {
    smallest = array[i];
    }
}
return smallest;
}
}