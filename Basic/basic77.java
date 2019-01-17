// 77. Write a Java program to create a new array of length 2 from two arrays of integers with three elements and the new array will contain the first and last elements from the two arrays. Go to the editor
// Test Data: array1 = 50, -20, 0
// array2 = 5, -50, 10
// Sample Output:
// Array1: [50, -20, 0]                                                   
// Array2: [5, -50, 10]                                                   
// New Array: [50, 10]
import java.util.*;

public class basic77{
    public static void main(String[] args){
        run();
    }
    public static void run(){
        ArrayList<Integer> list1 = new ArrayList<Integer>();
        ArrayList<Integer> list2 = new ArrayList<Integer>();
        ArrayList<Integer> result = new ArrayList<Integer>();

        while(list1.size() < 3){
            list1.add(((int) (Math.random() * 10)) * 10);
        }

        while(list2.size() < 3){
            list2.add(((int) (Math.random() * 10)) * 10);
        }

        System.out.println(list1 + "\n" + list2);

        result.add(list1.get(0));
        result.add(list2.get(list2.size() -1));

        System.out.println(result);
  
    }   
}