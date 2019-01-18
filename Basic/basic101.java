// 101. Write a Java program to check if the number of 10 is greater than number to 20's in a given array of integers.
import java.util.*;

public class basic101{
    public static void main(String[] args){
        run();
    }
    public static void run(){
        ArrayList<Integer> list1 = new ArrayList<Integer>();
        int count10 = 0;
        int count20 = 0;

        while(list1.size() < 10){
            list1.add((int) (Math.random() * 10) * 10);
        }

        System.out.println(list1);

        for(int i = 0 ; i < list1.size() ; i++){
            if(list1.get(i) == 10){
                count10++;
            }
                            
            if(list1.get(i) == 20){
                count20++;
            }
        }
        if(count10 > count20){
            System.out.println("Greather: 10");
        }else if(count10 < count20){
            System.out.println("Greather: 20");            
        }else if(count10 == count20){
            System.out.println("They are the same");            
        }
    }
}