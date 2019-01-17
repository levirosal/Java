// 19. Write a Java program to convert a decimal number to binary number.
// Input Data:
// Input a Decimal Number : 5
// Expected Output

// Binary number is: 101 
import java.util.Scanner;

public class basic19{
    public static void main(String[] args) {
        run();
    }

    public static void run(){
        Scanner in = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();       
        int value;
        int rem = -1;
        
        System.out.print("Input decimal number: ");
        value = in.nextInt();
                     
        if (value == 0){
            System.out.println("Binary number is: 0");
        }else{
            while (value > 0){
                rem = value % 2;
                value = value / 2;
                sb.insert(0, rem);
            }
            System.out.println("Binary number is: " + sb.toString());
        }       
    }
}