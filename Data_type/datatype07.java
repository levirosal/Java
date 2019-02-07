// 7. Write a Java program to takes the user for a distance (in meters) and the time was taken (as three numbers: hours, minutes, seconds), and display the speed, in meters per second, kilometers per hour and miles per hour (hint: 1 mile = 1609 meters). Go to the editor

// Test Data
// Input distance in meters: 2500 
//Input hour: 5 
// Input minutes: 56
// Input seconds: 23
// Expected Output :
// Your speed in meters/second is 0.11691531 
// Your speed in km/h is 0.42089513 
// Your speed in miles/h is 0.26158804

import java.util.*;

public class datatype07{
    public static void main(String[] args){
      run();
    }
    public static void run(){
      Scanner in = new Scanner(System.in);

      float timeSeconds;
      float mps,kph, mph;

      System.out.print("Input distance in meters: ");
      float distance = in.nextFloat();

      System.out.print("Input hour: ");
      float hr = in.nextFloat();

      System.out.print("Input minutes: ");
      float min = in.nextFloat();

      System.out.print("Input seconds: ");
   		float sec = in.nextFloat();

      timeSeconds = (hr*3600) + (min*60) + sec;
      mps = distance / timeSeconds;
      kph = ( distance/1000.0f ) / ( timeSeconds/3600.0f );
      mph = kph / 1.609f;

      System.out.println("\nYour speed in meters/second is " + mps + "\nYour speed in km/h is " + kph + "\nYour speed in miles/h is " + mph);
    }
}
