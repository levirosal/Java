// 67. Write a Java program to insert a word in the middle of the another string.
// Insert "Tutorial" in the middle of "Python 3.0", so result will be Python Tutorial 3.0
// Sample Output:
// Python Tutorial 3.0 
import java.util.*;

public class basic67{
    public static void main(String[] args){
        run();
    }
    public static void run(){
        Scanner in = new Scanner(System.in);

        System.out.print("Input a string: ");
        String text = in.nextLine();

        String[] arrayStrings = text.split(" ");

        int lenght = arrayStrings[0].length();
    
        System.out.println(arrayStrings[0] + " Tutorial" + text.substring(lenght));
    }   
}