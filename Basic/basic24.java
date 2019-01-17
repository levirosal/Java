// 24. Write a Java program to convert a binary number to a Octal number.
// Input Data:
// Input a Binary Number: 111 
// Expected Output :
// Octal number: 7 

import java.util.*;

public class basic24{
    public static void main(String[] args){
        run();
    }
    public static void run(){
        Scanner in = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        int init = 0;
        int fin = 0;
        String bin = "";

		System.out.print("Input a Binary Number : ");
        bin = in.nextLine();

        init = bin.length();
        fin = init;
      
        while (init > 0) {
           init = ((init - 3) >= 0) ? init - 3 : 0;
      
           sb.insert(0, BinForDec(bin.substring(init, fin)));
      
           fin = init;
        }
      
        System.out.println("Octal Number: " + sb.toString());        
    }

    public static int BinForDec(String valBin) {
        int valDec = 0;
        for (int i=valBin.length(); i>0; i--) {
           valDec += Integer.parseInt(valBin.charAt(i-1)+"")*Math.pow(2, (valBin.length()-i));
        }      
        return valDec;
    }
}