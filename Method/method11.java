/* 11. Write a Java method to check whether a string is a valid password. Go to the editor
Password rules:
A password must have at least ten characters.
A password consists of only letters and digits.
A password must contain at least two digits.

Expected Output:

1. A password must have at least eight characters.                                             
2. A password consists of only letters and digits.                                         
3. A password must contain at least two digits                                        
Input a password (You are agreeing to the above Terms and Conditions.): abcd1234           
Password is valid: abcd1234 
*/

import java.util.*;

public class method11{
    public static void main(String[] args){
      Scanner in = new Scanner(System.in);

      System.out.print("1. A password must have at least ten characters.\n" + "2. A password consists of only letters and digits.\n" + "3. A password must contain at least two digits \n");

      System.out.println("Input the Password (You are agreeing to the above terms and conditions.): ");
      String password = in.nextLine();

      if(Valid_Password(password)){
        System.out.println("Password is valid: " + password);
      }else{
          System.out.println("Not a valid password: " + password);
      }
    }

    public static boolean Valid_Password(String password){
      if(password.length() < 10){
        return false;
      }

      int charCount = 0;
      int numCount = 0;
      for(int i = 0; i < password.length(); i++){
        char ch = password.charAt(i);
        if(is_Numeric(ch)){
          numCount++;
        }else if(is_Letter(ch)){
          charCount++;
        }else{
          return false;
        }
      }
      return (charCount >= 1 && numCount >= 2);
    }

    public static boolean is_Letter(char ch){
      ch = Character.toUpperCase(ch);
      return (ch >= 'A' && ch <= 'Z');
    }

    public static boolean is_Numeric(char ch){
      return (ch >= '0' && ch <= '9');
    }
}
