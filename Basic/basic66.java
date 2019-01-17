// 66. Write a Java program to compute the sum of the first 100 prime numbers.
// Sample Output:
// Sum of the first 100 prime numbers: 24133  
import java.util.*;

public class basic66{
    public static void main(String[] args){
        run();
    }
    public static void run(){
        int sum = 1;
        int count = 0; 
        int n = 0; 
           
        while (count < 100){
            n++; 
            if(n % 2 != 0){ 
                if (prime(n)){
                    sum += n; 
                    count++; 
                }
            }	
        }
        System.out.println("Sum of the first 100 prime numbers: " + sum); 	
    }      
    public static boolean prime(int n){
        for (int i = 3 ; i * i <= n ; i += 2){
            if (n % i == 0) {
                return false; 
            }
        }
        return true;
    }
}
