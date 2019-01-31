// 112. Write a Java program to compute the number of trailing zeros in a factorial.
// 7! = 5040, therefore the output should be 1

import java.util.*;

public class basic112{
    public static void main(String[] args){
        run();
    }
    public static void run(){
        Scanner in = new Scanner(System.in);

        System.out.print("Input first integer : ");
        int fat = in.nextInt();
        int count = 0, value = 1;

        for(int i = 1 ; i <= fat ; i++){
            value *= i;
        }

        String valueText = Integer.toString(value);

        for(int i = valueText.length() - 1 ; i >= 0  ; i--){
            int temp = Integer.parseInt(valueText.charAt(i) + "");
            if(temp == 0){
                count++;
            }else{
                break;
            }
        }
        System.out.println("Fatorial: " + value);
        System.out.println("Result: " + count);
    }
}
