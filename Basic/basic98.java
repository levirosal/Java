// 98. Write a Java program to check if the value 20 appears three times and 
// no 20's are next to each other in an given array of integers.
import java.util.*;

public class basic98{
    public static void main(String[] args){
        run();
    }
    public static void run(){
        ArrayList<Integer> list = new ArrayList<Integer>();
        boolean result = false;
        int count = 0;

        while(list.size() < 10){
            list.add((int) (Math.random() * 10) * 10);
        }

        System.out.println(list);
        
        for(int i = 0; i < list.size() - 1; i++){
            if(list.get(i) == 20 && list.get(i + 1) != 20){
                count ++;
            }
            
            if(count == 3){
                result = true;
            }
        }   
            System.out.println("The value 20 appears three times and no 20's are next to each other: " + result);
    }
}