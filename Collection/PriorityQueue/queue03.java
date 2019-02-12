// 3. Write a Java program to add all the elements of a priority queue to another priority queue.
import java.util.*;

public class queue03{
    public static void main(String[] args){
      run();
    }
    public static void run(){
      PriorityQueue<String> queue1 = new PriorityQueue<String>();
      queue1.add("Orange");
      queue1.add("Yellow");
      queue1.add("Green");
      System.out.println("Priority Queue1: " + queue1);

      PriorityQueue<String> queue2 = new PriorityQueue<String>();
      queue2.add("Black");
      queue2.add("Red");
      queue2.add("Blue");
      System.out.println("Priority Queue2: " + queue2);

      queue1.addAll(queue2);

      System.out.println("New Priority Queue: " + queue1);
    }
}
