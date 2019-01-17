// 92. Write a Java program to count the number of even and odd elements in a given array of integers.

import java.util.*;

public class basic92{
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