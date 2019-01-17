// 88. Write a Java program to get the current system environment and system properties. 

import java.util.*;

public class basic88{
    public static void main(String[] args){
        run();
    }
    public static void run(){
        System.out.println("System environment: \n");
        System.out.println(System.getenv());	 
        System.out.println("System properties: \n");
        System.out.println(System.getProperties());	
    
	} 
}         