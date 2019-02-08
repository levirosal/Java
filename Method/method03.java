/* 31. Write a program that accepts three numbers from the user and prints "increasing" if the numbers are in increasing order, "decreasing" if the numbers are in decreasing order, and "Neither increasing or decreasing order" otherwise. Go to the editor

Test Data
Input first number: 1524
Input second number: 2345
Input third number: 3321
Expected Output :

Increasing order
*/
import java.util.*;

public class method03{
    public static void main(String[] args){
      Scanner in = new Scanner(System.in);

      System.out.print("Input string: ");
      String value = in.nextLine();

      System.out.println("The middle character is " + middle(value));
    }
    public static String middle(String str){
      int middle, n;

      if(str.length() % 2 == 0){
        middle = str.length() / 2 -1;
        n = 2;
      }else{
        middle = str.length() / 2;
        n = 1;
      }

      return str.substring(middle, middle + n);
    }
}
