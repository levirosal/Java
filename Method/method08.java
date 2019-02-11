/* 8. Write a Java method to compute the future investment value at a given interest rate for a specified number of years. Go to the editor
Sample data (Monthly compounded) and Output:
Input the investment amount: 1000
Input the rate of interest: 10
Input number of years: 5

Expected Output:

Years    FutureValue                                     
1            1104.71                                     
2            1220.39                                     
3            1348.18                                     
4            1489.35                                     
5            1645.31
*/

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
