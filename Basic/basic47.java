// 47. Write a Java program to display the current date time in specific format. 
// Sample Output:
// Now: 2017/06/16 08:52:03.066 

import java.util.*;
import java.text.*;

public class basic47{
    public static void main(String[] args){
        run();
    }
    public static void run(){
        Date date = GregorianCalendar.getInstance().getTime();
        SimpleDateFormat simpleDate = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss.SSS");
        System.out.println("Now: " + simpleDate.format(date));
    }
}