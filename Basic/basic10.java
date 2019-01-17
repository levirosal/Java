// 10. Write a Java program to compute a specified formula.
// Specified Formula : 
// 4.0 * (1 - (1.0/3) + (1.0/5) - (1.0/7) + (1.0/9) - (1.0/11))
// Expected Output
// 2.9760461760461765

public class basic10{
    public static void main(String[] args) {
        run();
    }
    public static void run(){
        double n = 4.0 * (1 - (1.0 / 3) + (1.0 / 5) - (1.0 / 7) + (1.0 / 9) - (1.0 / 11));
        System.out.println(n);
    }
}