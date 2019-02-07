// 21. Write a program in Java to display the pattern like a diamond. Go to the editor
// Test Data
// Input number of rows (half of the diamond) : 7 
// Expected Output :
//      *                                                                          
//     ***                                                                         
//    *****                                                                        
//   *******                                                                       
//  *********                                                                      
// ***********                                                                     
//*************                                                                    
// ***********                                                                     
//  *********                                                                      
//   *******                                                                       
//    *****                                                                        
//     ***                                                                         
//      *    

import java.util.*;

public class conditional21{
    public static void main(String[] args){
      run();
    }
    public static void run(){
      Scanner in = new Scanner(System.in);

      System.out.print("Input number: ");
		  int value = in.nextInt();

      for(int i = 0; i <= value; i++){
        for(int j = 1; j <= value - i; j++){
          System.out.print(" ");
        }
        for(int j = 1; j <= 2*i - 1; j++){
          System.out.print("*");
        }
        System.out.print("\n");
      }
      for(int i = value - 1; i >= 1; i--){
        for(int j=1;j <= value - i; j++){
          System.out.print(" ");
        }
        for(int j=1;j<=2*i-1;j++){
          System.out.print("*");
        }
        System.out.print("\n");
      }
   }
}
