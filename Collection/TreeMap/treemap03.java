// 3. Write a Java program to search a key in a Tree Map.
import java.util.*;

public class treemap03{
    public static void main(String[] args){
      run();
    }
    public static void run(){
      Scanner in = new Scanner(System.in);
      TreeMap<Integer,String> tree_map = new TreeMap<Integer,String>();
      tree_map.put(1, "Green");
      tree_map.put(2, "Yellow");
      tree_map.put(3, "Blue");
      tree_map.put(4, "Black");
      tree_map.put(5, "Red");

      System.out.println("TreeMap: " + tree_map);

      System.out.print("Insert Key: ");
      int key = in.nextInt();

      System.out.println(tree_map.containsKey(key) ? "Result: " + tree_map.get(key): "Invalid Key");

    }
}
