// 5. Write a Java program to test a hash set is empty or not.
import java.util.*;

public class hashset05{
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

      System.out.println("The HashSet is empty? " + hash.isEmpty());
    }
}
