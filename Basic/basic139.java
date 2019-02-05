// 139. Write a Java program to get the index of the first number and the last number of a subarray where the sum of numbers is zero from a given array of integers. Go to the editor
// Original Array : [1, 2, 3, -6, 5, 4]
// Index of the subarray of the said array where the sum of numbers is zero: [0, 3]
import java.util.*;

public class basic139{
    public static void main(String[] args){
        run();
    }
    public static void run(){
      int sum = 0;
      List<Integer> list1 = new ArrayList<Integer>();

      while(list1.size() < 10){
        list1.add((int) (Math.random() * 10) * 10);
        if(list1.size() == 3){
          int sum1 = list1.get(0) + list1.get(1) + list1.get(2);
          list1.add(-sum1);
        }
      }
      System.out.println(list1);

      for(int i = 0 ; i < list1.size() - 1; i ++){
        sum += list1.get(i);
        if(sum == 0){
          System.out.println("Result: " + "[0," + i + "]");
        }
      }
    }
}

