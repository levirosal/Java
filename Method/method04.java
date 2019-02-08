// 8. Write a Java program that takes the user to provide a single character from the alphabet. Print Vowel or Consonant, depending on the user input. If the user input is not a letter (between a and z or A and Z), or is a string of length > 1, print an error message.

import java.util.*;

public class method04{
    public static void main(String[] args){
      Scanner in = new Scanner(System.in);

      System.out.print("Input the string: ");
      String value = in.nextLine().toLowerCase();

      System.out.println("Number of vowels in the string: " + countVowels(value));
    }
    public static int countVowels(String letter){
      int count = 0;
      for(int i = 0; i < letter.length(); i++){
        if(letter.charAt(i) == 'a' || letter.charAt(i) == 'e' || letter.charAt(i) == 'i' || letter.charAt(i) == 'o' || letter.charAt(i) == 'u'){
          count++;
        }
      }
      return count;
  }
}
