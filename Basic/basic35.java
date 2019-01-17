// 35. Write a Java program to compute the area of a polygon.
// Area of a polygon = (n*s^2)/(4*tan(π/n))
// where n is n-sided polygon and s is the length of a side
// Input Data:
// Input the number of sides on the polygon: 7
// Input the length of one of the sides: 6
// Expected Output:
// The area is: 130.82084798405722

import java.util.*;

public class basic35{
    public static void main(String[] args){
        run();
    }
    public static void run(){
        Scanner in = new Scanner(System.in);
        double sides = 0;
        double length = 0;
        double area = 0;
      
        System.out.print("Input the number of sides on the polygon: ");     
        sides = in.nextDouble();
        
        System.out.print("Input the length of one of the sides : ");     
        length = in.nextDouble();

        area = (sides * (length * length)) / (4 * Math.tan(Math.PI / sides));

        System.out.println("The area is: " + area);
    }   
}