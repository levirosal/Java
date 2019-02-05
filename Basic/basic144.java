// 144. Write a Java program to remove all occurrences of a specified value in a given array of integers and return the new length of the array. Go to the editor
// Sample Output: 
// Original array: [1, 4, 6, 7, 6, 2]
// The length of the new array is: 4
import java.util.*;

public class basic144{
    public static void main(String[] args){
        run();
    }
    public static void run(){
      List<Integer> list1 = new ArrayList<Integer>();

      int length = (int) (Math.random() * 10);
      while(list1.size() < length){
        list1.add((int) (Math.random() * 10));
      }
      System.out.println("\nOrignal array: " + list1 + "\nOriginal size: " + list1.size());

      int value = list1.size();
      for(int i = 0 ; i < list1.size() - 1; i++){
        if(list1.get(i) == value){
          list1.remove(i);
        }
      }
      System.out.println("\nNew array: " + list1 + "\nNew size: " + list1.size());
    }
}

