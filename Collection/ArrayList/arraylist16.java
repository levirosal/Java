// 16. Write a Java program to clone an array list to another array list.
import java.util.*;

public class arraylist16{
    public static void main(String[] args){
      run();
    }
    public static void run(){
      ArrayList<String> list1 = new ArrayList<String>();
      list1.add("Green");
      list1.add("Yellow");
      list1.add("Blue");
      list1.add("Black");
      list1.add("Red");
      list1.add("White");
      System.out.println("List1: " + list1);

      List<String> list2 = (ArrayList<String>)list1.clone();
      System.out.println("List2(Clone): " + list2);
    }
}
