// 14. Write a Java program to retrieve and remove the first element of a tree set.
import java.util.*;

public class treeset14{
    public static void main(String[] args){
      run();
    }
    public static void run(){
      TreeSet<Integer> tree_set = new TreeSet<Integer>();

      while(tree_set.size() < 10){
        tree_set.add((int) (Math.random() * 100));
      }

      System.out.println("TreeSet: " + tree_set);
      System.out.println("The first element: " + tree_set.pollFirst());
      System.out.println("After removing first element: " + tree_set);

    }
}
