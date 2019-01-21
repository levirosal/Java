// 105. Write a Java program to check if a group of numbers (l) at the start and end of a given array are same.
import java.util.*;

public class basic105{
    public static void main(String[] args){
        run();
    }
    public static void run(){
        ArrayList<Integer> list1 = new ArrayList<Integer>();
        boolean result = false;
        int count = 0;
     
        while(list1.size() < 10){
            list1.add((int) (Math.random() * 10) * 10);
        }

        System.out.println("Array : " + list1);

        for(int i = 0, n = (list1.size() - 2) ; i <= 1 ; i++, n++){
            if(list1.get(i) == list1.get(n)){
                count++;
            }
            if(count == 2){
                result = true;
            }                           
        }
        System.out.println("Result : " + result);
    }
}