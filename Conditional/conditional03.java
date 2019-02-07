// 3. Take three numbers from the user and print the greatest number.
import java.util.*;

public class conditional03{
    public static void main(String[] args){
      Scanner in = new Scanner(System.in);

      System.out.print("Input first number: ");
      int n1 = in.nextInt();

      System.out.print("Input second number: ");
      int n2 = in.nextInt();

      System.out.print("Input third  number: ");
      int n3 = in.nextInt();

      System.out.println("The greatest: " + Math.max(n1,Math.max(n2,n3)));
    }
}
