// 32. Write a Java program to compare two numbers.
// Input Data:
// Input first integer: 25
// Input second integer: 39
// Expected Output : 
// 25 != 39                                                                          
// 25 < 39                                                                           
// 25 <= 39

import java.util.*;

public class basic32{
    public static void main(String[] args){
        run();
    }
    public static void run(){
        Scanner in = new Scanner(System.in);
        int number1;     
        int number2; 
      
        System.out.print("Input first integer: ");     
        number1 = in.nextInt();   
 
        System.out.print("Input second integer: ");
        number2 = in.nextInt();             
        
        if (number1 == number2){
            System.out.println(number1 + " == "  + number2);  
        }          
        if (number1 != number2){
            System.out.println(number1 + " != " + number2);  
        }          
        if (number1 < number2){
            System.out.println(number1 + " < " + number2);  
        }
        if (number1 > number2){
            System.out.println(number1 + " > " + number2);  
        }
        if (number1 <= number2){
            System.out.println(number1 + " <= " + number2);  
        }
        if (number1 >= number2){
            System.out.println(number1 + " >= " + number2);     
        }
    }   
}