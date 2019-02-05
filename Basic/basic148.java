// 148. Write a Java program to find the index of the first unique character in a given string, assume that there is at least one unique character in the string. Go to the editor
// Sample Output:
// Original String: wresource
// First unique character of the above: 0
import java.util.*;

public class basic148{
    public static void main(String[] args){
        run();
    }
    public static void run(){
        Scanner in = new Scanner(System.in);

        System.out.print("Input first string: ");
        String str = in.nextLine();

        System.out.println("First unique character: Index " + first(str));
   }

   public static int first(String str){
     int[] freq = new int[256];
     for(char c : str.toCharArray()){
       freq[c - 'a']++;
     }
     for(int i = 0; i < str.length(); i++){
       if(freq[str.charAt(i) - 'a'] == 1){
         return i;
       }
     }
     return -1;
   }
}
