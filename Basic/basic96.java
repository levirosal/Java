// 96. Write a Java program to check if there is a 10 in a given array of integers with a 20 somewhere later in the array. 

import java.util.*;

public class basic96{
    public static void main(String[] args){
        run();
    }
    public static void run(){
        ArrayList<Integer> list = new ArrayList<Integer>();
        boolean case1 = false, case2 = false;

        while(list.size() < 10){
            list.add((int) (Math.random() * 10) * 10);
        }

        System.out.println(list);
        
        for(int i = 0; i < list.size() ; i++){

            if(list.get(i) == 10){
                case1 = true;
            }
            
            if(case1 && list.get(i) == 20){
                case2 = true;               
            }
        }
        System.out.println("There is a 10 with a 20 somewhere later in the array: " + case2);                                     
    }   
}