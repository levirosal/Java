// 68. Write a Java program to create a new string of 4 copies of the last 3 characters of the original string. The length of the original string must be 3 and above.
// Sample Output:
// 3.03.03.03.0
import java.util.*;

public class basic68{
    public static void main(String[] args){
        run();
    }
    public static void run(){
        Scanner in = new Scanner(System.in);

        System.out.print("Input a string: ");
        String text = in.nextLine();

        String three = text.substring(text.length() - 3);
        System.out.println(three + three + three + three);
    }   
}