// 22. Write a Java program to get the portion of a map whose keys range from a given key to another key.
import java.util.*;

public class treemap22{
    public static void main(String[] args){
      run();
    }
    public static void run(){
      Scanner in = new Scanner(System.in);
      TreeMap<Integer,String> tree_map = new TreeMap<Integer,String>();
      SortedMap<Integer,String> sub_tree_map = new TreeMap<Integer,String>();
      tree_map.put(3, "Green");
      tree_map.put(5, "Yellow");
      tree_map.put(1, "Blue");
      tree_map.put(4, "Black");
      tree_map.put(2, "Red");

      System.out.println("TreeMap: " + tree_map);

      System.out.print("Insert first Key: ");
      int first_key = in.nextInt();
      System.out.print("Insert last Key: ");
      int last_key = in.nextInt();

      sub_tree_map = tree_map.subMap(first_key,true, last_key, true);
      System.out.println("SubMap: " + sub_tree_map);
    }
}
