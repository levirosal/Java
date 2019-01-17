// 63. Write a Java program that accepts two integer values from the user and return the larger values. However if the two values 
// are the same, return 0 and return the smaller value if the two values have the same remainder when divided by 6.
// Sample Output:
// Input the first number : 12                                            
// Input the second number: 13                                            
// Result: 13
import java.util.*;

public class basic63{
    public static void main(String[] args){
        run();
    }
    public static void run(){
        Scanner in = new Scanner(System.in);

        System.out.print("Input the first number: ");
        int n1 = in.nextInt();

        System.out.print("Input the second number: ");
        int n2 = in.nextInt();

        int result = 0;

        if(n1 > n2){
            result = n1;
        }
        
        if(n2 > n1){
            result = n2;
        }
        
        if(n1 == n2){
            result = 0;
        }
        
        if(n1 % 6 == n2 % 6){
            if(n1 < n2){
                result = n1;
            }else if(n2 < n1){
                result = n2;
            }            
        }
        System.out.println(result);
	}    
}