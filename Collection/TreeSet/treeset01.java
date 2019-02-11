// 1. Write a Java program to create a new tree set, add some colors (string) and print out the tree set.
import java.util.*;

public class treeset01{
    public static void main(String[] args){
      run();
    }
    public static void run(){
      TreeSet<String> tree_set = new TreeSet<String>();
      tree_set.add("Blue");
      tree_set.add("Green");
      tree_set.add("Black");
      tree_set.add("White");
      tree_set.add("Red");
      System.out.println("Tree set: " + tree_set);
    }
}
