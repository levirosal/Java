// 72. Write a Java program to create a new string taking first three characters from a given string. If the length of the given string is less than 3 use "#" as substitute characters. Go to the editor
// Test Data: Str1 = " "
// Sample Output:

// ###
import java.util.*;

public class basic72{
    public static void main(String[] args){
        run();
    }
    public static void run(){
        Scanner in = new Scanner(System.in);

        System.out.print("Input a first string: ");
        String text = in.nextLine();

        if(text.length() >= 3){
            System.out.println(text.substring(0,3));
        }else if(text.length() <3){
            System.out.println("###");
        }
    }   
}