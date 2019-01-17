// 53. Write a Java program that accepts three integers from the user and return true if the second number is greater than first number and third number is greater than second number. If "abc" is true second number does not need to be greater than first number.
// Sample Output:

// Input the first number : 5                                             
// Input the second number: 10                                            
// Input the third number : 15                                            
// The result is: true
import java.util.*;

public class basic53{
    public static void main(String[] args){
        run();
    }
    public static void run(){
        Scanner in = new Scanner(System.in);
        
        System.out.print("Input the first number: ");
        int n1 = in.nextInt();
        
        System.out.print("Input the second number: ");
        int n2 = in.nextInt();
        
        System.out.print("Input the third number: ");
        int n3 = in.nextInt();       
        boolean result;

        if(n2 > n1 && n3 > n2 || n1 > n2 && n3 > n1){
            result = true;
        }else{
            result = false;
        }       
        System.out.println("The result is: " + result);
    }
}
