/* 26. Write a Java program to display the following character rhombus structure. Go to the editor

Test Data
Input the number: 7 
Expected Output :

                                      
      A                                                  
     ABA                                                 
    ABCBA                                                
   ABCDCBA                                               
  ABCDEDCBA                                              
 ABCDEFEDCBA                                             
ABCDEFGFEDCBA                                            
 ABCDEFEDCBA                                             
  ABCDEDCBA                                              
   ABCDCBA                                               
    ABCBA                                                
     ABA                                                 
      A  
*/
import java.util.*;

public class conditional26{
    public static void main(String[] args){
      run();
    }
    public static void run(){
      Scanner in = new Scanner(System.in);

      System.out.print("Input number: ");
		  int value = in.nextInt();

      int count = 1;
      int count2 = 1;
      char c = 'A';

      for(int i = 1; i < (value * 2); i++){
        for(int x = value - count2; x > 0; x--){
          System.out.print(" ");
        }
        if(i < value){
          count2++;
        }else{
          count2--;
        }
        for(int j = 0; j < count; j++){
          System.out.print(c);
          if(j < count / 2){
            c++;
          }else{
            c--;
          }
        }
        if(i < value){
          count = count + 2;
        }else{
          count = count - 2;
        }
        c = 'A';
        System.out.println();
      }
    }
}
