// 12. Write a program in Java to input 5 numbers from keyboard and find their sum and average.

import java.util.*;

public class conditional12{
    public static void main(String[] args){
      run();
    }
    public static void run(){
      int n = 0, sum = 0;
      double average;
      System.out.println("Input the 5 numbers : ");

      for(int i = 0; i < 5; i++){
        Scanner in = new Scanner(System.in);
		    n = in.nextInt();
        sum += n;
      }
      average = sum / 5;
      System.out.println("The sum of 5 no is : " + sum +"\nThe Average is : " + average);
  }
}
