// 102. Write a Java program to check if a specified array of integers contains 10's or 30's.
import java.util.*;

public class basic102{
    public static void main(String[] args){
        run();
    }
    public static void run(){
        ArrayList<Integer> list1 = new ArrayList<Integer>();
        boolean result = false;

        while(list1.size() < 10){
            list1.add((int) (Math.random() * 10) * 10);
        }

        System.out.println(list1);

        for(int i = 0 ; i < list1.size() ; i++){
            if(list1.get(i) == 10){   
                result = true;
            }
                            
            if(list1.get(i) == 30){
                result = true;
            }
        }
        System.out.println("Contains 10's or 30's : " + result);            
    }
}