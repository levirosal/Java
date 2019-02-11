// 8. Write a Java program to compare two tree sets.
import java.util.*;

public class treeset08{
    public static void main(String[] args){
      run();
    }
    public static void run(){
      Set<String> tree_set1 = new TreeSet<String>();
      Set<String> tree_set2 = new TreeSet<String>();
      boolean result = false;
      int count = 0;

      tree_set1.add("Blue");
      tree_set1.add("Green");
      tree_set1.add("Black");
      tree_set1.add("White");
      tree_set1.add("Yellow");
      tree_set1.add("Red");
      System.out.println("TreeSet1: " + tree_set1);

      tree_set2.add("Blue");
      tree_set2.add("Green");
      tree_set2.add("Black");
      tree_set2.add("White");
      tree_set2.add("Yellow");
      tree_set2.add("Red");
      System.out.println("TreeSet2: " + tree_set2);

      if(tree_set1.size() != tree_set2.size()){
        result = false;
      }else{
        for(String element : tree_set1){
          if(tree_set2.contains(element)){
            count++;
          }
          if(count == tree_set1.size()){
            result = true;
          }
        }
      }

      System.out.println("Equals ? " + result);
    }
}
