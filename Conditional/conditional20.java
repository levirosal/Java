// 20. Write a program in Java to print the Floyd's Triangle. Go to the editor
//Test Data
//Input number of rows : 5 
//Expected Output :
//1                                                                                
//01                                                                               
//101                                                                              
//0101                                                                             
//10101

import java.util.*;

public class conditional20{
    public static void main(String[] args){
      run();
    }
    public static void run(){
      Scanner in = new Scanner(System.in);
      int p,q;

      System.out.print("Input number: ");
		  int value = in.nextInt();

      for(int i = 1; i <= value; i++){
        if(i % 2 == 0){
          p = 1;
          q = 0;
        }else{
         p = 0;
         q = 1;
        }
        for(int j = 1; j <= i; j++){
          if(j % 2 == 0){
            System.out.print(p);
          }else{
            System.out.print(q);
          }
        }
        System.out.println();
   }
  }
}


