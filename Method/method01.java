/* 31. Write a program that accepts three numbers from the user and prints "increasing" if the numbers are in increasing order, "decreasing" if the numbers are in decreasing order, and "Neither increasing or decreasing order" otherwise. Go to the editor

Test Data
Input first number: 1524
Input second number: 2345
Input third number: 3321
Expected Output :

Increasing order
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
