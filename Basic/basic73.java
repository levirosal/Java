// 73. Write a Java program to create a new string taking first and last characters from two given strings. If the length of either string is 0 use "#" for missing character. Go to the editor
// Test Data: str1 = "Python"
// str2 = " "
// Sample Output:

// P#
import java.util.*;

public class basic73{
    public static void main(String[] args){
        run();
    }
    public static void run(){
        Scanner in = new Scanner(System.in);

        System.out.print("Input a first string: ");
        String text1 = in.nextLine();

        System.out.print("Input a second string: ");
        String text2 = in.nextLine();

        if(text1.length() >= 1){
            System.out.print(text1.substring(0,1));      
        }else{
            System.out.print("#");
        }

        if(text2.length() >= 1){
            System.out.print(text2.substring(text2.length() -1 ) + "\n");      
        }else{
            System.out.print("#\n");
        }
    }   
}