// 1. Write a Java program to create a new priority queue, add some colors (string) and print out the elements of the priority queue.
import java.util.*;

public class queue01{
    public static void main(String[] args){
      run();
    }
    public static void run(){
      PriorityQueue<String> queue = new PriorityQueue<String>();
      queue.add("Orange");
      queue.add("Yellow");
      queue.add("Green");
      queue.add("Black");
      queue.add("Red");
      System.out.println("Priority Queue: " + queue);
    }
}
