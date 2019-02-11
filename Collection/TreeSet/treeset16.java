// 16. Write a Java program to remove a given element from a tree set.
import java.util.*;

public class treeset16{
    public static void main(String[] args){
      run();
    }
    public static void run(){
      Scanner in = new Scanner(System.in);
      TreeSet<Integer> tree_set = new TreeSet<Integer>();

      while(tree_set.size() < 10){
        tree_set.add((int) (Math.random() * 100));
      }

      System.out.println("TreeSet: " + tree_set);

      System.out.print("Input number to remove: ");
      int n = in.nextInt();

      tree_set.remove(n);
      System.out.println("After removing " + n + " : " + tree_set);
    }
}
