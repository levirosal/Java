// 6. Write a Java program to remove the third element from a array list.
import java.util.*;

public class arraylist06{
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
      System.out.println("List before remove third element: " + list);
      list.remove(2);
      System.out.println("List after remove third element: " + list);
    }
}
