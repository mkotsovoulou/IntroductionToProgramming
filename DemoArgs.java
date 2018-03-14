
/**
 * Write a description of class jhdfsaf here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class DemoArgs
{
   public static void main (String [] args) {
   
      System.out.println(args.length);
      for (int i=0; i<args.length; i++) {
        System.out.println(args[i]);
      }
     
      int x =  Integer.parseInt("5");
      double y = Double.parseDouble("87");
      
      System.out.println("56" + 10);
      System.out.println(x+10);
      
       System.out.println("34.87" + 10);
      System.out.println(y+10);
   }
   
   
   
}
