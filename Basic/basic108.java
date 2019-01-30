// 108. Write a Java program to add all the digits of a given positive integer until the result has a single digit.
import java.util.*;

public class basic108{
    public static void main(String[] args){
        run();
    }
    public static void run(){
        Scanner in = new Scanner(System.in);

        System.out.print("Input integer : ");
        int value = in.nextInt();

        int result = value == 0 ? 0 : (value % 9 == 0 ? 9 : value % 9);

        System.out.println("Result : " + result);
    }
}
