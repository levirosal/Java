// 87. Write a Java program than read an integer and calculate the sum of its digits and write the number 
// of each digit of the sum in English.

import java.util.*;

public class basic87{
    public static void main(String[] args){
        run();
    }
    public static void run(){
        ArrayList<String> numbers = new ArrayList<String>();
        numbers.addAll(Arrays.asList("Zero","One","Two","Three","Four","Five","Six","Seven","Eight","Nine"));

        Scanner in = new Scanner(System.in);
        int sumInt = 0;
        
        System.out.print("Input a number: ");
        char[] numStr = in.nextLine().toCharArray();        
        
		for(int i = 0; i < numStr.length; i ++){
            sumInt += Character.getNumericValue(numStr[i]);
        } 

        String sumString = Integer.toString(sumInt);
        int[] sumList = new int[sumString.length()];
        for(int i = 0; i < sumString.length(); i++){
            sumList[i] = sumString.charAt(i) - '0';
        }
        System.out.print("Sum Number: " + sumInt + "\nIn English: ");
      
		for(int i = 0; i <= sumList.length -1 ; i ++){
            System.out.print(numbers.get(sumList[i]) + " ");
        }
        System.out.println("");
	} 
}         