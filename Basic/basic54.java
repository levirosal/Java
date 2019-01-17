// 54. Write a Java program that accepts three integers from the user and return true if two or more of them (integers ) have the same rightmost digit. The integers are non-negative. 
// Sample Output:
// Input the first number : 5                                             
// Input the second number: 10                                            
// Input the third number : 15                                            
// The result is: true
import java.util.*;

public class basic54{
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
        
        if((n1 % 10 == n2 % 10) || (n1 % 10 == n3 % 10) || (n2 % 10 == n3 % 10)){
            result = true;
        }else{
            result = false;
        }       
        System.out.println("The result is: " + result);
    }
}
