// 9. Write a Java program to convert a hash set to a List/ArrayList.
import java.util.*;

public class hashset09{
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
      List<String> hash_list = new ArrayList<String>(hash);
      System.out.println("Hash in ArrayList: " + hash_list);
    }
}
