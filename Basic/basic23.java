// 23. Write a Java program to convert a binary number to hexadecimal number.
// Input Data:
// Input a Binary Number: 1101 
// Expected Output :
// HexaDecimal value: D

import java.util.*;

public class basic23{
    public static void main(String[] args){
        run();
    }
    public static void run(){
        Scanner in = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        int init = 0;
        int fin = 0;
        String bin = "";
        
        System.out.print("Input a Binary Number: ");
        bin = in.nextLine();
        
        char[] hexa = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
        char incre = '.';
      
        init = bin.length();
        fin = init;
      
        while (init > 0) {
           init = ((init - 4) >= 0) ? init - 4 : 0;

           incre = hexa[BinForDec(bin.substring(init, fin))];
           sb.insert(0, incre);
      
           fin = init;
        }
        System.out.println("Hexadecimal Number: " + sb.toString());        
    }
    public static int BinForDec(String valBin) {
        int valDec = 0;
        for (int i=valBin.length(); i > 0; i--) {
           valDec += Integer.parseInt(valBin.charAt(i-1)+"")*Math.pow(2, (valBin.length()-i));
        }      
        return valDec;
    }
}