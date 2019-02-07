// 18. Write a program in Java to make such a pattern like right angle triangle with number increased by 1.The pattern like : Go to the editor
// 1
// 2 3
// 4 5 6
// 7 8 9 10 

import java.util.*;

public class conditional18{
    public static void main(String[] args){
      run();
    }
    public static void run(){
      Scanner in = new Scanner(System.in);
      int x = 1;

      System.out.print("Input number: ");
		  int value = in.nextInt();

      for(int i = 1; i <= value; i++){
        for(int n = 1; n <= i; n++){
          System.out.print(x++ + " ");
        }
        System.out.println();
      }
  }
}
