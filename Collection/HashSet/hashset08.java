// 8. Write a Java program to convert a hash set to a tree set.
import java.util.*;

public class hashset08{
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

      Set<String> hash_tree = new TreeSet<String>(hash);

      System.out.println("Hash in TreeSet: ");
      for(String i : hash_tree){
        System.out.println(i);
      }
    }
}
