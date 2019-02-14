// 20. Write a Java program to increase the size of an array list.
import java.util.*;

public class arraylist20{
    public static void main(String[] args){
      run();
    }
    public static void run(){
      ArrayList<String> list = new ArrayList<String>(4);
      list.add("Green");
      list.add("Yellow");
      list.add("Blue");
      list.add("Black");
      list.ensureCapacity(7);
      list.add("Red");
      list.add("White");
      list.add("Pink");
      System.out.println("List : " + list);
    }
}
