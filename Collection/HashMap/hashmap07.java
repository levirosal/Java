// 7. Write a Java program to test if a map contains a mapping for the specified key.
import java.util.*;

public class hashmap07{
    public static void main(String[] args){
      run();
    }
    public static void run(){
      boolean result = false;
      Scanner in = new Scanner(System.in);
      HashMap<String,Integer> hash_map = new HashMap<String,Integer>();
      hash_map.put("Green", 1);
      hash_map.put("Yellow", 2);
      hash_map.put("Blue", 3);
      hash_map.put("Black", 4);
      hash_map.put("Red", 5);
      System.out.println("HashMap: " + hash_map);

      System.out.print("Insert color: ");
      String color = in.nextLine();

      if(hash_map.containsKey(color)){
        result = true;
      }else{
        result = false;
      }
      System.out.println("Contains " + color + " ? " + result);
    }
}
