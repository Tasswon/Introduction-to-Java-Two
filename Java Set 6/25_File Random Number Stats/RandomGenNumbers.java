/**Name: Joseph Tassone
 * Description:  Create a file (if it exists); and report the sum of 
 * all the integers, the largest and smallest integer, and the average of the integers. 
 */

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class RandomGenNumbers {
	public static void main(String[] args) throws Exception{
		
		File file = new File("MyData.dat");
		if (file.exists()) {
			System.exit(0);
		}
		
		try (DataOutputStream output = new DataOutputStream(
				new BufferedOutputStream(new FileOutputStream(file))); 
				){
		
			for(int i = 0; i < 200; i++) {
				int number = (int) ((Math.random() * (40000 + 15000)) + (-15000));
				output.writeInt(number);
			}
		}
		
		try (DataInputStream input = new DataInputStream(
				new BufferedInputStream(new FileInputStream(file))); 
				){
			
			int sum = 0;
			int max = -15000;
			int min = 40000; 
			int point;
			
        	while (input.available() > 0) {
        		point = input.readInt();
        		
        		sum += point;
        		
        		if (max < point) {
        			max = point;
        		}
        		
        		if (min > point) {
        			min = point;
        		}
        	}
        	
        	System.out.println("The sum is " + sum);
        	System.out.println("The max is " + max);
        	System.out.println("The min is " + min);
        	System.out.println("The average is " + (sum / 200));
		}
	}
}
