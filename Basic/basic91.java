// 91. Write a Java program to measure how long some code takes to execute in nanoseconds.

import java.util.*;
import java.util.concurrent.TimeUnit;

public class basic91{
    public static void main(String[] args){
        run();
    }
    public static void run(){
        long startTime = System.nanoTime(); 

        int i;
        System.out.println ("The first 10 natural numbers are:\n");
        for (i=1 ; i <= 1000000 ; i++){     
            System.out.println (i);
        }
        long estimatedTime = System.nanoTime() - startTime;

        long seconds = TimeUnit.SECONDS.convert(estimatedTime, TimeUnit.NANOSECONDS);

        System.out.println("Estimated time: " + seconds);
	} 
}         