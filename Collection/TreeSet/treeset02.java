// 2. Write a Java program to iterate through all elements in a tree set.
import java.util.*;

public class treeset02{
    public static void main(String[] args){
      run();
    }
    public static void run(){
      TreeSet<String> tree_set = new TreeSet<String>();
      tree_set.add("Blue");
      tree_set.add("Green");
      tree_set.add("Black");
      tree_set.add("White");
      tree_set.add("Red");

      System.out.println("Colors: ");

      for(String i : tree_set){
         System.out.println(i);
      }
    }
}
