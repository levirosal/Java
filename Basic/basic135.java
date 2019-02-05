// 135. Write a Java program to remove duplicates from a sorted linked list. Go to the editor
// Original List with duplicate elements:
// 12->12->13->14->15->15->16->17->17
// After removing duplicates from the said list:
// 12->13->14->15->16->17
import java.util.*;

public class basic135{
    public static void main(String[] args){
        run();
    }
    public static void run(){
        List<Integer> list1 = new LinkedList<Integer>();
        List<Integer> list2 = new LinkedList<Integer>();

        while(list1.size() < 10){
            list1.add((int) (Math.random() * 10) * 10);
        }
        Collections.sort(list1);
        System.out.println(list1);


        if(list1.get(0) != list1.get(1)){
         list2.add(list1.get(0));
        }
        for(int i = 1; i < list1.size(); i++){
          if(list1.get(i) != list1.get(i - 1)){
              list2.add(list1.get(i));
          }
        }
        System.out.println("Original array: " + list1);
        System.out.println("New array: " + list2);
    }
}
