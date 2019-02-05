// 142. Write a Java program to check if two given strings are anagrams or not.
// Sample Output: String-1 : wxyz
// String-2 : zyxw
// Check if two given strings are anagrams or not?: true
import java.util.*;

public class basic143{
    public static void main(String[] args){
        run();
    }
    public static void run(){
        List<Integer> list1 = new ArrayList<Integer>();
        List<Integer> list2 = new ArrayList<Integer>();

        while(list1.size() < 3 && list2.size() < 3){
            list1.add((int) (Math.random() * 10));
            list2.add((int) (Math.random() * 10));
        }
        System.out.println("Original lists: \nList1: " + list1 + "\nList2: " + list2);
        list1.addAll(list2);
        Collections.sort(list1);
        System.out.println("Merge Lists: " + list1);
    }
}
