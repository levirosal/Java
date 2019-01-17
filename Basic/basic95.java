// 95. Write a Java program to create an array (length # 0) of string values. The elements will contain "0", "1", "2" … through ... n-1.

import java.util.*;

public class basic95{
    public static void main(String[] args){
        run();
    }
    public static void run(){
        int n = 5;
        int[] array = new int[n];
        
        for(int i = 0; i < n; i++){   
            array[i] = Integer.valueOf(i);                                  
        }
        System.out.println("Array: " + Arrays.toString(array));                                     
    }   
}