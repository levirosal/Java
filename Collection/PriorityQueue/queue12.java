// 12. Write a Java program to change priorityQueue to maximum priorityqueue.
import java.util.*;

public class queue12{
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
      System.out.println("Original Priority Queue: " + queue);

      System.out.print("Maximum Priority Queue: ");
      for(String i : queue){
        System.out.print(i + " ");
      }
      System.out.print("\n");
    }
}
