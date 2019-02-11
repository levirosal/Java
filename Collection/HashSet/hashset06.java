// 6. Write a Java program to clone a hash set to another hash set.
import java.util.*;

public class hashset06{
    public static void main(String[] args){
      run();
    }
    public static void run(){
      HashSet<String> hash = new HashSet<String>();
      HashSet<String> clone_hash = new HashSet <String>();
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
      clone_hash = (HashSet)hash.clone();
      System.out.println("The Cloned HashSet: " + clone_hash);
    }
}
