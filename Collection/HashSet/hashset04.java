// 4. Write a Java program to empty an hash set.
import java.util.*;

public class hashset04{
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

      System.out.println("The original HashSet size: " + hash.size());
      hash.removeAll(hash);
      System.out.println("The new HashSet size: " + hash.size());

    }
}
