// 15. Write a Java program to join two array lists.
import java.util.*;

public class arraylist15{
    public static void main(String[] args){
      run();
    }
    public static void run(){
      List<String> list1 = new ArrayList<String>();
      list1.add("Green");
      list1.add("Yellow");
      list1.add("Blue");
      System.out.println("List1: " + list1);
      List<String> list2 = new ArrayList<String>();
      list2.add("Black");
      list2.add("Red");
      list2.add("White");
      System.out.println("List2: " + list2);
      list1.addAll(list2);
      System.out.println("List after join: " + list1);
    }
}
