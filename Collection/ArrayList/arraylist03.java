// 3. Write a Java program to insert an element into the array list at the first position.
import java.util.*;


public class arraylist03{
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
      list.add(0, "White");
      list.add(5, "Yellow");
      System.out.println("List: " + list);
    }
}
