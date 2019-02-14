// 5. Write a Java program to update specific array element by given element.
import java.util.*;

public class arraylist05{
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

      System.out.println("Insert value to update : ");
      String value = in.nextLine();

      System.out.print("Insert index to update: ");
      int index = in.nextInt();

      list.set(index, value);
      System.out.println("New List: " + list);
    }
}
