// 1. Write a Java program to convert temperature from Fahrenheit to Celsius degree. Go to the editor
// Test Data
// Input a degree in Fahrenheit: 212
// Expected Output:
//212.0 degree Fahrenheit is equal to 100.0 in Celsius

import java.util.*;

public class datatype01{
    public static void main(String[] args){
        run();
    }
    public static void run(){
      Scanner in = new Scanner(System.in);

      System.out.print("Input temperature: ");
      double fahrenheit = in.nextDouble();

      System.out.println(fahrenheit + " degree Fahrenheit is equal to " + transform(fahrenheit) + " in Celsius");
   }

   public static double transform(double fah){
     double celsius = (((fah - 32) * 5) / 9);
     return celsius;
   }
}
