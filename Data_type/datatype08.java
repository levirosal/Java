// 8. Write a Java program that reads a number and display the square, cube, and fourth power.
// Expected Output:
// Square: .2f 
// Cube: .2f 
// Fourth power: 50625.00

import java.util.*;

public class datatype08{
    public static void main(String[] args){
      run();
    }
    public static void run(){
      Scanner in = new Scanner(System.in);

      System.out.print("Input the side length: ");
      double value = in.nextDouble();

      System.out.printf("Square: %12.2f\n", value * value);
      System.out.printf("Cube: %14.2f\n", value * value * value);
      System.out.printf("Fourth power: %6.2f\n", Math.pow(value, 4));
    }
}
