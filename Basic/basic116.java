// 116. Write a Java program which iterates the integers from 1 to 100. For multiples of three print "Fizz" instead of the number and print "Buzz" 
// for the multiples of five. When number is divided by both three and five, print "fizz buzz". 

import java.util.*;
public class basic116{
    public static void main(String[] args){
        run();
    }
    public static void run(){
        Scanner in = new Scanner(System.in);

        System.out.print("Input number: ");
        int n = in.nextInt();

        for(int i = 0; i <= 100; i++){
            if(i % 3 == 0){
                System.out.printf("\n%d: fizz",i);
            }else if(i % 5 == 0){
                System.out.printf("\n%d: buzz",i);
            }else if(i % 3 == 0 && i % 5 == 0) {
                System.out.printf("\n%d: fizz buzz",i);
            }
        }
    }
}
