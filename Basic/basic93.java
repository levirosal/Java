// 93. Write a Java program to test if an array of integers contains an element 10 next to 10 or an element 20 next to 20, but not both.

import java.util.*;

public class basic93{
    public static void main(String[] args){
        run();
    }
    public static void run(){
        ArrayList<Integer> list = new ArrayList<Integer>();
        boolean case1 = false, case2 = false;

        while(list.size() < 5){
            list.add((int) (Math.random() * 10) * 10);
        }

        System.out.println(list);

        for(int i = 0 ; i < list.size() - 1 ; i++){
            int n = i +1;
            if(list.get(i) == 10 && list.get(n) == 10){
                case1 = true;
            }                        
            if(list.get(i) == 20 && list.get(n) == 20){   
                case2 = true;
            }
        }
        System.out.println("Contains an element 10 next to 10 ? " + case1 + "\ncontains an element 20 next to 20 ? " + case2);
    }   
}