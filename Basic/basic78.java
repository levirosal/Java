// 78. Write a Java program to test that a given array of integers of length 2 contains a 4 or a 7. Go to the editor
// Sample Output:
// Original Array: [5, 7]                                                 
// true 
import java.util.*;

public class basic78{
    public static void main(String[] args){
        run();
    }
    public static void run(){
        ArrayList<Integer> list = new ArrayList<Integer>();  
        boolean result = false;

        while(list.size() < 5){
            list.add((int) (Math.random() * 10));
        }

        System.out.println(list);

        for(int i = 0 ; i < list.size() ; i++){
            if(list.get(i) == 4 || list.get(i) == 7){
                result = true;
            }
        }
        System.out.println(result);
    }   
}