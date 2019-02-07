// 4. Write a Java program to convert minutes into a number of years and days.
// Test Data
// Input the number of minutes: 3456789
// Expected Output :
// 3456789 minutes is approximately 6 years and 210 days

import java.util.*;

public class datatype04{
    public static void main(String[] args){
      run();
    }
    public static void run(){
      Scanner in = new Scanner(System.in);
      double minutesInYear = 60 * 24 * 365;

      System.out.print("Input the minutes: ");
      double min = in.nextDouble();

      long years = (long) (min / minutesInYear);
      int days = (int) (min / 60 / 24) % 365;

      System.out.println((int) min + " minutes is approximately " + years + " years and " + days + " days");
    }
}
