// 15. Write a Java program to get the least key strictly greater than the given key. Return null if there is no such key. 
import java.util.*;

public class treemap15{
    public static void main(String[] args){
      run();
    }
    public static void run(){
      Scanner in = new Scanner(System.in);
      TreeMap<Integer,String> tree_map = new TreeMap<Integer,String>();
      tree_map.put(3, "Green");
      tree_map.put(5, "Yellow");
      tree_map.put(1, "Blue");
      tree_map.put(4, "Black");
      tree_map.put(2, "Red");

      System.out.print("Insert Key: ");
      int key = in.nextInt();

      System.out.println("TreeMap: " + tree_map);
      System.out.println("Keys: " + tree_map.higherEntry(key));
    }
}
