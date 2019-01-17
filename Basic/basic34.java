// 34. Write a Java program to compute the area of a hexagon.
// Area of a hexagon = (6 * s^2)/(4*tan(π/6))
// where s is the length of a side
// Input Data:
// Input the length of a side of the hexagon: 6
// Expected Output:
// The area of the hexagon is: 93.53074360871938

import java.util.*;

public class basic34{
    public static void main(String[] args){
        run();
    }
    public static void run(){
        Scanner in = new Scanner(System.in);
        double lenght = 0;
        double area = 0;
      
        System.out.print("Input the length of a side of the hexagon : ");     
        lenght = in.nextDouble();         
        
        area = (6 * (lenght * lenght)) / (4 * Math.tan(Math.PI / 6));

        System.out.println("The area of the hexagon is: " + area);
    }   
}