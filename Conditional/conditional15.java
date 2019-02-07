// 15. Write a program in Java to display the n terms of odd natural number and their sum. Go to the editor
// Test Data
// Input number of terms is: 5 
// Expected Output :
// The odd numbers are :                                                            
// 1                                                                                
// 3                                                                                
// 5                                                                                
// 7                                                                                
// 9                                                                                
// The Sum of odd Natural Number upto 5 terms is: 25
import java.util.*;

public class conditional15{
    public static void main(String[] args){
      run();
    }
    public static void run(){
      Scanner in = new Scanner(System.in);
      int sum = 0, count = 0;

      System.out.print("Input number: ");
		  int value = in.nextInt();

      for(int i = 0; count < value; i++){
        if(i % 2 != 0){
          System.out.println(i);
          sum += i;
          count++;
        }
      }
      System.out.println("The sum of odd number: " + sum);
  }
}
