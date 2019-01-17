// 46. Write a Java program to display the system time. 
// Sample Output:
// Current Date time: Fri Jun 16 14:17:40 IST 2017 
import java.util.*;
import java.text.*;

public class basic46{
    public static void main(String[] args){
        run();
    }
    public static void run(){
        Date date = GregorianCalendar.getInstance().getTime();
        System.out.println("Current Date time: " + date);
    }
}