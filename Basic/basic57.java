// 57. Write a Java program to accepts an integer and count the factors of the number.
// Sample Output:
// Input an integer: 25                                                   
// 3
import java.util.*;

public class basic57{
    public static void main(String[] args){
        run();
    }
    public static void run(){
        Scanner in = new Scanner(System.in);

        System.out.print("Input the number: ");
        int value = in.nextInt();

        int result = 0;
		System.out.println((int)Math.sqrt(value));

        for(int i = 1; i <= (int)Math.sqrt(value); i++) {
            if(value % i == 0 && i * i != value) {
                result+=2;
            }else if(i * i == value){
                result++;
            }
        }
		System.out.println(result);
	}    
}