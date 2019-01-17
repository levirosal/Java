// 37. Write a Java program to reverse a string. Go to the editor
// Input Data:
// Input a string: The quick brown fox 
// Expected Output

// Reverse string: xof nworb kciuq ehT

import java.util.*;

public class basic37{
    public static void main(String[] args){
        run();
    }
    public static void run(){
        Scanner in = new Scanner(System.in);
        String reverse = "";

        System.out.print("Input a string: ");
        char[] let = in.nextLine().toCharArray();

        for (int i = let.length - 1; i >= 0; i--){
            reverse += let[i];
        }
        System.out.println("Reverse string : " + reverse);
    }
}