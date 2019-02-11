/* 4. Write a Java method to count all vowels in a string. Go to the editor
Test Data:
Input the string: w3resource 
Expected Output:

Number of  Vowels in the string: 4
*/

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
