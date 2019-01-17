// 17. Write a Java program to add two binary numbers.
// Input Data:
// Input first binary number: 10 
// Input second binary number: 11
// Expected Output:
// Sum of two binary numbers: 101
import java.util.Scanner;

public class basic17{
    public static void main(String[] args) {
        run();
    }

    public static void run(){
        Scanner in = new Scanner(System.in);
        long b1, b2;
        int i = 0;
        int remainder = 0;
        int[] sum = new int[20];
      
        System.out.print("Input first binary number: ");
        b1 = in.nextLong();
        System.out.print("Input second binary number: ");
        b2 = in.nextLong();
      
        while (b1 != 0 || b2 != 0){
            sum[i++] = (int)((b1 % 10 + b2 % 10 + remainder) % 2);
            remainder = (int)((b1 % 10 + b2 % 10 + remainder) / 2);
            b1 = b1 / 10;
            b2 = b2 / 10;
        }
        if (remainder != 0){
         sum[i++] = remainder;
        }
        i--;
        System.out.print("Sum of two binary numbers: ");
        while (i >= 0) {
         System.out.print(sum[i--]);
        }
         System.out.print("\n");  
    }
}