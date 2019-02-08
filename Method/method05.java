// 8. Write a Java program that takes the user to provide a single character from the alphabet. Print Vowel or Consonant, depending on the user input. If the user input is not a letter (between a and z or A and Z), or is a string of length > 1, print an error message.

import java.util.*;

public class method05{
    public static void main(String[] args){
      Scanner in = new Scanner(System.in);

      System.out.print("Input the string: ");
      String value = in.nextLine();

      System.out.println("Number of words in the string: " + countWords(value));
    }
    public static int countWords(String word){
      int count = 0;
      if(word.charAt(0) == ' ' || word.charAt(word.length() - 1) == ' '){
        return 0;
      }else{
        for(int i = 0; i < word.length(); i++){
          if(word.charAt(i) == ' '){
            count++;
          }
        }
        count += 1;
     }
      return count;
  }
}
