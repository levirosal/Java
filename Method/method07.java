// 8. Write a Java program that takes the user to provide a single character from the alphabet. Print Vowel or Consonant, depending on the user input. If the user input is not a letter (between a and z or A and Z), or is a string of length > 1, print an error message.

import java.util.*;

public class method07{
  public static void main(String[] args){
    int count = 1;
    for(int i = 1; i <= 50; i++){
      System.out.printf("%-6d",getPentagonalNumber(i));
      if(count % 10 == 0){
        System.out.println();
      }
      count++;
		}
  }
  public static int getPentagonalNumber(int i){
    return (i * (3 * i - 1))/2;
  }
}

