// 115. Write a Java program to check if a positive number is a palindrome or not.
// Input a positive integer: 151
// Is 151 is a palindrome number?
// true
import java.util.*;

public class basic115{
    public static void main(String[] args){
        run();
    }
    public static void run(){
        Scanner in = new Scanner(System.in);
        boolean result = false;

        System.out.print("Input number: ");
        int n = in.nextInt();

        String valueText = Integer.toString(n);
        String reverse = new StringBuffer(valueText).reverse().toString();

        if(valueText.equals(reverse)){
          result = true;
        }

        System.out.println("Result: " + result);
    }
}
