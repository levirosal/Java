// 103. Write a Java program to create a new array from a given array of integers, new array will contain the elements 
// from the given array after the last element value 10.
import java.util.*;

public class basic103{
    public static void main(String[] args){
        run();
    }
    public static void run(){
        ArrayList<Integer> list1 = new ArrayList<Integer>();
        ArrayList<Integer> list2 = new ArrayList<Integer>();

        while(list1.size() < 10){
            list1.add((int) (Math.random() * 10) * 10);
        }

        System.out.println("Old array : " + list1);

        for(int i = list1.size() - 1; i >= 0 ; i--){
            if(list1.get(i) == 10){   
                i++;
                while(i < list1.size()){
                    list2.add(list1.get(i));
                    i++;
                }
                break;
            }                            
        }
        System.out.println("New array : " + list2);            
    }
}