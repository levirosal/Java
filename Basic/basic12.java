// 12. Write a Java program that takes three numbers as input to calculate and print the average of the numbers.


import java.util.Scanner;

public class basic12{
    public static void main(String[] args) {
        run();
    }
    public static void run(){
        Scanner in = new Scanner(System.in);
        float n1 = 0.0f;
        float n2 = 0.0f;
        float n3 = 0.0f;
        float average = 0.0f;
   
        System.out.print("Input number: ");
        n1 = in.nextFloat();

        System.out.print("Input number: ");
        n2 = in.nextFloat();

        System.out.print("Input number: ");
        n3 = in.nextFloat();
        
        average = (n1 + n2 + n3) / 3;

        System.out.println("Average : " + average);
    }
}