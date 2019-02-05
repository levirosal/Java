// 124. Write a Java program to find the index of a value in a sorted array. If the value does not find return the index where it would be if it were inserted in order. Go to the editor
// Example: 
// [1, 2, 4, 5, 6] 5(target) -> 3(index)
// [1, 2, 4, 5, 6] 0(target) -> 0(index)
// [1, 2, 4, 5, 6] 7(target) -> 5(index)
import java.util.*;

public class basic124{
    public static void main(String[] args){
        run();
    }
    public static void run(){
        List<Integer> list1 = new LinkedList<Integer>();
        Scanner in = new Scanner(System.in);

        while(list1.size() < 5){
            list1.add((int) (Math.random() * 10));
        }

        System.out.print("Input target : ");
        int target = in.nextInt();

        Collections.sort(list1);
        System.out.println(list1);

        for(int i = 0 ; i < list1.size(); i++){
          if(list1.get(i) == target){
            System.out.println("Index: " + i);
            break;
          }else if(list1.get(i) == target + 1){
            System.out.println("Index: " + (i-1));
            break;
          }else if(list1.get(i) == target - 1){
            System.out.println("Index: " + (i+1));
            break;
          }else if(i == list1.size() -1 && list1.get(i) < target){
            System.out.println("Index: " + (i+1));
          }
        }
    }
}
