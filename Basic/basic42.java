// 42. Write a Java program to input and display your password.
// Expected Output :
// Input your Password:                                                    
// Your password was: abc@123

import java.io.Console;

public class basic42{
    public static void main(String[] args){
        run();
    }
    public static void run(){
		Console pass;
		if ((pass = System.console()) != null){
            char[] pass_ward = null;
			try{
                pass_ward = pass.readPassword("Input your Password:");
				System.out.println("Your password was: " + new String(pass_ward));
			}finally{
                if (pass_ward != null) {
                    java.util.Arrays.fill(pass_ward, ' ');
				}
			}
		} else {
            throw new RuntimeException("Can't get password...No console");
		}
    }
}