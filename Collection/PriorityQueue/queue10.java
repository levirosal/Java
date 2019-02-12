// 10. Write a Java program to convert a priority queue to an array containing all of the elements of the queue.
import java.util.*;

public class queue10{
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
      System.out.println("Priority Queue: " + queue);
      List<String> queue_array = new ArrayList<String>(queue);
      System.out.println("ArrayList: " + queue_array);
    }
}
