// 15. Write a Java program to retrieve and remove the last element of a tree set.
import java.util.*;

public class treeset15{
    public static void main(String[] args){
      run();
    }
    public static void run(){
      TreeSet<Integer> tree_set = new TreeSet<Integer>();

      while(tree_set.size() < 10){
        tree_set.add((int) (Math.random() * 100));
      }

      System.out.println("TreeSet: " + tree_set);
      System.out.println("The last element: " + tree_set.pollLast());
      System.out.println("After removing last element: " + tree_set);

    }
}
