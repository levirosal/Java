// 18. Write a Java program to get NavigableSet view of the keys contained in a map.
import java.util.*;

public class treemap18{
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

      System.out.println("TreeMap: " + tree_map);
      System.out.println("TreeMap navigableKeySet: " + tree_map.navigableKeySet());
    }
}
