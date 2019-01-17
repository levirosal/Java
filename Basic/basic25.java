// 25. Write a Java program to convert a octal number to a decimal number.
// Input Data:
// Input any octal number: 10 
// Expected Output : 
// Equivalent decimal number: 8

import java.util.*;

public class basic25{
    public static void main(String[] args){
        run();
    }
    public static void run(){
        Scanner in = new Scanner(System.in);
        int value = 0;
        String valueOctal = "";

        System.out.print("Input any octal number: ");
        valueOctal = in.nextLine();

        for (int i = valueOctal.length(); i > 0; i--) {
            value += Integer.parseInt(valueOctal.charAt(i-1) + "") * Math.pow(8, (valueOctal.length()-i));
        }
        
        System.out.println("Equivalent decimal number: " + value);

    }
}