// 13. Write a Java program to print the area and perimeter of a rectangle.
// Test Data:
// Width = 5.5 Height = 8.5

// Expected Output
// Area is 5.6 * 8.5 = 47.60
// Perimeter is 2 * (5.6 + 8.5) = 28.20

public class basic13{
    public static void main(String[] args) {
        run();
    }

    public static void run(){
        double w = 5.6;
        double h = 8.5;
        double p = 2*(h + w);		
        double a = w * h;
        		
        System.out.printf("Area is %.1f * %.1f = %.2f \n", w, h, a);
		System.out.printf("Perimeter is 2*(%.1f + %.1f) = %.2f \n", h, w, p);
    }
}