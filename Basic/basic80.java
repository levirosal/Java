// 80. Write a Java program to get the larger value between first and last element of an array (length 3) of integers . Go to the editor
// Sample Output:
// Original Array: [20, 30, 40]                                           
// Larger value between first and last element: 40 
import java.util.*;

public class basic80{
    public static void main(String[] args){
        run();
    }
    public static void run(){
        ArrayList<Integer> list = new ArrayList<Integer>();  
        int result = 0;

        while(list.size() < 5){
            list.add((int) (Math.random() * 10) * 10);
        }

        System.out.println(list);

        for(int i = 0 ; i < list.size() ; i++){
            if(list.get(i) > result){
                result = list.get(i);
            }
        }
        System.out.println("Larger value between first and last element: " + result);
    }   
}