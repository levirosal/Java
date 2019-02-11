/* 14. Write a Java method to create the area of a pentagon. Go to the editor

Expected Output:

Input the number of sides: 5                             
Input the side: 6                                        
The area of the pentagon is 61.93718642120281
*/

import java.util.*;

public class method14{
    public static void main(String[] args){
      Scanner in = new Scanner(System.in);

      System.out.println("Input number of sides: ");
      int n = in.nextInt();

      System.out.println("Input side: ");
      double side = in.nextDouble();

      System.out.printf("The area of pentagon is %.3f\n", area(n, side));
    }

     public static double area(int n, double side){
        return  (n * side * side) / (4 * Math.tan(Math.PI/n));
    }
}
