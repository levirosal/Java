// 82. Write a Java program to find the largest element between first, last, and middle values from an array of integers (even length). Go to the editor
// Sample Output:
// Original Array: [20, 30, 40, 50, 67]                                   
// Largest element between first, last, and middle values: 67 
import java.util.*;

public class basic82{
    public static void main(String[] args){
        run();
    }
    public static void run(){
        ArrayList<Integer> list = new ArrayList<Integer>();

        while(list.size() < 5){
            list.add(((int) (Math.random() * 10)) * 10);
        }
        System.out.println("Original Array: " + list);

        int result = list.get(0);

        if(result <= list.get(list.size() - 1)){
            result = list.get(list.size() - 1);
        }
        if(result <= list.get(list.size() / 2)){
            result = list.get(list.size() / 2);
        }
        System.out.println("Largest element between first, last, and middle values: " + result);  
    }
}