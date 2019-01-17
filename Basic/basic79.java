// 79. Write a Java program to rotate an array (length 3) of integers in left direction. Go to the editor
// Sample Output:
// Original Array: [20, 30, 40]                                           
// Rotated Array: [30, 40, 20]
import java.util.*;

public class basic79{
    public static void main(String[] args){
        run();
    }
    public static void run(){
        ArrayList<Integer> list1 = new ArrayList<Integer>();
        ArrayList<Integer> list2 = new ArrayList<Integer>();

        while(list1.size() < 3){
            list1.add(((int) (Math.random() * 10)) * 10);
        }

        System.out.println(list1);       
        
        for(int i = 1 ; i < list1.size() ; i++){
            list2.add(list1.get(i));            
        }
        
        list2.add(list1.get(0));
        System.out.println(list2);  
    }   
}