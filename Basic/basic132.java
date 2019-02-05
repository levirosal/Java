// 132. Write a Java program to find the new length of a given sorted array where duplicate elements appeared at most twice. Go to the editor
// Original array: [1, 1, 2, 3, 3, 3, 4, 5, 6, 7, 7, 7, 7]
// The length of the original array is: 13
// After removing duplicates, the new length of the array is: 10
import java.util.*;

public class basic132{
    public static void main(String[] args){
        run();
    }
    public static void run(){
        List<Integer> list1 = new ArrayList<Integer>();
        List<Integer> list2 = new ArrayList<Integer>();

        while(list1.size() < 10){
            list1.add((int) (Math.random() * 10) * 10);
        }
        Collections.sort(list1);
        System.out.println(list1);


/*        if(list1.get(0) == list1.get(1) && list){
         list2.add(list1.get(0));
        }
        */
        int count = 1;
        for(int i = 2; i < list1.size(); i++){
          if(list1.get(i) != list1.get(count)||list1.get(i) == list1.get(count) && list1.get(i) != list1.get(count - 1)){
              list2.add(list1.get(i));
              count++;
          }
        }
        System.out.println("Original array: " + list1.size());
        System.out.println("New array: " + list2.size());
    }
}
