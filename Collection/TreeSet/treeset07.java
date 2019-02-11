// 7. Write a Java program to get the number of elements in a tree set.
import java.util.*;

public class treeset07{
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
      System.out.println("TreeSet: " + tree_set);
      System.out.println("TreeSet size: " + tree_set.size());
    }
}
