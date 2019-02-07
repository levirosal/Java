/*30. Write a Java program that accepts three numbers and prints "All numbers are equal" if all three numbers are equal, "All numbers are different" if all three numbers are different and "Neither all are equal or different" otherwise. Go to the editor

Test Data
Input first number: 2564
Input second number: 3526 
Input third number: 2456
Expected Output :

All numbers are different
*/
import java.util.*;

public class conditional30{
    public static void main(String[] args){
      Scanner in = new Scanner(System.in);

      System.out.print("Input first number: ");
      int n1 = in.nextInt();

      System.out.print("Input second number: ");
      int n2 = in.nextInt();

      System.out.print("Input third number: ");
      int n3 = in.nextInt();

      System.out.println(run(n1, n2, n3));
    }
    public static String run(int n1, int n2, int n3){
      if (n1 == n2 && n2 == n3){
        return "All numbers are equal";
      }else if(n1 == n2 || n2 == n3 || n3 == n1){
        return "Neither all are equal or different";
      }
      return "All numbers are different";
    }
}
