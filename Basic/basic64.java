// 64. Write a Java program that accepts two integer values between 25 to 75 and return true if there is a common digit in both numbers.
// Sample Output:
// Input the first number : 35                                            
// Input the second number: 45                                            
// Result: true
import java.util.*;

public class basic64{
    public static void main(String[] args){
        run();
    }
    public static void run(){
        Scanner in = new Scanner(System.in);

        System.out.print("Input the first number: ");
        int n1 = in.nextInt();

        System.out.print("Input the second number: ");
        int n2 = in.nextInt();

        if(n1 > 25 && n1 < 75 && n2 > 25 && n2 < 75){
            int n11 = n1 % 10;
            int n22 = n2 % 10;
            n1 /= 10;
            n2 /= 10;
            System.out.println("Result: " + (n1 == n2 || n1 == n22 || n11 == n2 || n11 == n22));
        }else{
            System.out.println("Insert two integer values between 25 to 75");
        }
	}    
}