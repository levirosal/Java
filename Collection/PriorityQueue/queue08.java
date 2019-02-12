// 8. Write a Java program to retrieve the first element of the priority queue.
import java.util.*;

public class queue08{
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
      System.out.println("First element Priority Queue: " + queue.peek());
    }
}
