import java.util.*;

public class basicteste{
    public static void main(String[] args){
        run();
    }
    public static void run(){
        Scanner in = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();       
        int value;
        int rem = -1;
        
        System.out.print("Input decimal number: ");
        value = in.nextInt();
                     
        if (value == 0){
            System.out.println("Octal number is: 0");
        }else{
            while (value > 0){
                rem = value % 8;
                value = value / 8;
                sb.insert(0, rem);
            }
            System.out.println("Octal number is: " + sb.toString());
        } 
    }
}