// 59. Write a Java program to convert a given string into lowercase. 
// Sample Output:
// Input a String: THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG.           
// the quick brown fox jumps over the lazy dog.
import java.util.*;

public class basic59{
    public static void main(String[] args){
        run();
    }
    public static void run(){
        Scanner in = new Scanner(System.in);
        String result = "";

        System.out.print("Input a string: ");
        String text = in.nextLine();
        Scanner line = new Scanner(text);      
        int i = 0;
        for(int n = text.length() -1 ; i <= n ; i++){
            result += Character.toLowerCase(text.charAt(i));           
        }
        System.out.println(result);
	}    
}