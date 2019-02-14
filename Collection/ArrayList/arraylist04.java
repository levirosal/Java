// 4. Write a Java program to retrieve an element (at a specified index) from a given array list.
import java.util.*;

public class arraylist04{
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

      System.out.print("Insert index: ");
      int index = in.nextInt();

      System.out.println("Get: " + list.get(index));
    }
}
