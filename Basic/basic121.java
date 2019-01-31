// 121. Write a Java program to reverse a given linked list.
// Example: For linked list 20->40->60->80, the reversed linked list is 80->60->40->20
import java.util.*;

public class basic121{
    public static void main(String[] args){
        run();
    }
    public static void run(){
        List<Integer> list1 = new LinkedList<Integer>();
        List<Integer> list2 = new LinkedList<Integer>();

        while(list1.size() < 5){
            list1.add((int) (Math.random() * 10));
        }

        System.out.println("List : " + list1);

        for(int i = list1.size() - 1; i >= 0 ; i--){
          list2.add(list1.get(i));
        }

        System.out.println("Result: " + list2);
    }
}
