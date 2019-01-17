// 75. Write a Java program to test if the first and the last element of an array of integers are same. The length of the array must be greater than or equal to 2.
// Test Data: array = 50, -20, 0, 30, 40, 60, 10
// Sample Output:
// false
import java.util.*;

public class basic75{
    public static void main(String[] args){
        run();
    }
    public static void run(){
        ArrayList<Integer> list = new ArrayList<Integer>();  
        boolean result;

        while(list.size() < 5){
            list.add(((int) (Math.random() * 10)) * 10);
        }

        System.out.println(list);

        if(list.get(0) == 10 || list.get(list.size() -1) == 10){
            result = true;
        }else{
            result = false;
        }
        System.out.println(result);
  
    }   
}