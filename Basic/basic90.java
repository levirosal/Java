// 90. Write a Java program to get the value of the environment variable PATH, TEMP, USERNAME.

import java.util.*;

public class basic90{
    public static void main(String[] args){
        run();
    }
    public static void run(){
        System.out.println("Environment variable PATH: ");
        System.out.println(System.getenv("PATH"));  
        System.out.println("Environment variable TEMP: ");
        System.out.println(System.getenv("TEMP"));  
        System.out.println("Environment variable USERNAME: ");
        System.out.println(System.getenv("USERNAME")); 
	} 
}         