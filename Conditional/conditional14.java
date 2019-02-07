// 14. Write a program in Java to display the multiplication table of a given integer. Go to the editor
// Test Data
// Input the number (Table to be calculated) : Input number of terms : 5
// Expected Output :
// 5 X 0 = 0                                                                        
// 5 X 1 = 5                                                                        
// 5 X 2 = 10                                                                       
// 5 X 3 = 15                                                                       
// 5 X 4 = 20                                                                       
// 5 X 5 = 25
import java.util.*;

public class conditional14{
    public static void main(String[] args){
      run();
    }
    public static void run(){
      Scanner in = new Scanner(System.in);

      System.out.print("Input number: ");
		  int value = in.nextInt();

      for(int i = 0; i <= value; i++){
        System.out.println(value + " x " + i + " = " + value * i);
      }
  }
}
