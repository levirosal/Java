// 7. Write a Java program to sort keys in Tree Map by using comparator.
import java.util.*;

public class treemap07{
    public static void main(String[] args){
      run();
    }
    public static void run(){
      TreeMap<String,String> tree_map = new TreeMap<String,String>(new sort());
      tree_map.put("2", "Green");
      tree_map.put("5", "Yellow");
      tree_map.put("3", "Blue");
      tree_map.put("1", "Black");
      tree_map.put("4", "Red");

      System.out.println("Original TreeMap: " + tree_map);
    }
}
class sort implements Comparator<String>{
  @Override
  public int compare(String str1, String str2){
    return str1.compareTo(str2);
  }
}
