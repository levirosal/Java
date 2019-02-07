// 5. Write a Java program that keeps a number from the user and generates an integer between 1 and 7 and displays the name of the weekday.

import java.util.*;

public class conditional05{
    public static void main(String[] args){
      Scanner in = new Scanner(System.in);

      System.out.print("Input a number: ");
      int value = in.nextInt();

      System.out.println(getDay(value));

    }
    public static String getDay(int day){
      String dayName = "";
      switch(day){
        case 1: dayName = "Monday"; break;
        case 2: dayName = "Tuesday"; break;
        case 3: dayName = "Wednesday"; break;
        case 4: dayName = "Thursday"; break;
        case 5: dayName = "Friday"; break;
        case 6: dayName = "Saturday"; break;
        case 7: dayName = "Sunday"; break;
        default:dayName = "Invalid day";
      }
      return dayName;
    }
}
