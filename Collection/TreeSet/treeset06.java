// 6. Write a Java program to clone a tree set list to another tree set.
import java.util.*;

public class treeset06{
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

      TreeSet<String> tree_set2 = (TreeSet<String>)tree_set.clone();
      System.out.println("Clone TreeSet: " + tree_set2);
    }
}
