// 9. Write a Java program that takes a year from user and print whether that year is a leap year or not.
// Test Data
// Input the year: 2016
// Expected Output :
// 2016 is a leap year

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
