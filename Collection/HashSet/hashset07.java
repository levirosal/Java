// 7. Write a Java program to convert a hash set to an array.
import java.util.*;

public class hashset07{
    public static void main(String[] args){
      run();
    }
    public static void run(){
      HashSet<String> hash = new HashSet<String>();
      hash.add("One");
      hash.add("Two");
      hash.add("Three");
      hash.add("Four");
      hash.add("Five");
      hash.add("Six");
      hash.add("Seven");
      hash.add("Eight");
      hash.add("Nine");
      hash.add("Ten");

      System.out.println("The Original HashSet: " + hash);

      String[] hash_array = new String[hash.size()];
      hash.toArray(hash_array);

      System.out.println("Hash in ArrayList: ");
      for(String i : hash_array){
        System.out.println(i);
      }
    }
}
