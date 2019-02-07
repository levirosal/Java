/* 24. Write a java program to generate a following @'s triangle. Go to the editor

Test Data
Input the number: 6 
Expected Output :

      @                                                  
     @@                                                  
    @@@                                                  
   @@@@                                                  
  @@@@@                                                  
 @@@@@@
*/
import java.util.*;

public class conditional24{
    public static void main(String[] args){
      run();
    }
    public static void run(){
      Scanner in = new Scanner(System.in);

      System.out.print("Input number: ");
		  int value = in.nextInt();

      for(int i = 0; i < value; i++){
        for(int x = value - i; x > 0; x--){
          System.out.print(" ");
        }
        for(int n = 0; n <= i; n++){
          System.out.print("@");
        }
        System.out.println();
      }
   }
}
