// 65. Write a Java program to calculate the modules of two numbers without using any inbuilt modulus operator.
// Sample Output:
// Input the first number : 19                                            
// Input the second number: 7                                             
// 5  
import java.util.*;

public class basic65{
    public static void main(String[] args){
        run();
    }
    public static void run(){
        Scanner in = new Scanner(System.in);

        System.out.print("Input the first number: ");
        int n1 = in.nextInt();

        System.out.print("Input the second number: ");
        int n2 = in.nextInt();

        int divid = n1 / n2;

        int result = n1 - (divid * n2);

        System.out.println("Result: " + result);
	}    
}