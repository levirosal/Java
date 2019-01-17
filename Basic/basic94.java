// 94. Write a Java program to rearrange all the elements of an given array of integers 
// so that all the odd numbers come before all the even numbers.

import java.util.*;

public class basic94{
    public static void main(String[] args){
        run();
    }
    public static void run(){
        int[] list = {1, 7, 8, 5, 7, 13, 0, 2, 4, 9};
        int i = 0;
	  
        System.out.println("Original Array: " + Arrays.toString(list));

        while(i < list.length && list[i] % 2 == 0)
            i++;
                  
        for(int j = i + 1; j < list.length; j++) {
            if(list[j] % 2 != 0) {
                int temp = list[i];
                list[i] = list[j];
                list[j] = temp;
                i++;
            }
        }
        System.out.println("New Array: " + Arrays.toString(list));                                         
    }   
}