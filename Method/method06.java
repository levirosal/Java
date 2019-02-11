/* 6. Write a Java method to compute the sum of the digits in an integer. Go to the editor
Test Data:
Input an integer: 25
Expected Output:

The sum is 7 
*/

import java.util.*;

public class method06{
    public static void main(String[] args){
      Scanner in = new Scanner(System.in);

      System.out.print("Input the string: ");
      char[] value = in.nextLine().toCharArray();

      System.out.println("The sum is " + sum(value));
    }
    public static int sum(char[] num){
      int sum = 0;
      for(int i = num.length - 1; i >= 0; i--){
        sum += Character.getNumericValue(num[i]);
      }
      return sum;
  }
}
