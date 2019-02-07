// 8. Write a Java program that takes the user to provide a single character from the alphabet. Print Vowel or Consonant, depending on the user input. If the user input is not a letter (between a and z or A and Z), or is a string of length > 1, print an error message.

import java.util.*;

public class conditional08{
    public static void main(String[] args){
      Scanner in = new Scanner(System.in);

      System.out.print("Input an alphabet: ");
      String value = in.nextLine().toLowerCase();

      System.out.println(run(value));
    }
    public static String run(String letter){
      boolean vowels = letter.equals("a") || letter.equals("e") || letter.equals("i") || letter.equals("o") || letter.equals("u");
      if (letter.length() > 1){
        return "Error. Input a single character.";
      }else if(vowels){
        return "Input letter is Vowel";
      }
      return "Input letter is Consonant";
  }
}
