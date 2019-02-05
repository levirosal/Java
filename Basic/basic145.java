// 145. Write a Java program to remove the nth element from the end of a given list. Go to the editor
// Sample Output: 
// Original node:
// 1 2 3 4 5 
// After removing 2nd element from end:
// 1 2 3 5 
import java.util.*;

public class basic145{
    public static void main(String[] args){
        run();
    }
    public static void run(){
      List<Integer> list1 = new ArrayList<Integer>();

      while(list1.size() < 5){
        list1.add((int) (Math.random() * 10));
      }
      System.out.println("\nOrignal array: " + list1);
      list1.remove(list1.size() - 2);
      System.out.println("\nNew array: " + list1);
    }
}

