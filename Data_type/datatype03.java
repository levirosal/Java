// 3. Write a Java program that reads an integer between 0 and 1000 and adds all the digits in the integer.
// Test Data
// Input an integer between 0 and 1000: 565
// Expected Output :
// The sum of all digits in 565 is 16

import java.util.*;

public class datatype03{
    public static void main(String[] args){
      Scanner in = new Scanner(System.in);

      System.out.print("Input an integer: ");
      String value = in.nextLine();

      System.out.println("The sum of the digits is : " + sum(value));
    }
    public static int sum(String value){
      int result = 0;
      char[] rest = value.toCharArray();

      for(int i = rest.length - 1; i >= 0; i--){
        result += Character.getNumericValue(rest[i]);
      }
      return result;
    }
}
