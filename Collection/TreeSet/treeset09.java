// 9. Write a Java program to find the numbers less than 7 in a tree set.
import java.util.*;

public class treeset09{
    public static void main(String[] args){
      run();
    }
    public static void run(){
      Set<Integer> tree_set = new TreeSet<Integer>();
      int n = 7;

      while(tree_set.size() < 10){
        tree_set.add((int) (Math.random() * 10));
      }

      System.out.println("TreeSet1: " + tree_set);

      for(int i : tree_set){
        if(i <= n){
          System.out.println(i);
        }
      }
    }
}
