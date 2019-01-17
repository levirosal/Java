// 30. Write a Java program to convert a hexadecimal to a octal number.
// Input Data:
// Input a hexadecimal number: 40
// Expected Output
// Equivalent of octal number is: 100

import java.util.*;

public class basic30{
    public static void main(String[] args){
        run();
    }
    public static void run(){
        Scanner in = new Scanner(System.in);        

        System.out.print("Input a Hexadeciaml number: ");
        String valueHexa = in.nextLine();
      
        int valDec = hexForDec(valueHexa);
        String valOctal = decForOctal(valDec);

        System.out.println("Equivalent of octal Number is " + valOctal);      
    }

    public static int hexForDec(String valHexa) {
        int valDec1 = 0;
        int position = -1;
        char[] hexa = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
      
        for (int i=valHexa.length(); i > 0; i--) {
           position = Arrays.binarySearch(hexa, valHexa.charAt(i-1));
           valDec1 += position * Math.pow(16, (valHexa.length()-i));
        }      
        return valDec1;
    }

    public static String decForOctal(int valOctal1){
        StringBuilder sb = new StringBuilder();
        int rest = -1;
        
        if (valOctal1 == 0) {
            return "0";
        }      
        while (valOctal1 > 0) {
            rest = valOctal1 % 8;
            valOctal1 = valOctal1 / 8;
            sb.insert(0, rest);
        }        
        return sb.toString();
    }   
}