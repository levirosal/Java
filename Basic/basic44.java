// 44. Write a Java program that accepts an integer (n) and computes the value of n+nn+nnn.
// Sample Output:
// Input number: 5                                                        
// 5 + 55  + 555

import java.util.*;

public class basic44{
    public static void main(String[] args){
        run();
    }
    public static void run(){
        Scanner in = new Scanner(System.in);
        int n;
        char s1, s2, s3;

        System.out.print("Input number: ");
        n = in .nextInt();
        
        System.out.printf("%d + %d%d  + %d%d%d\n", n, n, n, n, n, n);    
    }
}