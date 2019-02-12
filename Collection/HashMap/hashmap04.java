// 4. Write a Java program to remove all of the mappings from a map.
import java.util.*;

public class hashmap04{
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
      System.out.println("Original HashMap: " + hash_map);
      hash_map.clear();
      System.out.println("New HashMap: " + hash_map);
    }
}
