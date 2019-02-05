// 138. Write a Java program to find all of the longest word in a given dictionary. Go to the editor
// Example-1:
// {
// "cat",
// "flag",
// "green",
// "country",
// "w3resource"
// }
// Result: "w3resource"
// Example-2:
// {
// "cat",
// "dog",
// "red",
// "is",
// "am"
// }
// Result: "cat", "dog", "red"
import java.util.*;

public class basic138{
    public static void main(String[] args){
        run();
    }
    public static void run(){
      Scanner in = new Scanner(System.in);
      List<String> list1 = new ArrayList<String>();
      String result = "";

      for(int n = 1; list1.size() < 5; n++){
        System.out.print("Input string: ");
        String value = in.nextLine();
        list1.add(value);
      }

      for(int i = 0 ; i < list1.size() - 1; i ++){
        String temp = list1.get(i);
        if(temp.length() >= result.length()){
          result = temp;
        }
      }
      System.out.println("Result: ");

      for(int i = 0 ; i < list1.size() - 1; i ++){
        String temp = list1.get(i);
        if(temp.length() == result.length()){
          System.out.println(temp);
        }
      }
    }
}

