// 9. Write a Java program that accepts two integers from the user and then prints the sum, the difference, the product, the average, the distance (the difference between integer), the maximum (the larger of the two integers), the minimum (smaller of the two integers).

import java.util.Scanner;

public class datatype09{
    public static void main(String[] args) {
        run();
    }
    public static void run(){
        Scanner in = new Scanner(System.in);
        int n1,n2;

        System.out.print("Input first number: ");
        n1 = in.nextInt();

        System.out.print("Input second number: ");
        n2 = in.nextInt();

        System.out.printf("Sum of two integers: %d%n", n1 + n2);
        System.out.printf("Difference of two integers: %d%n", n1 - n2);
        System.out.printf("Product of two integers: %d%n", n1 * n2);
        System.out.printf("Average of two integers: %.2f%n", (double) (n1 + n2) / 2);
        System.out.printf("Distance of two integers: %d%n", Math.abs(n1 - n2));
        System.out.printf("Max integer: %d%n", Math.max(n1, n2));
        System.out.printf("Min integer: %d%n", Math.min(n1, n2));
    }
}
