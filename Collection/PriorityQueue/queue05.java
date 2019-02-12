// 5. Write a Java program to remove all the elements from a priority queue.
import java.util.*;

public class queue05{
    public static void main(String[] args){
      run();
    }
    public static void run(){
      PriorityQueue<String> queue = new PriorityQueue<String>();
      queue.add("Orange");
      queue.offer("Yellow");
      queue.add("Green");
      queue.offer("Black");
      queue.add("Red");
      queue.offer("Blue");
      System.out.println("Priority Queue before removing: " + queue);
      queue.clear();
      System.out.println("Priority Queue after removing: " + queue);
    }
}
