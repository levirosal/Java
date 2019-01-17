// 56. Write a Java program to find the number of integers within the range of two specified numbers and that are divisible by another number. Go to the editor
// For example x = 5, y=20 and p =3, find the number of integers within the range x..y and that are divisible by p i.e. { i :x ≤ i ≤ y, i mod p = 0 }
// Sample Output:
// 5
import java.util.*;

public class basic56{
    public static void main(String[] args){
        run();
    }
    public static void run(){
        Scanner in = new Scanner(System.in);

        System.out.print("Input the first number: ");
        int x = in.nextInt();

        System.out.print("Input the second number: ");
        int y = in.nextInt();

        System.out.print("Input the third number: ");
        int p = in.nextInt();

        int count = 0;

        for(int i = x ; i < y ; i++){
            if((i % p) == 0){
                count++;
            }
        }        
		System.out.println(count);
	}    
}