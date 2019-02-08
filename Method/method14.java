// 9. Write a Java program that takes a year from user and print whether that year is a leap year or not.
// Test Data
// Input the year: 2016
// Expected Output :
// 2016 is a leap year

import java.util.*;

public class method14{
    public static void main(String[] args){
      Scanner in = new Scanner(System.in);

      System.out.println("Input number of sides: ");
      int n = in.nextInt();

      System.out.println("Input side: ");
      double side = in.nextDouble();

      System.out.printf("The area of pentagon is %.3f\n", area(n, side));
    }

     public static double area(int n, double side){
        return  (n * side * side) / (4 * Math.tan(Math.PI/n));
    }
}
