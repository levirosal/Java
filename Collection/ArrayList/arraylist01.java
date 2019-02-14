// 1. Write a Java program to create a new array list, add some colors (string) and print out the collection.
import java.util.*;

public class arraylist01{
    public static void main(String[] args){
      run();
    }
    public static void run(){
      List<String> list = new ArrayList<String>();
      list.add("Green");
      list.add("Yellow");
      list.add("Blue");
      list.add("Black");
      list.add("Red");
      System.out.println("List: " + list);
    }
}
