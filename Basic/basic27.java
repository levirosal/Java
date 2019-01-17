// 27. Write a Java program to convert a octal number to a hexadecimal number.
// Input Data:
// Input a octal number : 100 
// Expected Output
// Equivalent hexadecimal number: 40

import java.util.*;

public class basic27{
    public static void main(String[] args){
        run();
    }
    public static void run(){
        Scanner in = new Scanner(System.in);  
        String valOctal = "";

        System.out.print("Input any octal number: ");
        valOctal = in.nextLine();

        int valDec = octalForDec(valOctal);
  
        String valHexa = decForHex(valDec);
        
        System.out.println("Equivalent hexadecimal number: " + valHexa);
    }

    public static int octalForDec(String valOctal){
        int value = 0;
        
        for (int i=valOctal.length(); i > 0; i--){
            value += Integer.parseInt(valOctal.charAt(i-1) + "") * Math.pow(8, (valOctal.length()-i));
        }        
        return value;
    }

    public static String decForHex(int valDec1){
        char[] hexa = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
        int rest = -1;
        StringBuilder sb = new StringBuilder();
        
        if (valDec1 == 0) {
            return "0";
        }        
        while (valDec1 > 0) {
            rest = valDec1 % 16;
            valDec1 = valDec1 / 16;
            sb.insert(0, hexa[rest]);
        }   
        return sb.toString();
    }     
}