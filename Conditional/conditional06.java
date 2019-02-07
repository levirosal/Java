// 6. Write a Java program that reads in two floating-point numbers and tests whether they are the same up to three decimal places.

import java.util.*;

public class conditional06{
    public static void main(String[] args){
      Scanner in = new Scanner(System.in);

      System.out.print("Input first floating-point number: ");
      float n1 = in.nextFloat();

      System.out.print("Input second floating-point number: ");
      float n2 = in.nextFloat();

      System.out.println(run(n1, n2));
    }
    public static String run(float n1, float n2){
      n1 = Math.round(n1 * 1000);
      n1 = n1 / 1000;

      n2 = Math.round(n2 * 1000);
      n2 = n2 / 1000;

      if (n1 == n2){
        return "They are the same up to three decimal places";
      }
      return "They are different";
    }
}
