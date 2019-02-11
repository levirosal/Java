/* 5. Write a Java method to count all words in a string. Go to the editor
Test Data:
Input the string: The quick brown fox jumps over the lazy dog.
Expected Output:

Number of words in the string: 9
*/

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
