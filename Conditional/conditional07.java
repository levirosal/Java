// 7. Write a Java program to find the number of days in a month.

import java.util.*;

public class conditional07{
    public static void main(String[] args){
      Scanner in = new Scanner(System.in);
      String monthName = "";
      int numberDays = 0;

      System.out.print("Input a month number: ");
      int month = in.nextInt();

      System.out.print("Input a year: ");
      int year = in.nextInt();

      switch(month){
        case 1:
          monthName = "January";
          numberDays = 31;
          break;
        case 2:
          monthName = "February";
          if((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0))){
            numberDays = 29;
          }else{
            numberDays = 28;
          }
          break;
        case 3:
          monthName = "March";
          numberDays = 31;
          break;
        case 4:
          monthName = "April";
          numberDays = 30;
          break;
        case 5:
          monthName = "May";
          numberDays = 31;
          break;
        case 6:
          monthName = "June";
          numberDays = 30;
          break;
        case 7:
          monthName = "July";
          numberDays = 31;
          break;
        case 8:
          monthName = "August";
          numberDays = 31;
          break;
        case 9:
          monthName = "September";
          numberDays = 30;
          break;
        case 10:
           monthName = "October";
           numberDays = 31;
           break;
        case 11:
           monthName = "November";
           numberDays = 30;
           break;
        case 12:
           monthName = "December";
           numberDays = 31;
       }
        System.out.print(monthName + " " + year + " has " + numberDays + " days\n");
    }
}
