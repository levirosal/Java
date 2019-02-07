/* 28. Write a Java program that reads a floating-point number. If the number is zero it prints "zero", otherwise, print "positive" or "negative". Add "small" if the absolute value of the number is less than 1, or "large" if it exceeds 1,000,000. Go to the editor

Test Data
Input a number: -2534 
Expected Output :

Negative
*/
import java.util.*;

public class conditional28{
    public static void main(String[] args){
      Scanner in = new Scanner(System.in);

      System.out.print("Input number: ");
      double value = in.nextDouble();

      System.out.println("Number is " + run(value));

    }
    public static String run(double value){
      if(value > 0){
        if(value < 1){
          return "Positive small";
        }else if(value > 1000000){
          return "Positive large";
        }else{
          return "Positive";
        }
      }else if(value < 0){
        if(Math.abs(value) < 1){
          return "Negative small";
        }else if(Math.abs(value) > 1000000){
          return "Negative large";
        }else{
          return "Negative";
        }
      }else{
        return "Zero";
      }
    }
}
