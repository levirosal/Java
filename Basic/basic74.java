// 74. Write a Java program to test if 10 appears as either the first or last element of an array of integers. The length of the array must be greater than or equal to 2. Go to the editor
// Sample Output: 
// Test Data: array = 10, -20, 0, 30, 40, 60, 10
// true
import java.util.*;

public class basic74{
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