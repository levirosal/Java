// 51. Write a Java program to convert a string to an integer in Java.
// Sample Output:
// Input a number(string): 25                                             
// The integer value is: 25

import java.util.*;

public class basic51{
    public static void main(String[] args){
        run();
    }
    public static void run(){
        Scanner in = new Scanner(System.in);

        System.out.print("Input a number(string): ");
        String nString = in.nextLine();

		int nInt = Integer.parseInt(nString);
        
        System.out.println("The integer value is: " + nInt);
    }
}
