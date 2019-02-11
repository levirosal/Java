/*1. Write a Java method to find the smallest number among three numbers. Go to the editor
Test Data:
Input the first number: 25
Input the Second number: 37
Input the third number: 29 
Expected Output:

The smallest value is 25.0
*/

import java.util.*;

public class method01{
    public static void main(String[] args){
      Scanner in = new Scanner(System.in);

      System.out.print("Input first number: ");
      int n1 = in.nextInt();

      System.out.print("Input second number: ");
      int n2 = in.nextInt();

      System.out.print("Input third number: ");
      int n3 = in.nextInt();

      System.out.println("The smallest value is " + run(n1, n2, n3));
    }
    public static int run(int n1, int n2, int n3){
      return Math.min(n1,Math.min(n2,n3));
    }
}
