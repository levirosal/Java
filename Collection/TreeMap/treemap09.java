// 9. Write a Java program to get the first (lowest) key and the last (highest) key currently in a map.
import java.util.*;

public class treemap09{
    public static void main(String[] args){
      run();
    }
    public static void run(){
      TreeMap<Integer,String> tree_map = new TreeMap<Integer,String>();
      tree_map.put(3, "Green");
      tree_map.put(5, "Yellow");
      tree_map.put(1, "Blue");
      tree_map.put(4, "Black");
      tree_map.put(2, "Red");

      System.out.println("Original TreeMap: " + tree_map);
      System.out.println("Greatest key: " + tree_map.firstKey());
      System.out.println("Least key: " + tree_map.lastKey());
    }
}
