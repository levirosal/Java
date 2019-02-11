// 3. Write a Java program to add all the elements of a specified tree set to another tree set.
import java.util.*;

public class treeset03{
    public static void main(String[] args){
      run();
    }
    public static void run(){
      TreeSet<String> tree_set1 = new TreeSet<String>();
      TreeSet<String> tree_set2 = new TreeSet<String>();

      tree_set1.add("Blue");
      tree_set1.add("Green");
      tree_set1.add("Black");
      System.out.println("TreeSet1: " + tree_set1);

      tree_set2.add("White");
      tree_set2.add("Yellow");
      tree_set2.add("Red");
      System.out.println("TreeSet2: " + tree_set2);


      tree_set1.addAll(tree_set2);
      System.out.println("New TreeSet1: " + tree_set1);
    }
}
