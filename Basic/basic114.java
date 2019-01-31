// 114. Write a Java program to given a string and an offset, rotate string by offset (rotate from left to right).

import java.util.*;

public class basic114{
    public static void main(String[] args){
        run();
    }
    public static void run(){
        ArrayList<Integer> list1 = new ArrayList<Integer>();
        ArrayList<Integer> list2 = new ArrayList<Integer>();
        Scanner in = new Scanner(System.in);

        while(list1.size() < 10){
            list1.add((int) (Math.random() * 10));
        }

        System.out.print("Input offset length: ");
        int offset = in.nextInt();

        // String valueText = Integer.toString(value);
        System.out.println("List : " + list1);

        for(int i = offset ; i < list1.size(); i++){
            list2.add(list1.get(i));
        }
        for(int i = 0 ; i < offset ; i++){
          list2.add(list1.get(i));
        }

        System.out.println("Result: " + list2);
    }
}
