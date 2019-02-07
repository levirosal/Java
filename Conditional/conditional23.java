/* 23. Write a java program to generate a following *'s triangle. Go to the editor

Test Data
Input the number: 6 
Expected Output :

******                                                   
 *****                                                   
  ****                                                   
   ***                                                   
    **                                                   
     * 
*/
import java.util.*;

public class conditional23{
    public static void main(String[] args){
      run();
    }
    public static void run(){
      Scanner in = new Scanner(System.in);

      System.out.print("Input number: ");
		  int value = in.nextInt();

      for(int i = value; i > 0; i--){
        for(int y = value - i; y > 0; y--){
          System.out.print(" ");
        }
        for(int n = 0; n < i; n++){
          System.out.print("*");
        }
        System.out.println();
        }

   }
}
