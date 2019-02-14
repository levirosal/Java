// 7. Write a Java program to search an element in a array list.
import java.util.*;

public class arraylist07{
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

      System.out.print("Insert element : ");
      String value = in.nextLine();

      System.out.print("Found element ? ");
      System.out.println(list.contains(value)? "Yes" : "No" );
    }
}
