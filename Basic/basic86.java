// 86. Write a Java program start with an integer n, divide n by 2 if n is even or multiply by 3 and add 1 
// if n is odd, repeat the process until n = 1.

import java.util.*;

public class basic86{
    public static void main(String[] args){
        run();
    }
    public static void run(){
        Scanner in = new Scanner(System.in);
        int i = 0;

        System.out.print("Input a number: ");
        int n = in.nextInt();

        while(n != 1){           
            System.out.println(n);
            if(n % 2 == 0){
                n /=2;
                i++;
            }else{
                n = (3 * n + 1) / 2;
                i++;
            }
        }
        System.out.println(i);

    }   
}