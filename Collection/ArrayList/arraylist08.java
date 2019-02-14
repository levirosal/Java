// 8. Write a Java program to sort a given array list.
import java.util.*;

public class arraylist08{
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
      System.out.println("List before sorting: " + list);
      Collections.sort(list);
      System.out.println("List after sorting: " + list);
    }
}
