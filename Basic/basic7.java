// 7. Write a Java program that takes a number as input and prints its multiplication table upto 10.
// Test Data:
// Input a number: 8
// Expected Output :
// 8 x 1 = 8
// 8 x 2 = 16
// 8 x 3 = 24
// ...
// 8 x 10 = 80

import java.util.Scanner;

public class basic7{
    public static void main(String[] args) {
        run();
    }
    public static void run(){
        Scanner in = new Scanner(System.in);
        int n1,n2;
   
        System.out.print("Input first number: ");
        n1 = in.nextInt();
        
        System.out.println(n1 + " x 1" + " = " + (n1 * 1));
        System.out.println(n1 + " x 2" + " = " + (n1 * 2));
        System.out.println(n1 + " x 3" + " = " + (n1 * 3));
        System.out.println(n1 + " x 4" + " = " + (n1 * 4));
        System.out.println(n1 + " x 5" + " = " + (n1 * 5));
        System.out.println(n1 + " x 6" + " = " + (n1 * 6));
        System.out.println(n1 + " x 7" + " = " + (n1 * 7));
        System.out.println(n1 + " x 8" + " = " + (n1 * 8));
        System.out.println(n1 + " x 9" + " = " + (n1 * 9));
        System.out.println(n1 + " x 10" + " = " + (n1 * 10));

    }
}