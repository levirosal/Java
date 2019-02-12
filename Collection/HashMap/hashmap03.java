// 3. Write a Java program to copy all of the mappings from the specified map to another map.
import java.util.*;

public class hashmap03{
    public static void main(String[] args){
      run();
    }
    public static void run(){
      Map<Integer,String> hash_map1 = new HashMap<Integer,String>();
      hash_map1.put(1, "Green");
      hash_map1.put(2, "Yellow");
      hash_map1.put(3, "Blue");
      System.out.println("HashMap1: " + hash_map1);

      Map<Integer,String> hash_map2 = new HashMap<Integer,String>();
      hash_map2.put(4, "Black");
      hash_map2.put(5, "Red");
      hash_map2.put(6, "White");
      System.out.println("HashMap2: " + hash_map2);

      hash_map1.putAll(hash_map2);

      System.out.println("New HashMap: " + hash_map1);
    }
}
