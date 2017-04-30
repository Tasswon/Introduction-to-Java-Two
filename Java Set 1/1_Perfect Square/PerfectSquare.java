/**Name: Joseph Tassone
 * Course Code: COSC1047
 * Date: June 1, 2016
 * Description: Prompts the user to enter an integer
 * m and finds the smallest integer n such that m * n is a perfect square.
 */

import java.util.ArrayList;
import java.util.Scanner;

public class PerfectSquare {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		ArrayList<Integer> arrayList = new ArrayList<>();
		
		//Enters a value of m
		System.out.print("Enter a value of m: ");
        int m = input.nextInt();
        int keep = m;
        
        //Completes prime factorization of number
        int count = 2;
        while (count <= m) {
            if (m % count == 0) {
                arrayList.add(count);
                m /= count;
            } else {
                count++;
            }
        }
   
        int store = 1;
        
        for(int y = 0; y < arrayList.size(); y++) {
        	 int x = arrayList.get(y);
             int sum = 1;
             
             arrayList.set(y, 0);
             
             if(x == 0) {
            	 continue;
             }
             
             for(int i = 0; i < arrayList.size(); i++) {
            	 if (x == arrayList.get(i)) {
            		 sum++;
            		 arrayList.set(i, 0);
            	 }
             }
             
             //Determines whether the occurrence of a number is odd
             if (sum % 2 != 0) {
          		store *= x;
             }
             
    	}
        System.out.println();
        System.out.println("The smallest number n for m * n to be a erfect square is " + store);
        System.out.println("m * n is " + (keep * store));
	}
}



