/* 10. Write a Java method to check whether a year (integer) entered by the user is a leap year or not. Go to the editor

Expected Output:

Input a year: 2017                                                                        
false
*/

import java.util.*;

public class method10{
    public static void main(String[] args){
      Scanner in = new Scanner(System.in);

      System.out.print("Input the year: ");
      int year = in.nextInt();

      System.out.println("Is a leap year ? " + run(year));
    }
    public static boolean run(int year){
      boolean x = (year % 4) == 0;
      boolean y = (year % 100) != 0;
      boolean z = ((year % 100 == 0) && (year % 400 == 0));

      return x && (y || z);
  }
}
