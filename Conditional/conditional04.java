// 4. Write a Java program to read the value of an integer m and display the value of n is 1 when m is larger than 0, 0 when m is 0 and -1 when m is less than 0.

import java.util.*;

public class conditional04{
    public static void main(String[] args){
      Scanner in = new Scanner(System.in);

      System.out.print("Input a number: ");
      int value = in.nextInt();

      System.out.println("The value of n = " + run(value));

    }
    public static int run(int value){
      if(value > 0){
        return 1;
      }else if(value < 0){
        return -1;
      }
      return 0;
    }
}
