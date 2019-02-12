// 11. Write a Java program to convert a Priority Queue elements to a string representation.
import java.util.*;

public class queue11{
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
      String queue_string = queue.toString();
      System.out.println("Queue in string: " + queue_string);
    }
}
