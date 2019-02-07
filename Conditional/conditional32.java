/* 32. Write a Java program that accepts two floating­point numbers and checks whether they are the same up to two decimal places. Go to the editor

Test Data
Input first floating­point number: 1235
Input second floating­point number: 2534 
Expected Output :

These numbers are different.
*/
import java.util.*;

public class conditional32{
    public static void main(String[] args){
      Scanner in = new Scanner(System.in);

      System.out.print("Input first floating-point number: ");
      float n1 = in.nextFloat();

      System.out.print("Input second floating-point number: ");
      float n2 = in.nextFloat();

      System.out.println(run(n1, n2));
    }
    public static String run(float n1, float n2){
      n1 = Math.round(n1 * 100);
      n1 = n1 / 100;

      n2 = Math.round(n2 * 100);
      n2 = n2 / 100;

      if (n1 == n2){
        return "These numbers are the same";
      }
      return "These numbers are different";
    }
}
