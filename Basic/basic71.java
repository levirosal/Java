// 71. Write a Java program to create the concatenation of the two strings except removing the first character of each string. The length of the strings must be 1 and above.
// Test Data: Str1 = Python
// Str2 = Tutorial
// Sample Output:

// ythonutorial
import java.util.*;

public class basic71{
    public static void main(String[] args){
        run();
    }
    public static void run(){
        Scanner in = new Scanner(System.in);

        System.out.print("Input a first string: ");
        String text1 = in.nextLine();

        System.out.print("Input a second string: ");
        String text2 = in.nextLine();

        System.out.println(text1.substring(1) + text2.substring(1));
    }   
}