// 22. Write a Java program to convert a binary number to decimal number.
// Input Data:
// Input a binary number: 100
// Expected Output :
// Decimal Number: 4 

import java.util.*;

public class basic22{
    public static void main(String[] args) {
        run();
    }
    public static void run(){
        Scanner in = new Scanner(System.in);
        int value = 0;
        String stringValue = "";
        
        System.out.print("Input binary number: ");
        stringValue = in.nextLine();
 
        for (int i=stringValue.length(); i > 0; i--) {
           value += Integer.parseInt(stringValue.charAt(i-1) + "") * Math.pow(2, (stringValue.length()-i));
        }      
        System.out.println("Decimal number: " + value);
    }
}