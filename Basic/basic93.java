// 93. Write a Java program to test if an array of integers contains an element 10 next to 10 or an element 20 next to 20, but not both.

import java.util.*;

public class basic93{
    public static void main(String[] args){
        run();
    }
    public static void run(){
        ArrayList<Integer> list = new ArrayList<Integer>();
        int even = 0;
        int odd = 0;

        while(list.size() < 5){
            list.add((int) (Math.random() * 10));
        }

        System.out.println(list);

        for(int i = 0 ; i < list.size() ; i++){
            if(list.get(i) % 2 == 0){
                even++;
            }else{
                odd++;
            }
        }
        System.out.println("Even: " + even + "\nOdd: " + odd);
    }   
}