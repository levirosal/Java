// 13. Write a Java program to compare two array lists.
import java.util.*;

public class arraylist13{
    public static void main(String[] args){
      run();
    }
    public static void run(){
      List<String> list1 = new ArrayList<String>();
      list1.add("Green");
      list1.add("Yellow");
      list1.add("Blue");
      list1.add("Black");
      list1.add("Red");
      list1.add("White");
      System.out.println("List1: " + list1);
      List<String> list2 = new ArrayList<String>();
      list2.add("Green");
      list2.add("Yellow");
      list2.add("Blue");
      list2.add("Black");
      list2.add("red");
      list2.add("White");
      System.out.println("List2: " + list2);

      ArrayList<String> list3 = new ArrayList<String>();
      for(String i : list1){
        list3.add(list2.contains(i) ? "Yes" : "No");
      }
      System.out.println(list3);
    }
}
