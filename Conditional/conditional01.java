// 1. Write a Java program to get a number from the user and print whether it is positive or negative.

import java.util.*;

public class conditional01{
    public static void main(String[] args){
      Scanner in = new Scanner(System.in);

      System.out.print("Input number: ");
      int value = in.nextInt();

      System.out.println("Number is " + run(value));

    }
    public static String run(int value){
      if(value > 0){
        return "positive";
      }else if(value < 0){
        return "negative";
      }
      return "zero";
    }
}
