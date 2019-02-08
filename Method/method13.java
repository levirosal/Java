// 9. Write a Java program that takes a year from user and print whether that year is a leap year or not.
// Test Data
// Input the year: 2016
// Expected Output :
// 2016 is a leap year

import java.util.*;

public class method13{
    public static void main(String[] args){
      Scanner in = new Scanner(System.in);

      System.out.println("Input side-1: ");
      double s1 = in.nextDouble();

      System.out.println("Input side-2: ");
      double s2 = in.nextDouble();

      System.out.println("Input side-3: ");
      double s3 = in.nextDouble();

      if(valid(s1, s2, s3)){
        System.out.printf("The area of the triangle is %.3f\n", area(s1, s2, s3));
      }else{
        System.out.println("Invalid sides");
      }
    }

    public static boolean valid(double s1, double s2, double s3){
      if(s1 + s2 > s3 && s2 + s3 > s1 && s1 + s3 > s2){
        return true;
      }else{
        return false;
      }
    }
     public static double area(double s1, double s2, double s3){
        double area = 0;
        double s = (s1 + s2 + s3)/2;
        area = Math.sqrt(s*(s - s1)*(s - s2)*(s - s3));
        return area;
    }

}
