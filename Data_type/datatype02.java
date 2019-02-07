// 2. Write a Java program that reads a number in inches, converts it to meters. Go to the editor
// Note: One inch is 0.0254 meter.
// Test Data
// Input a value for inch: 1000
// Expected Output :
// 1000.0 inch is 25.4 meters
import java.util.*;

public class datatype02{
    public static void main(String[] args){
      Scanner in = new Scanner(System.in);

      System.out.print("Input value for inch: ");
      double inch  = in.nextDouble();

      System.out.println(inch + " inch is " + transform(inch) + " meters");
   }

   public static double transform(double inch){
     double meters = inch * 0.0254;
     return meters;
   }
}
