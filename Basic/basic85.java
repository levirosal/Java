// 85. Write a Java program to check if a string starts with a specified word. Go to the editor
// Sample Data: string1 = "Hello how are you?"
// Sample Output:
// true

import java.util.*;

public class basic85{
    public static void main(String[] args){
        run();
    }
    public static void run(){
        Scanner in = new Scanner(System.in);
        boolean result;

        System.out.print("Input a string: ");
        String text = in.nextLine();
        Scanner line = new Scanner(text);

        System.out.print("Input a specifed word: ");
        String word = in.nextLine();

        String first = line.next();
        
        if(first.equalsIgnoreCase(word)){
            result = true;
        }else{
            result = false;
        }
        System.out.println(result);
    }   
}