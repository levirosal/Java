// 1. Write a Java program to associate the specified value with the specified key in a HashMap.
import java.util.*;

public class hashmap01{
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
      for(Map.Entry it : hash_map.entrySet()){
        System.out.println(it.getKey() + " " + it.getValue());
      }
    }
}
