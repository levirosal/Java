// 10. Write a Java program to shuffle elements in a array list.
import java.util.*;

public class arraylist10{
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
      list.add("White");
      System.out.println("List before shuffling: " + list);
      Collections.shuffle(list);
      System.out.println("List after shuffling: " + list);
    }
}
