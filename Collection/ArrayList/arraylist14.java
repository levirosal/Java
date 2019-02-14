// 14. Write a Java program of swap two elements in an array list.
import java.util.*;

public class arraylist14{
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
      list.add("White");
      System.out.println("List before swap: " + list);

      System.out.print("Insert index to swap: ");
      int i1 = in.nextInt();

      System.out.print("Insert index to swap: ");
      int i2 = in.nextInt();

      Collections.swap(list, i1, i2);
      System.out.println("List after swap: " + list);
    }
}
