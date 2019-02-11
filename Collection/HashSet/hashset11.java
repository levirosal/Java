// 11. Write a Java program to compare two sets and retain elements which are same on both sets.
import java.util.*;

public class hashset11{
    public static void main(String[] args){
      run();
    }
    public static void run(){
      boolean result = false;
      int count = 0;

      HashSet<String> hash1 = new HashSet<String>();
      HashSet<String> hash2 = new HashSet<String>();
      HashSet<String> hash3 = new HashSet<String>();

      hash1.add("One");
      hash1.add("Two");
      hash1.add("Three");
      hash1.add("Four");
      hash1.add("Five");
      hash1.add("Six");
      hash1.add("Seven");
      hash1.add("Eight");
      hash1.add("Nine");
      hash1.add("Ten");

      hash2 = (HashSet)hash1.clone();
      hash1.add("Eleven");

      System.out.println("HashSet01: " + hash1);
      System.out.println("HashSet02: " + hash2);

      for(String element : hash1){
        if(hash2.contains(element)){
          hash3.add(element);
        }
      }
      System.out.println("Elements which are same on both sets: " + hash3);
    }
}
