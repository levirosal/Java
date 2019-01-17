// 76. Write a Java program to test if the first and the last element of two array of integers are same. The length of the array must be greater than or equal to 2. Go to the editor
// Test Data: array1 = 50, -20, 0, 30, 40, 60, 12
// array2 = 45, 20, 10, 20, 30, 50, 11
// Sample Output:
// false
import java.util.*;

public class basic76{
    public static void main(String[] args){
        run();
    }
    public static void run(){
        ArrayList<Integer> list1 = new ArrayList<Integer>();
        ArrayList<Integer> list2 = new ArrayList<Integer>();
        boolean result;

        while(list1.size() < 5){
            list1.add(((int) (Math.random() * 10)) * 10);
        }

        while(list2.size() < 5){
            list2.add(((int) (Math.random() * 10)) * 10);
        }

        System.out.println(list1 + "\n" + list2);

        if(list1.get(0) == list2.get(0) || list1.get(list1.size() -1) == list2.get(list2.size() -1)){
            result = true;
        }else{
            result = false;
        }
        System.out.println(result);
  
    }   
}