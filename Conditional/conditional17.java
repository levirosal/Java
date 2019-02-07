// 17. Write a program in Java to make such a pattern like right angle triangle with a number which will repeat a number in a row.The pattern is as follows : Go to the editor
// 1
// 22
// 333
// 4444

import java.util.*;

public class conditional17{
    public static void main(String[] args){
      run();
    }
    public static void run(){
      Scanner in = new Scanner(System.in);

      System.out.print("Input number: ");
		  int value = in.nextInt();

      for(int i = 1; i <= value; i++){
        for(int n = 1; n <= i; n++){
          System.out.print(i);
        }
        System.out.println();
      }
  }
}
