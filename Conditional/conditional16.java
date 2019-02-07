// 16. Write a program in Java to display the pattern like right angle triangle with a number. Go to the editor
// Test Data
// Input number of rows : 10 
// Expected Output :
// 1                                                                                
// 12                                                                               
// 123                                                                              
// 1234                                                                             
// 12345                                                                            
// 123456                                                                           
// 1234567                                                                          
// 12345678                                                                         
// 123456789                                                                        
// 12345678910

import java.util.*;

public class conditional16{
    public static void main(String[] args){
      run();
    }
    public static void run(){
      Scanner in = new Scanner(System.in);

      System.out.print("Input number: ");
		  int value = in.nextInt();

      for(int i = 1; i <= value; i++){
        for(int n = 1; n <= i; n++){
          System.out.print(n);
        }
        System.out.println();
      }
  }
}
