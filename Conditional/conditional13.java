// 13. Write a program in Java to display the cube of the number upto given an integer. Go to the editor
// Test Data
// Input number of terms : 4
// Expected Output :
// Number is : 1 and cube of 1 is : 1                                               
// Number is : 2 and cube of 2 is : 8                                               
// Number is : 3 and cube of 3 is : 27                                              
// Number is : 4 and cube of 4 is : 64
import java.util.*;

public class conditional13{
    public static void main(String[] args){
      run();
    }
    public static void run(){
      Scanner in = new Scanner(System.in);

      System.out.print("Input number: ");
		  int value = in.nextInt();

      for(int i = 1; i <= value; i++){
        System.out.println("Number : " + i + " and cube is : " + (i*i*i));
      }

  }
}
