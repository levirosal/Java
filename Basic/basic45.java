// 45. Write a Java program to find the size of a specified file.
// Sample Output:
// /home/students/abc.txt  : 0 bytes                                      
// /home/students/test.txt : 0 bytes 

import java.io.File;

public class basic45{
    public static void main(String[] args){
        run();
    }
    public static void run(){
        System.out.println("/home/students/abc.txt  : " + new File("abc.txt").length() + " bytes");
        System.out.println("/home/students/test.txt : " + new File("test.txt").length() + " bytes");

    }
}