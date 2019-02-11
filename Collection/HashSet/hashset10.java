// 10. Write a Java program to compare two hash set.
import java.util.*;

public class hashset10{
    public static void main(String[] args){
      run();
    }
    public static void run(){
      boolean result = false;
      int count = 0;

      HashSet<String> hash1 = new HashSet<String>();
      HashSet<String> hash2 = new HashSet<String>();

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

      System.out.println("HashSet01: " + hash1);
      hash2 = (HashSet)hash1.clone();
      System.out.println("HashSet02: " + hash2);

//      hash1.add("Eleven");
      if(hash1.size() != hash2.size()){
        result = false;
      }else{
        for(String element : hash1){
          if(hash2.contains(element)){
            count++;
          }
          if(count == hash1.size()){
            result = true;
          }
        }
      }

      System.out.println("Equals ? " + result);
    }
}
