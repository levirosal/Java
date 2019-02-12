// 6. Write a Java program to delete all elements from a given Tree Map.
import java.util.*;

public class treemap06{
    public static void main(String[] args){
      run();
    }
    public static void run(){
      TreeMap<Integer,String> tree_map = new TreeMap<Integer,String>();
      tree_map.put(1, "Green");
      tree_map.put(2, "Yellow");
      tree_map.put(3, "Blue");
      tree_map.put(4, "Black");
      tree_map.put(5, "Red");

      System.out.println("Original TreeMap: " + tree_map);
      tree_map.clear();
      System.out.println("New TreeMap: " + tree_map);
    }
}
