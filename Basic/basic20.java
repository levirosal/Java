// 20. Write a Java program to convert a decimal number to hexadecimal number.
// Input Data:
// Input a decimal number: 15
// Expected Output :
// Hexadecimal number is : F

import java.util.Scanner;

public class basic20{
    public static void main(String[] args) {
        run();
    }

    public static void run(){
        Scanner in = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        int value;
        int rem = -1;
        char[] hexa = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
        
        System.out.print("Input Decimal number: ");
        value = in.nextInt();      
      
        if (value == 0){
            System.out.println("Hexadecimal number is: 0");
        }else{
            while (value > 0){                
                rem = value % 16;
                value = value / 16;
                sb.insert(0, hexa[rem]);
                System.out.println("Hexadecimal number is: " + sb.toString());               
            }
        }      
    }
}