// 24. Write a Java program to get a portion of a map whose keys are greater than to a given key.
import java.util.*;

public class treemap24{
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

      System.out.println("TreeMap: " + tree_map);

      System.out.print("Insert Key: ");
      int key = in.nextInt();

      System.out.println("Keys: " + tree_map.tailMap(key, false));
    }
}
