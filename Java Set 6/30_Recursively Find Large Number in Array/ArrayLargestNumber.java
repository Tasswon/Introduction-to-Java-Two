/**Name: Joseph Tassone
 * Description: Uses recursion to determine the largest number in an array.
 */

import java.util.Arrays;
import java.util.Scanner;

public class ArrayLargestNumber {
    public static void main(String[] args) {
    	Scanner input = new Scanner(System.in);
    	
        int[] array = new int[8];
        System.out.print("Enter eight numbers: ");

        for (int i = 0; i < array.length; i++)
            array[i] = input.nextInt();

        System.out.println("The max is " + max(array, 0, 0));
        System.out.println(Arrays.toString(array));
    }

    public static int max(int[] array, int index, int maxVal) {
        
    	if(index == array.length - 1) {
    		return maxVal;
    	}
    	if (maxVal < array[index]){
    		maxVal = array[index];
    	}
    	return max(array, index + 1, maxVal);
    }
}