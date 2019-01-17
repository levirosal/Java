// 60. Write a Java program to find the penultimate (next to last) word of a sentence.
// Sample Output:
// Input a String: The quick brown fox jumps over the lazy dog.
// Penultimate word: lazy

import java.util.*;

public class basic60{
    public static void main(String[] args){
        run();
    }
    public static void run(){
        Scanner in = new Scanner(System.in);

        System.out.print("Input a string: ");
        String text = in.nextLine();

        String[] arrayStrings = text.split(" ");
        
        System.out.println("Penultimate word: " + arrayStrings[arrayStrings.length - 2]);
	}    
}