/* 3. Write a Java method to display the middle character of a string. Go to the editor
Note: a) If the length of the string is odd there will be two middle characters.
b) If the length of the string is even there will be one middle character.
Test Data:
Input a string: 350 
Expected Output:

                                                                          
The middle character in the string: 5
*/
import java.util.*;

public class method03{
    public static void main(String[] args){
      Scanner in = new Scanner(System.in);

      System.out.print("Input string: ");
      String value = in.nextLine();

      System.out.println("The middle character is " + middle(value));
    }
    public static String middle(String str){
      int middle, n;

      if(str.length() % 2 == 0){
        middle = str.length() / 2 -1;
        n = 2;
      }else{
        middle = str.length() / 2;
        n = 1;
      }

      return str.substring(middle, middle + n);
    }
}
