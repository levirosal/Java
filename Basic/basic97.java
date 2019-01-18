// 97. Write a Java program to check if an array of integers contains a specified number next to each other
// or there are two same specified numbers separated by one element.
import java.util.*;

public class basic97{
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
        
        for(int i = 0; i < list.size() - 1; i++){
            if(list.get(i) == list.get(i + 1)){
                case1 = true;
            }
            
            if(i <= list.size() - 3 && list.get(i) == list.get(i + 2)){
                case2 = true;
            }
        }   
            System.out.println("Case 01: " + case1);
            System.out.println("Case 02: " + case2);
    }
}