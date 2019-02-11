// 2. Write a Java program to iterate through all elements in a hash list.

import java.util.*;

public class hashset02{
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

      Iterator<String> itr = hash.iterator();

      System.out.println("The Hash Set: ");
      while(itr.hasNext()){
        System.out.println(itr.next());
      }


    }
}
