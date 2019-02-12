// 5. Write a Java program to get all keys from the given a Tree Map.
import java.util.*;

public class treemap05{
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

      System.out.println("TreeMap: " + tree_map);

      for(int key: tree_map.keySet()){
        System.out.println(key);
      }
    }
}
