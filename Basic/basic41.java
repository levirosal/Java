// 41. Write a Java program to print the ascii value of a given character.
// Expected Output

// The ASCII value of Z is :90

import java.util.*;

public class basic41{
    public static void main(String[] args){
        run();
    }
    public static void run(){
        Scanner in = new Scanner(System.in);

        System.out.print("Input a string: ");
        char[] text = in.nextLine().toCharArray();

        for (int value : text){
            System.out.println("The ASCII value : " + value);          
        }
    }
}