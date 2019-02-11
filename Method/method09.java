/* 9. Write a Java method to print characters between two characters (i.e. A to P ). Go to the editor
Note: Prints 20 characters per line

Expected Output:

( ) * + , - . / 0 1 2 3 4 5 6 7 8 9 : ;                  
< = > ? @ A B C D E F G H I J K L M N O                  
P Q R S T U V W X Y Z [ \ ] ^ _ ` a b c                  
d e f g h i j k l m n o p q r s t u v w                  
x y z
*/

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

