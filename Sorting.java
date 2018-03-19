import java.util.*;
/**
 * Write a description of class Sorting here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Sorting
{
   public static void main (String [] args) {
   
   Integer [] demo =  {6,32,98,2,78,23,01,54,22,43,87,23};
   System.out.println(Arrays.toString(demo));
   Arrays.sort(demo);
   System.out.println(Arrays.toString(demo));
   
   String [] demo2 = {"John", "Ann", "Smith", "George", "Mary"};
   System.out.println(Arrays.toString(demo2));
   Arrays.sort(demo2);
   System.out.println(Arrays.toString(demo2));
   //A two dimensional array requires implementation of the Comparator Interface
   //
   Integer [][] demo3 = {{202272,36}, {132249,40}, {133337,35}, {122314,86}, {218017,100}};
   //display the array before the sort
   for (int rows=0; rows<demo3.length; rows++)
       System.out.println(Arrays.toString(demo3[rows]));
    
      Arrays.sort(demo3, new Comparator<Integer[]>() { //Change the Integer to whatever is the datatype of your array
			public int compare(Integer[] o1, Integer[] o2) {
				Integer itemIdOne = o1[1]; //Change the column number to the column you wish to sort by
				Integer itemIdTwo = o2[1]; //Change the column number to the column you wish to sort by
				return itemIdOne.compareTo(itemIdTwo);
			}
		});
   //display the array after the sort		
   for (int rows=0; rows<demo3.length; rows++)
       System.out.println(Arrays.toString(demo3[rows]));
    
   
   //Exercise: now sort this array by the 1st column 
   //and display it
   String [] [] demo4 = { {"mary","2108291809"}, {"ann", "6984736345"}, {"peter","2107766524"},
                          {"george", "6988324534"} };

               
     
   }
   
   
    
}
