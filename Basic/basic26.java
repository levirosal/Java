// 26. Write a Java program to convert a octal number to a binary number.
// Input Data:
// Input any octal number: 7 
// Expected Output :
// Equivalent binary number: 111 

import java.util.*;

public class basic26{
    public static void main(String[] args){
        run();
    }
    public static void run(){
        Scanner in = new Scanner(System.in);        
        StringBuilder sb = new StringBuilder();
        String valBin = "";
        String valueOctal = "";
        int position = 0;
        
        System.out.print("Input any octal number: ");
        valueOctal = in.nextLine();

        while (position < valueOctal.length()){
            valBin = decForBin(Integer.parseInt(valueOctal.charAt(position)+""));            
            if (valBin.length() != 3  && position > 0){                
                for (int i=0; i < (3-valBin.length()); i++){                    
                    sb.append("0");
                }
            }
            sb.append(valBin);
            position++;
        }
        System.out.println("Equivalent binary number: " + sb.toString());
    }

    public static String decForBin(int valDec) {
        int rest = -1;
        StringBuilder sb = new StringBuilder();
      
        if (valDec == 0) {
           return "0";
        }

        while (valDec > 0){
            rest = valDec % 2;
            valDec = valDec / 2;
            sb.insert(0, rest);
        }     
        return sb.toString();
    }
}