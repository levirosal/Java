/* 2. Write a Java method to compute the average of three numbers. Go to the editor
Test Data:
Input the first number: 25 
Input the second number: 45
Input the third number: 65
Expected Output:

The average value is 45.0
*/
import java.util.*;

public class method02{
    public static void main(String[] args){
      Scanner in = new Scanner(System.in);

      System.out.print("Input first number: ");
      int n1 = in.nextInt();

      System.out.print("Input second number: ");
      int n2 = in.nextInt();

      System.out.print("Input third number: ");
      int n3 = in.nextInt();

      System.out.println("The average value is " + run(n1, n2, n3));
    }
    public static float run(int n1, int n2, int n3){
      return (float)(n1 + n2 + n3) / 3;
    }
}
