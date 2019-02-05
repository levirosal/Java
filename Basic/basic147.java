// 147. Write a Java program to find the number of bits required to flip to convert two given integers. Go to the editor
// Sample Output:
// 2
import java.util.*;

public class basic147{
    public static void main(String[] args){
        run();
    }
    public static void run(){
      Scanner in = new Scanner(System.in);
      int result = 0;

      System.out.print("Input first integer: ");
      int n1 = in.nextInt();

      System.out.print("Input second integer: ");
      int n2 = in.nextInt();


      for(int z = n1 ^ n2; z != 0; z = z >>> 1){
          result += z & 1;
      }
      System.out.println("Result: " + result);
    }
}

