// 12. Write a Java program to extract a portion of a array list.
import java.util.*;

public class arraylist12{
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
      System.out.println("List: " + list);

      System.out.print("Insert first index: ");
      int index1 = in.nextInt();

      System.out.print("Insert second index: ");
      int index2 = in.nextInt();

      List<String> sub_list = list.subList(index1, index2);
      System.out.println("List : " + sub_list);
    }
}
