// 107. Write a Java program to check if an array of integers contains three increasing adjacent numbers.
import java.util.*;

public class basic107{
    public static void main(String[] args){
        run();
    }
    public static void run(){
        ArrayList<Integer> list1 = new ArrayList<Integer>();
        boolean result = false;
     
        while(list1.size() < 10){
            list1.add((int) (Math.random() * 100));
        }
        // list1.add(10);
        // list1.add(11);
        // list1.add(12);
        // list1.add(13);

        System.out.println("Array : " + list1);

        for(int i = 0 ; i < list1.size() - 3 ; i++){
            result = list1.get(i) + 1 == list1.get(i + 1) && list1.get(i) + 2 == list1.get(i + 2) && list1.get(i) + 3 == list1.get(i + 3) ? true : false;         
        }
        System.out.println("Result : " + result);  
    }
}