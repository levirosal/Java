// 11. Write a Java program to print the area and perimeter of a circle. Go to the editor
// Test Data:
// Radius = 7.5 
// Expected Output
// Perimeter is = 47.12388980384689 
// Area is = 176.71458676442586
import java.util.Scanner;

public class basic11{
    public static void main(String[] args) {
        run();
    }
    public static void run(){
        Scanner in = new Scanner(System.in);
        double PI = 3.14159265358979323846;
        System.out.println("Input the radius of the circle: ");
        double r = in.nextDouble();
        System.out.println("Perimeter = " + (2 * r * PI));
        System.out.println("Area = " + (PI * r * r));
    }
}