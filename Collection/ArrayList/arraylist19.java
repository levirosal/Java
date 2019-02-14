// 19. Write a Java program to trim the capacity of an array list the current list size.
import java.util.*;

public class arraylist19{
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
      System.out.println("Original List : " + list);
      list.trimToSize();
      System.out.println("New List : " + list);
    }
}
