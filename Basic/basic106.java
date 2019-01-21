// 106. Write a Java program to create a new array that is left shifted from a given array of integers.
import java.util.*;

public class basic106{
    public static void main(String[] args){
        run();
    }
    public static void run(){
        ArrayList<Integer> list1 = new ArrayList<Integer>();
        
        while(list1.size() < 10){
            list1.add((int) (Math.random() * 10) * 10);
        }
        
        int first = list1.get(0);
        System.out.println("Original Array : " + list1);

              
        for(int i = 1; i <= list1.size() - 1; i++){
            list1.set(i - 1, list1.get(i));        
        }
        
        list1.set(list1.size() - 1,first);
        System.out.println("New Array      : " + list1);
    }
}