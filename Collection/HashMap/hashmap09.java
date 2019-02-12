// 9. Write a Java program to create a set view of the mappings contained in a map.
import java.util.*;

public class hashmap09{
    public static void main(String[] args){
      run();
    }
    public static void run(){
      HashMap<Integer,String> hash_map = new HashMap<Integer,String>();
      hash_map.put(1, "Green");
      hash_map.put(2, "Yellow");
      hash_map.put(3, "Blue");
      hash_map.put(4, "Black");
      hash_map.put(5, "Red");
      System.out.println("Set values: " + hash_map.entrySet());
    }
}

