// 81. Write a Java program to swap the first and last elements of an array (length must be at least 1) and create a new array. Go to the editor
// Sample Output:
// Original Array: [20, 30, 40]                                           
// New array after swaping the first and last elements: [40, 30, 20] 
import java.util.*;

public class basic81{
    public static void main(String[] args){
        run();
    }
    public static void run(){
        ArrayList<Integer> list1 = new ArrayList<Integer>();
        ArrayList<Integer> list2 = new ArrayList<Integer>();

        while(list1.size() < 5){
            list1.add(((int) (Math.random() * 10)) * 10);
        }

        System.out.println("Original Array: " + list1);

        list2.add(list1.get(list1.size() - 1));

        for(int i = 1 ; i < (list1.size() - 1) ; i++){
            list2.add(list1.get(i));            
        }
        
        list2.add(list1.get(0));
        System.out.println("New array after swaping the first and last elements: " + list2);  
    }   
}