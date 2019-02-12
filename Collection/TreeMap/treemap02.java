// 2. Write a Java program to copy a Tree Map content to another Tree Map.
import java.util.*;

public class treemap02{
    public static void main(String[] args){
      run();
    }
    public static void run(){
      TreeMap<Integer,String> tree_map1 = new TreeMap<Integer,String>();
      tree_map1.put(1, "Green");
      tree_map1.put(2, "Yellow");
      tree_map1.put(3, "Blue");
      System.out.println("TreeMap1: " + tree_map1);

      TreeMap<Integer,String> tree_map2 = new TreeMap<Integer,String>();
      tree_map2.put(4, "Black");
      tree_map2.put(5, "Red");
      tree_map2.put(6, "White");
      System.out.println("TreeMap2: " + tree_map2);

      tree_map1.putAll(tree_map2);
      System.out.println("After coping: " + tree_map1);

    }
}
