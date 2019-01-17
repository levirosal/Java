// 61. Write a Java program to reverse a word.
// Sample Output: 
// Input a word: dsaf
// Reverse word: fasd
import java.util.*;

public class basic61{
    public static void main(String[] args){
        run();
    }
    public static void run(){
        Scanner in = new Scanner(System.in);
        String result = "";

        System.out.print("Input a word: ");
        char[] text = in.nextLine().toCharArray();

        for(int i = text.length -1 ; i >= 0 ; i--){
            result += text[i];
        }
        System.out.println(result);
	}    
}

System.out.println((Math.abs(x - y) >= 20 || Math.abs(y - z) >= 20 || Math.abs(z - x) >= 20));
