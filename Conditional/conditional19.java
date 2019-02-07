// 19. Write a program in Java to make such a pattern like a pyramid with a number which will repeat the number in the same row. Go to the editor

//       1
//      2 2
//     3 3 3
//    4 4 4 4 

import java.util.*;

public class conditional19{
    public static void main(String[] args){
      run();
    }
    public static void run(){
      Scanner in = new Scanner(System.in);
      int x;

      System.out.print("Input number: ");
		  int value = in.nextInt();


      int y = value + 4 - 1;
      for(int i = 1; i <= value; i++){
        for(x = y; x != 0; x--){
          System.out.print(" ");
        }
        for(int n = 1; n <= i; n++){
          System.out.print(i + " ");
        }
        System.out.println();
        y--;
   }
  }
}
