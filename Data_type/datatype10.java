// 10. Write a Java program to break an integer into a sequence of individual digits. Go to the editor
// Test Data
// Input six non-negative digits: 123456
// Expected Output :
// 1 2 3 4 5 6

import java.util.*;

public class datatype10{
    public static void main(String[] args){
      Scanner in = new Scanner(System.in);

      System.out.print("Input digits: ");
      String value = in.nextLine();
      char[] rest = value.toCharArray();

      System.out.print("Result : ");

      for(int i = 0; i < rest.length ; i++){
        System.out.print(Character.getNumericValue(rest[i]) + " ");
      }
      System.out.println();
    }
}
