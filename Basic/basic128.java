// 128.Write a Java program to calculate the median of an given unsorted array of integers. Go to the editor
// Example: {10,2,38,23,38,23,21}
// Output: 23
import java.util.*;

public class basic128{
    public static void main(String[] args){
        run();
    }
    public static void run(){
        List<Integer> list1 = new LinkedList<Integer>();

        while(list1.size() < 7){
            list1.add((int) (Math.random() * 100));
        }
        Collections.sort(list1);
        System.out.println(list1);

        int mid = (list1.size() + 1) / 2;

        System.out.println("Middle: " + list1.get(mid - 1));
    }
}
