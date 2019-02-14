// 21. Write a Java program to replace the second element of a ArrayList with the specified element.
import java.util.*;

public class arraylist21{
    public static void main(String[] args){
      run();
    }
    public static void run(){
      Scanner in = new Scanner(System.in);
      List<String> list = new ArrayList<String>();

      list.add("Green");
      list.add("Yellow");
      list.add("Blue");
      list.add("Black");
      list.add("Red");
      System.out.println("List: " + list);

      System.out.println("Insert value to update in index 1: ");
      String value = in.nextLine();

      list.set(1, value);
      System.out.println("New List: " + list);
    }
}
