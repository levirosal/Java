// 33. Write a Java program and compute the sum of the digits of an integer.
// Input Data:
// Input an integer: 25
// Expected Output :
// The sum of the digits is: 7

import java.util.*;

public class basic33{
    public static void main(String[] args){
        run();
    }
    public static void run(){
        Scanner in = new Scanner(System.in);
        int sum = 0;
      
        System.out.print("Input an integer: ");
        char[] rest = in.nextLine().toCharArray();


        for (int i = rest.length - 1; i >= 0; i--) {
            sum += Character.getNumericValue(rest[i]);
        }
        System.out.println("The sum of the digits is : " + sum);     

    }   
}