// 69. Write a Java program to extract the first half of a string of even length.
// Test Data: Python
// Sample Output: 
// Pyt
import java.util.*;

public class basic69{
    public static void main(String[] args){
        run();
    }
    public static void run(){
        Scanner in = new Scanner(System.in);

        System.out.print("Input a string: ");
        String text = in.nextLine();

        System.out.println(text.substring(0 , text.length() / 2));
    }   
}