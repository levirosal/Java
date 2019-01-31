// 111. Write a Java program to add two numbers without using any arithmetic operators.
// Given n1 = 10 and y = 12; result = 22

import java.util.*;

public class basic111{
    public static void main(String[] args){
        run();
    }
    public static void run(){
        Scanner in = new Scanner(System.in);

        System.out.print("Input first integer : ");
        int n1 = in.nextInt();

        System.out.print("Input second integer : ");
        int n2 = in.nextInt();

        while(n2 != 0){   
            int temp = n1 & n2;    
            n1 = n1 ^ n2;  
            n2 = temp << 1; 
        }

        System.out.println("Result: " + n1);
    }
}
