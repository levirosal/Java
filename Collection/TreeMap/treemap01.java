// 1. Write a Java program to associate the specified value with the specified key in a Tree Map.
import java.util.*;

public class treemap01{
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

      for(Map.Entry it : tree_map.entrySet()){
        System.out.println(it.getKey() + " " + it.getValue());
      }
    }
}
