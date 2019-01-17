// 28. Write a Java program to convert a hexadecimal to a decimal number.
// Input Data:
// Input a hexadecimal number: 25
// Expected Output

// Equivalent decimal number is: 37

import java.util.*;

public class basic28{
    public static void main(String[] args){
        run();
    }
    public static void run(){
        Scanner in = new Scanner(System.in);        
        StringBuilder sb = new StringBuilder();
        int value = 0;
        int position = -1;

        char[] hexa = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
        
        System.out.print("Input a Hexadeciaml number: ");
        String valueHexa = in.nextLine();        
      
        for (int i=valueHexa.length(); i > 0; i--) {
           position = Arrays.binarySearch(hexa, valueHexa.charAt(i-1));
           value += position * Math.pow(16, (valueHexa.length()-i));
        }
        System.out.println("Equivalent decimal number is: " + value);      
    }
}