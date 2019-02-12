// 7. Write a Java program to compare two priority queues.
import java.util.*;

public class queue07{
    public static void main(String[] args){
      run();
    }
    public static void run(){
      boolean result = false;
      int count =0;
      PriorityQueue<String> queue1 = new PriorityQueue<String>();
      queue1.add("Orange");
      queue1.add("Yellow");
      queue1.add("Green");
      System.out.println("Priority Queue1: " + queue1);

      PriorityQueue<String> queue2 = new PriorityQueue<String>();
//      queue2.add("Orange");
//      queue2.add("Yellow");
//      queue2.add("Green");
      queue2.add("Black");
      queue2.add("Red");
      queue2.add("Blue");
      System.out.println("Priority Queue2: " + queue2);

      if(queue1.size() != queue2.size()){
        result = false;
      }else{
        for(String i : queue1){
          if(queue2.contains(i)){
            count++;
          }else{
            break;
          }
          if(count == queue1.size()){
            result = true;
          }
        }
      }

      System.out.println("Equals ? " + result);
    }
}
