/* 22. Write a Java program to display Pascal's triangle. Go to the editor

Test Data
Input number of rows: 5 
Expected Output :

Input number of rows: 5                                                          
      1                                                                          
     1 1                                                                         
    1 2 1                                                                        
   1 3 3 1                                                                       
  1 4 6 4 1  
*/
import java.util.*;

public class conditional22{
    public static void main(String[] args){
      run();
    }
    public static void run(){
      Scanner in = new Scanner(System.in);
      int y = 1;

      System.out.print("Input number: ");
		  int value = in.nextInt();

      for(int i = 0;i < value; i++){
        for(int n = 1; n <= value - i; n++){
          System.out.print(" ");
        }
        for(int x = 0; x <= i; x++){
          if(x==0||i==0){
            y=1;
          }else{
            y = y * (i - x + 1) / x;
          }
          System.out.print(" " + y);
        }
        System.out.println();
      }

   }
}
