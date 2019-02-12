// 10. Write a Java program to get the value of a specified key in a map.
import java.util.*;

public class hashmap10{
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

      System.out.print("Insert Key: ");
      int key = in.nextInt();

      System.out.println("Result: " + hash_map.get(key));
    }
}


