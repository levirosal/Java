// 55. Write a Java program to convert seconds to hour, minute and seconds.
// Sample Output:
// Input seconds: 86399                                                   
// 23:59:59
import java.util.*;

public class basic55{
    public static void main(String[] args){
        run();
    }
    public static void run(){
        Scanner in = new Scanner(System.in);
        
        System.out.print("Input the first number: ");
        int seconds = in.nextInt();
        
        int x = seconds % 60;
        int y = seconds / 60;
        int z = y % 60;
        y = y / 60;
        System.out.println( y + ":" + z + ":" + x);
    }
}
