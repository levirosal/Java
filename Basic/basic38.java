// 38. Write a Java program to count the letters, spaces, numbers and other characters of an input string. Go to the editor
// Expected Output :
// The string is :  Aa kiu, I swd skieo 236587. GH kiu: sieo?? 25.33
// letter: 23                                               
// space: 9                                                 
// number: 10                                               
// other: 6

import java.util.*;

public class basic38{
    public static void main(String[] args){
        run();
    }
    public static void run(){
        Scanner in = new Scanner(System.in);
        int letter = 0, space = 0, number = 0, other = 0;

        System.out.print("Input a string: ");
        char[] text = in.nextLine().toCharArray();

        for (int i = text.length - 1; i >= 0; i--){
			if(Character.isLetter(text[i])){
				letter ++ ;
			}
			else if(Character.isDigit(text[i])){
				number ++ ;
			}
			else if(Character.isSpaceChar(text[i])){
				space ++ ;
			}
			else{
				other ++;
			}
        }
		System.out.println("letter: " + letter);
		System.out.println("space: " + space);
		System.out.println("number: " + number);
		System.out.println("other: " + other);
    }
}