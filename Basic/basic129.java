// 129. Write a Java program to find a number that appears only once in a given array of integers, all numbers occur twice. Go to the editor
// Source Array : [10, 20, 10, 20, 30, 40, 40, 30, 50] 50 appears only once
import java.util.*;

public class basic129{
    public static void main(String[] args){
        run();
    }
    public static void run(){
        List<Integer> list1 = new ArrayList<Integer>();

/*        while(list1.size() < 5){
            list1.add((int) (Math.random() * 10) * 10);
        }
*/      list1.add(10);
        list1.add(10);
        list1.add(10);
        list1.add(10);
        list1.add(10);
        list1.add(20);
        list1.add(10);
        list1.add(10);

//        Collections.sort(list1);
        System.out.println(list1);
        int count = 0;

        for(int i = 0; i < list1.size() - 1; i++){
          for(int n = 0; n < list1.size(); ){
            if(list1.get(i) != list1.get(n)){
              n++;
              count++;
            }else{
              break;
            }
            if(count > list1.size() - 2){
              System.out.println("Result: " + count);
            }
          }
          count = 0;
        }
    }
}
