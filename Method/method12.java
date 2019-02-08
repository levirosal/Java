// 9. Write a Java program that takes a year from user and print whether that year is a leap year or not.
// Test Data
// Input the year: 2016
// Expected Output :
// 2016 is a leap year

import java.util.*;

public class method12{
    public static void main(String[] args){
      Scanner in = new Scanner(System.in);

      System.out.println("Input the Number: ");
      int number = in.nextInt();

      print(number);
    }

    public static void print(int n){
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                System.out.print((int)(Math.random() * 2) + " ");
            }
            System.out.println();
        }
    }
}
