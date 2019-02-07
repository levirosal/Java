/* 27. Write a Java program that reads an integer and check whether it is negative, zero, or positive. Go to the editor

Test Data
Input a number: 7 
Expected Output :

Number is positive
*/
import java.util.*;

public class conditional27{
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
