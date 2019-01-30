// 109. Write a Java program to form a staircase shape of n coins where every k-th row must have exactly k coins.
import java.util.*;

public class basic109{
    public static void main(String[] args){
        run();
    }
    public static void run(){
        Scanner in = new Scanner(System.in);

        System.out.print("Input integer : ");
        int value = in.nextInt();

        System.out.println("Number of rows: " + ((int)((Math.sqrt(8 * (long)value + 1) - 1) / 2)));
    }
}
