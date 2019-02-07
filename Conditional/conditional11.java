// 11. Write a program in Java to display n terms of natural numbers and their sum.

import java.util.*;

public class conditional11{
    public static void main(String[] args){
      run();
    }
    public static void run(){
      Scanner in = new Scanner(System.in);
      int sum=0;

      System.out.print("Input number: ");
      int number = in.nextInt();

      for(int i = 1; i <= number; i++){
        System.out.println(i);
        sum+=i;
      }
      System.out.println("The Sum of Natural Number upto: " + number + "\nTerms: " + sum);
  }
}
