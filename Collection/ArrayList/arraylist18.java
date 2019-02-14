// 18. Write a Java program to test an array list is empty or not.
import java.util.*;

public class arraylist18{
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
      System.out.println("List is empty ? " + list.isEmpty());
      list.clear();
      System.out.println("List is empty ? " + list.isEmpty());
    }
}
