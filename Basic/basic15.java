// 15. Write a Java program to swap two variables.

public class basic15{
    public static void main(String[] args) {
        run();
    }
    public static void run(){
        int a,b,c;
        a = 20;
        b = 30;
        System.out.println("Before: a = " + a + "  b = "+ b);
        c = a;
        a = b;
        b = c;   
       System.out.println("After: a = " + a + "  b = "+ b);
    }
}