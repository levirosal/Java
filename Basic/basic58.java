// 58. Write a Java program to capitalize the first letter of each word in a sentence. 
// Sample Output: 
// Input a Sentence: the quick brown fox jumps over the lazy dog.         
// The Quick Brown Fox Jumps Over The Lazy Dog.
import java.util.*;

public class basic58{
    public static void main(String[] args){
        run();
    }
    public static void run(){
        Scanner in = new Scanner(System.in);
        String result = "";

        System.out.print("Input a string: ");
        String text = in.nextLine();
        Scanner line = new Scanner(text);      
        
        while(line.hasNext()){
            String value = line.next();
            result += Character.toUpperCase(value.charAt(0)) + value.substring(1) + " ";             
        }
        System.out.println(result);
	}    
}