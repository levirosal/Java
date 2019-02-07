// 6. Write a Java program to compute body mass index (BMI).
// Test Data
// Input weight in pounds: 452
// Input height in inches: 72
// Expected Output:
// Body Mass Index is 61.30159143458721

import java.util.*;

public class datatype06{
    public static void main(String[] args){
      run();
    }
    public static void run(){
      Scanner in = new Scanner(System.in);

      System.out.print("Input weight in pounds: ");
      double weight = in.nextDouble();

      System.out.print("Input height in inches: ");
      double inches = in.nextDouble();

      double BMI = weight * 0.45359237 / (inches * 0.0254 * inches * 0.0254);
      System.out.println("Body Mass Index is " + BMI);
    }
}
