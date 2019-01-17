// 29. Write a Java program to convert a hexadecimal to a binary number.
// Input Data:
// Enter Hexadecimal Number : 37
// Expected Output

// Equivalent Binary Number is: 110111

import java.util.*;

public class basic29{
    public static void main(String[] args){
        run();
    }
    public static void run(){
        Scanner in = new Scanner(System.in);        
        StringBuilder sb = new StringBuilder();
        String valBin = null;
        int position = 0;
        int positionArrayHexa = -1;

        char[] hexa = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

        System.out.print("Input a Hexadeciaml number: ");
        String valueHexa = in.nextLine();  
      
        while (position < valueHexa.length()){
            positionArrayHexa = Arrays.binarySearch(hexa, valueHexa.charAt(position));
            valBin = decForBin(positionArrayHexa);
            
            if (valBin.length() != 4 && position > 0) {
                for (int i = 0; i < (4 - valBin.length()); i++){
                    sb.append("0");                
                }
            }
           sb.append(valBin);
           position++;
        }
        System.out.println("Equivalent Binary Number is " + sb.toString());      
    }
    public static String decForBin(int valDec){
        int rest = -1;
        StringBuilder sb = new StringBuilder();
        
        if (valDec == 0) {
            return "0";
        }        
        while (valDec > 0) {
            rest = valDec % 2;
            valDec = valDec / 2;
            sb.insert(0, rest);
        }        
        return sb.toString();
    }
}