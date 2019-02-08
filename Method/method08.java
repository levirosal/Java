// 8. Write a Java program that takes the user to provide a single character from the alphabet. Print Vowel or Consonant, depending on the user input. If the user input is not a letter (between a and z or A and Z), or is a string of length > 1, print an error message.

import java.util.*;

public class method08{
    public static void main(String[] args){
      Scanner in = new Scanner(System.in);

      System.out.print("Input the investment amount: ");
      double amount = in.nextDouble();

      System.out.print("Input the rate of interest: ");
      double rate = in.nextDouble();
      rate *= 0.01;

      System.out.print("Input number of years: ");
      int years = in.nextInt();

      System.out.println("Years       FutureValue");

      for(int i = 1; i <= years; i++){
        System.out.printf(i + "%22.2f\n", futureInvestment(amount, rate/12, i));
      }
	  }

    public static double futureInvestment(double amount, double rate, int years){
      return amount * Math.pow(1 + rate, years * 12);
    }
}
