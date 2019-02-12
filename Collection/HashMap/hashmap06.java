// 6. Write a Java program to get a shallow copy of a HashMap instance.
import java.util.*;

public class hashmap06{
    public static void main(String[] args){
      run();
    }
    public static void run(){
      HashMap<Integer,String> hash_map = new HashMap<Integer,String>();
      HashMap<Integer,String> hash_map_clone = new HashMap<Integer,String>();
      hash_map.put(1, "Green");
      hash_map.put(2, "Yellow");
      hash_map.put(3, "Blue");
      hash_map.put(4, "Black");
      hash_map.put(5, "Red");

      System.out.println("Original HashMap: " + hash_map);
      hash_map_clone = (HashMap)hash_map.clone();
      System.out.println("Cloned map: " + hash_map_clone);
    }
}
