// 12. Write a Java program to get the element in a tree set which is strictly greater than or equal to the given element. 
import java.util.*;

public class treeset12{
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

      System.out.print("Input number: ");
      int n = in.nextInt();

      System.out.println("Strictly greater than" + n + " : " + tree_set.higher(n));
    }
}
