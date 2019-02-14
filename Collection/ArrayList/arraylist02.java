// 2. Write a Java program to iterate through all elements in a array list.
import java.util.*;

public class arraylist02{
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
      for(String i : list){
        System.out.println(i);
      }
    }
}
