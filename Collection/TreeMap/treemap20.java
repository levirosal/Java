// 20. Write a Java program to remove and get a key-value mapping associated with the greatest key in this map.
import java.util.*;

public class treemap20{
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

      System.out.println("TreeMap before poll: " + tree_map);
      System.out.println("TreeMap returned: " + tree_map.pollLastEntry());
      System.out.println("TreeMap after poll: " + tree_map);
    }
}
