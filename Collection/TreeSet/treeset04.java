// 4. Write a Java program to create a reverse order view of the elements contained in a given tree set.
import java.util.*;

public class treeset04{
    public static void main(String[] args){
      run();
    }
    public static void run(){
      TreeSet<String> tree_set = new TreeSet<String>();

      tree_set.add("Blue");
      tree_set.add("Green");
      tree_set.add("Black");
      tree_set.add("White");
      tree_set.add("Yellow");
      tree_set.add("Red");
      System.out.println("Original TreeSet: " + tree_set);

      Iterator i = tree_set.descendingIterator();
      System.out.println("Reverse Order:");
      while(i.hasNext()){
        System.out.println(i.next());
      }
    }
}
