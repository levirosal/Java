// 83. Write a Java program to multiply corresponding elements of two arrays of integers. Go to the editor
// Sample Output:
// Array1: [1, 3, -5, 4]                                                                                                                         
// Array2: [1, 4, -5, -2]                                                                                                                        
// Result: 1 12 25 -8
import java.util.*;

public class basic83{
    public static void main(String[] args){
        run();
    }
    public static void run(){
        ArrayList<Integer> list1 = new ArrayList<Integer>();
        ArrayList<Integer> list2 = new ArrayList<Integer>();
        ArrayList<Integer> result = new ArrayList<Integer>();

        while(list1.size() < 5){
            list1.add((int) (Math.random() * 10));
        }

        while(list2.size() < 5){
            list2.add((int) (Math.random() * 10));
        }

        System.out.println("Array1: " + list1 + "\nArray2: " + list2);

        for(int i = 0 ; i < list1.size(); i++){
            result.add(list1.get(i) * list2.get(i));            
        }

        System.out.println("Result: " + result);
  
    }   
}