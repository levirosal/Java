// 8. Write a Java program to test if a map contains a mapping for the specified value.
import java.util.*;

public class hashmap08{
    public static void main(String[] args){
      run();
    }
    public static void run(){
      boolean result = false;
      Scanner in = new Scanner(System.in);
      HashMap<Integer,String> hash_map = new HashMap<Integer,String>();
      hash_map.put(1, "Green");
      hash_map.put(2, "Yellow");
      hash_map.put(3, "Blue");
      hash_map.put(4, "Black");
      hash_map.put(5, "Red");
      System.out.println("HashMap: " + hash_map);

      System.out.print("Insert color: ");
      String color = in.nextLine();

      if(hash_map.containsValue(color)){
        result = true;
      }else{
        result = false;
      }
      System.out.println("Contains " + color + " ? " + result);
    }
}


