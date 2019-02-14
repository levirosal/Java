// 11. Write a Java program to reverse elements in a array list.
import java.util.*;

public class arraylist11{
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
      list.add("White");
      System.out.println("List before reverse: " + list);
      Collections.reverse(list);
      System.out.println("List after reverse: " + list);
    }
}
