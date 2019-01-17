// 70. Write a Java program to create a string in the form short_string + long_string + short_string from two strings. The strings must not have the same length. Go to the editor
// Test Data: Str1 = Python
// Str2 = Tutorial
// Sample Output:
// PythonTutorialPython
import java.util.*;

public class basic70{
    public static void main(String[] args){
        run();
    }
    public static void run(){
        Scanner in = new Scanner(System.in);

        System.out.print("Input a first string: ");
        String text1 = in.nextLine();

        System.out.print("Input a second string: ");
        String text2 = in.nextLine();

        if(text1.length() > text2.length()){
            System.out.println(text2 + text1 + text2 );
        }else if(text2.length() > text1.length()){
            System.out.println(text1 + text2 + text1);            
        }else if(text2.length() == text1.length()){
            System.out.println("The words have the same size");
        }

    }   
}