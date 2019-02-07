/* 29. Write a Java program that reads an positive integer and count the number of digits the number (less than ten billion) has. Go to the editor

Test Data
Input an integer number less than ten billion: 125463
Expected Output :

Number of digits in the number: 6
*/
import java.util.*;

public class conditional29{
    public static void main(String[] args){
      run();
    }
    public static void run(){
      Scanner in = new Scanner(System.in);

      System.out.print("Input number: ");
		  long value = in.nextLong();
      String temp = Long.toString(value);

      System.out.println("Number of digits in the number: " + temp.length());
    }
}
