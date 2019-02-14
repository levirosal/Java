// 17. Write a Java program to empty an array list.
import java.util.*;

public class arraylist17{
    public static void main(String[] args){
      run();
    }
    public static void run(){
      ArrayList<String> list = new ArrayList<String>();
      list.add("Green");
      list.add("Yellow");
      list.add("Blue");
      list.add("Black");
      list.add("Red");
      list.add("White");
      System.out.println("List before clear: " + list);
      list.clear();
      System.out.println("List after clear: " + list);
    }
}
