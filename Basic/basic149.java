// 149. Write a Java program to check if a given string is a permutation of another given string. Go to the editor
// Sample Output: 
// Original strings: xxyz yxzx
// true
import java.util.*;

public class basic149{
    public static void main(String[] args){
        run();
    }
    public static void run(){
        Scanner in = new Scanner(System.in);

        System.out.print("Input first string: ");
        String str1 = in.nextLine();

        System.out.print("Input second string: ");
        String str2 = in.nextLine();
        System.out.println("Is permutation of another string: " + isPermutation(str1,str2));
   }

   public static boolean isPermutation(String str1, String str2){
        boolean result = false;
        char[] str11 = str1.toCharArray();
        Arrays.sort(str11);

        char[] str22 = str2.toCharArray();
        Arrays.sort(str22);

        for(int i = 1; i < str11.length; i++){
            if(str11[i] == str22[i]){
              result = true;
            }else{
              return false;
            }
        }
        if(str1 == null || str2 == null){
            return false;
        }else if(str11.length != str22.length){
            return false;
        }else if(str11.length == 0 && str22.length == 0){
            return true;
        }
        return result;
   }
}
