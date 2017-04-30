/**Name: Joseph Tassone
 * Course: COSC1047
 * Date: June 27, 2016
 * Description: Sums up the series using recursion.
 */

import java.util.Scanner;

public class SumTheDigits {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter an integer: ");
        int n = input.nextInt();
        System.out.println(sumDigits(n));
    }

    public static long sumDigits(long n) {
        if (n == 0) {
            return 0;
        }
        else {
        	long x = n % 10;
        	return  x + sumDigits(n / 10);
        }
    }
}