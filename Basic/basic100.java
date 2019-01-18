// 100. Write a Java program to count the two elements differ by 1 or less of two given arrays of integers with same length.
import java.util.*;

public class basic100{
    public static void main(String[] args){
        run();
    }
    public static void run(){
        ArrayList<Integer> list1 = new ArrayList<Integer>();
        ArrayList<Integer> list2 = new ArrayList<Integer>();
        int count = 0;

        while(list1.size() < 10){
            list1.add((int) (Math.random() * 100));
        }

        while(list2.size() < 10){
            list2.add((int) (Math.random() * 10) * 10);
        }

        System.out.println(list1);
        System.out.println(list2);
        
        for(int i = 0; i < list1.size(); i++){
            if(list1.get(i) == list2.get(i) + 1 || list1.get(i) == list2.get(i) - 1){
                count ++;
            }          
        }
        System.out.println("Count matchs: " + count);
    }
}