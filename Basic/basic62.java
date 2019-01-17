// 62. Write a Java program that accepts three integer values and return true if one of them is 20 or more and less than the substractions of others.
// Sample Output:
// Input the first number : 15                                            
// Input the second number: 20                                            
// Input the third number : 25                                            
// false
import java.util.*;

public class basic62{
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

        boolean result = false;

        if((n1 - n2) >= 20){
            result = true;
        }

        if((n1 - n3) >= 20){
            result = true;
        }

        if((n2 - n3) >= 20){
            result = true;
        }
        System.out.println(result);
	}    
}