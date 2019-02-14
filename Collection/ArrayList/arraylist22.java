// 22. Write a Java program to print all the elements of a ArrayList using the position of the elements.
import java.util.*;

public class arraylist22{
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
      for(int i = 0; i < list.size() ; i++){
        System.out.println(i + " - " + list.get(i));
      }
    }
}
