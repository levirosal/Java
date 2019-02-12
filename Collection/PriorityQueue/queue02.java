// 2. Write a Java program to iterate through all elements in priority queue.
import java.util.*;

public class queue02{
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
      System.out.println("Priority Queue: ");
      for(String i : queue){
        System.out.println(i);
      }
    }
}
