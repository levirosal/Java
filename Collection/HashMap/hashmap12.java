// 12. Write a Java program to get a collection view of the values contained in this map.
import java.util.*;

public class hashmap12{
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
      System.out.println("Values: " + hash_map.values());
    }
}

