// 89. Write a Java program to check whether a security manager has already been established for the current application or not. 

import java.util.*;

public class basic89{
    public static void main(String[] args){
        run();
    }
    public static void run(){
        System.out.println("Security manager: ");
        System.out.println(System.getSecurityManager());    
	} 
}         