// 104. Write a Java program to create a new array from a given array of integers, 
// new array will contain the elements from the given array before the last element value 10.
import java.util.*;

public class basic104{
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

        for(int i = 0; i < list1.size() ; i++){
            if(list1.get(i) == 10){
                for(int n = 0 ; n < i ; n++){
                    list2.add(list1.get(n));
                }
                break;
            }                            
        }
        System.out.println("New array : " + list2);            
    }
}