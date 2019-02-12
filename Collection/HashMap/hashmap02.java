// 2. Write a Java program to count the number of key-value (size) mappings in a map.
import java.util.*;

public class hashmap02{
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
      System.out.println("HashMap size: " + hash_map.size());
    }
}
