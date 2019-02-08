// 9. Write a Java program that takes a year from user and print whether that year is a leap year or not.
// Test Data
// Input the year: 2016
// Expected Output :
// 2016 is a leap year

import java.util.*;

public class method16{
  public static void main(String[] args){
    for(int i = 2; i < 100; i++){
      if(is_Prime(i) && is_Prime(i + 2)){
        System.out.printf("(%d, %d)\n", i, i + 2);
      }
    }
  }

  public static boolean is_Prime(long n){
    if(n < 2){
      return false;
    }
    for(int i = 2; i <= n / 2; i++){
      if(n % i == 0){
        return false;
      }
    }
    return true;
  }
}
