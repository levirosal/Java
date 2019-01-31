// 113. Write a Java program to merge two given sorted array of integers and create a new sorted array.
// array1 = [1,2,3,4]
// array2 = [2,5,7, 8]
// result = [1,2,2,3,4,5,7,8]

import java.util.*;

public class basic113{
    public static void main(String[] args){
        run();
    }
    public static void run(){
        ArrayList<Integer> list1 = new ArrayList<Integer>();
        ArrayList<Integer> list2 = new ArrayList<Integer>();

        while(list1.size() < 4 && list2.size() < 4){
            list1.add((int) (Math.random() * 100));
            list2.add((int) (Math.random() * 100));
        }       

        System.out.println("List 01: " + list1);
        System.out.println("List 02: " + list2);

        list1.addAll(list2);
        Collections.sort(list1);

        System.out.println("Result: " + list1);
    }
}
