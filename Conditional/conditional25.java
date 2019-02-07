/* 25. Write a Java program to display the number rhombus structure. Go to the editor

Test Data
Input the number: 7 
Expected Output :

                                   
      1                                                  
     212                                                 
    32123                                                
   4321234                                               
  543212345                                              
 65432123456                                             
7654321234567                                            
 65432123456                                             
  543212345                                              
   4321234                                               
    32123                                                
     212                                                 
      1  
*/
import java.util.*;

public class conditional25{
    public static void main(String[] args){
      run();
    }
    public static void run(){
      Scanner in = new Scanner(System.in);

      System.out.print("Input number: ");
		  int value = in.nextInt();

      int count = 1;
      int no_of_spaces = 1;
      int start = 0;

      for(int i = 1; i < (value * 2); i++){
        for(int x = value - no_of_spaces; x > 0; x--){
          System.out.print(" ");
        }
        if(i < value){
          start = i;
          no_of_spaces++;
        }else{
          start = value * 2 - i;
          no_of_spaces--;
        }
        for(int j = 0; j < count; j++){
          System.out.print(start);
           if(j < count / 2){
             start--;
           }else{
             start++;
           }
        }
        if(i < value){
          count = count + 2;
        }else{
          count = count - 2;
        }
        System.out.println();
      }
    }
}
