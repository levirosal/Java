// 8. Write a Java program that takes the user to provide a single character from the alphabet. Print Vowel or Consonant, depending on the user input. If the user input is not a letter (between a and z or A and Z), or is a string of length > 1, print an error message.

import java.util.*;

public class method09{
  public static void main(String[] args){
    print('(', 'z');
  }
  public static void print(char char1, char char2){
    for(int i = 1; char1 <= char2; i++, char1++){
      System.out.print(char1 + " ");
      if(i % 20 == 0){
        System.out.println("");
      }
    }
		System.out.print("\n");
  }
}

