// 9. Write a Java program to retrieve and remove the first element.
import java.util.*;

public class queue09{
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
      queue.poll();
      System.out.println("Priority Queue after removing first element: " + queue);
    }
}
