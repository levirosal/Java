// 99. Write a Java program to check if a specified number appears in every pair of adjacent element of a given array of integers.
import java.util.*;

public class basic99{
    public static void main(String[] args){
        run();
    }
    public static void run(){
        ArrayList<Integer> list = new ArrayList<Integer>();
        boolean result = false;

        while(list.size() < 10){
            list.add((int) (Math.random() * 10) * 10);
        }

        System.out.println(list);
        
        for(int i = 0; i < list.size(); i++){
            if(i < list.size() - 5 && list.get(i) == list.get(i + 2) && list.get(i) == list.get(i + 4)){
                result = true;
            }          
        }
        System.out.println("Specified number appears in every pair of adjacent element: " + result);
    }
}