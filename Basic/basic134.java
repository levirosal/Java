// 134. Write a Java program to find the distinct ways you can climb to the top (n steps to reach to the top) of stairs. Each time you can either climb 1 or 2 steps. Go to the editor
// Example: n = 5
// a) 1+1+1+1+1 = 5 b) 1+1+1+2 = 5 c) 1+2+2 = 5 d) 2+2+1 = 5 e) 2+1+1+1 = 5 f) 2+1+2 = 5 g) 1+2+1+1 = 5 h) 1+1+2+1 = 5
import java.util.*;

public class basic134{
    public static void main(String[] args){
        run();
    }
    public static void run(){
        Scanner in = new Scanner(System.in);

        System.out.print("Input integer : ");
        int value = in.nextInt();

        System.out.println("Distinct ways: " + climbStairs(value));
    }
    public static int climbStairs(int n) {
        if (n <= 1) {
            return 1;
        }
        int[] s_case = new int[n + 1];
        s_case[0] = 1;
        s_case[1] = 1;
        for (int i = 2; i <= n; i++) {
            s_case[i] = s_case[i - 1] + s_case[i - 2];
        }
        return s_case[n];
    }
}
