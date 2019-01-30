// 110. Write a Java program to check whether an given integer is a power of 4 or not.
// Given num = 64, return true. Given num = 6, return false.

import java.util.*;

public class basic110{
    public static void main(String[] args){
        run();
    }
    public static void run(){
      boolean result = false;
        Scanner in = new Scanner(System.in);

        System.out.print("Input integer : ");
        int value = in.nextInt();

        int n = 4;

        for(int i = 0 ; n < value ; i++){
            while(n < value){
                n = n * 4;
            }                
            if(n == value){
              result = true;
            }
        }
        System.out.println("Result: " + result);
    }
}
