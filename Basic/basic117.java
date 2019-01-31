// 117. Write a Java program to compute the square root of an given integer.// for the multiples of five. When number is divided by both three and five, print "fizz buzz". 

import java.util.*;
public class basic117{
    public static void main(String[] args){
        run();
    }
    public static void run(){
        Scanner in = new Scanner(System.in);

        System.out.print("Input number: ");
        int n = in.nextInt();

        System.out.printf("%.2f %n",Math.sqrt(n));
    }
}
