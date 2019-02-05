// 141. Write a Java program to check if a given string has all unique characters. Go to the editor
// Sample Output: Original String : xyyz
// String has all unique characters: false
import java.util.*;

public class basic141{
    public static void main(String[] args){
        run();
    }
    public static void run(){
        Scanner in = new Scanner(System.in);
        boolean result = true;

        System.out.print("Input string: ");
        String value = in.nextLine();

        char[] text = value.toCharArray();
        Arrays.sort(text);

        for(int i = 1; i < text.length; i++){
          if(text[i] == text[i-1]){
            result = false;
          }
        }
        System.out.println("Is unique: " + result);
    }
}
