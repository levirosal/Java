// 84. Write a Java program to take the last three characters from a given string and add the three characters at both the front and back of the string. String length must be greater than three and more. Go to the editor
// Test data: "Python" will be "honPythonhon"
// Sample Output:
// honPythonhon

import java.util.*;

public class basic84{
    public static void main(String[] args){
        run();
    }
    public static void run(){
        Scanner in = new Scanner(System.in);

        System.out.print("Input a string: ");
        String text = in.nextLine();

        String three = text.substring(text.length() - 3 , text.length());

        System.out.println(three + text + three);
    }   
}