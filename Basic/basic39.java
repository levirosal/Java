// 39. Write a Java program to create and display unique three-digit number using 1, 2, 3, 4. 
// Also count how many three-digit numbers are there.
// Expected Output: 
// 123                                                      
// 124                                                      
// ...                                            
// 431                                                      
// 432                                                      
// Total number of the three-digit-number is 24

import java.util.*;

public class basic39{
    public static void main(String[] args){
        run();
    }
    public static void run(){
		int amount = 0;
		for(int a = 1; a <= 4; a++){
			for(int b = 1; b <= 4; b++){
				for(int c = 1; c <= 4; c++){
                    // if(a < 4){   
					if(a != b && a != c && b != c ){
						amount++;
						System.out.println(a + "" + b + "" + c);
					}
				}
			}
		}
		System.out.println("Total number of the three-digit-number is " + amount);
    }
}