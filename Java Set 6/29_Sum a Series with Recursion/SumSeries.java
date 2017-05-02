/**Name: Joseph Tassone
 * Description: Uses recursion to sum up a series of numbers.
 */

import java.util.Scanner;

public class SumSeries {
    public static void main(String[] args) {
    	Scanner input = new Scanner(System.in);
    	
    	System.out.print("Enter how many numbers you wish to sum: ");
    	
    	int m = input.nextInt();
    	
        for (int i = 1; i < m; i++) {
            System.out.printf("%s%d%s%.3f\n", "M(", i, ")= ",  sumSeries(i));
        }
    }

    public static double sumSeries(int i) {
        if (i == 1) {
            return (1.0 / 3.0);
        }
        else {
        	double x = (i / (2.0 * i + 1));
            return x + sumSeries(i - 1);
        }
    }
}