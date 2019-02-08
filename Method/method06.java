// 8. Write a Java program that takes the user to provide a single character from the alphabet. Print Vowel or Consonant, depending on the user input. If the user input is not a letter (between a and z or A and Z), or is a string of length > 1, print an error message.

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
