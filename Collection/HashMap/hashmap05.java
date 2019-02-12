// 5. Write a Java program to check whether a map contains key-value mappings (empty) or not.
import java.util.*;

public class hashmap05{
    public static void main(String[] args){
      run();
    }
    public static void run(){
      Map<Integer,String> hash_map = new HashMap<Integer,String>();
      hash_map.put(1, "Green");
      hash_map.put(2, "Yellow");
      hash_map.put(3, "Blue");
      hash_map.put(4, "Black");
      hash_map.put(5, "Red");
//      hash_map.clear();
      System.out.println("HashMap is empty ? " + hash_map.isEmpty());
    }
}
