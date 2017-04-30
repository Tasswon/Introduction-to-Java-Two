/**Name: Joseph Tassone
 * Course: COSC1047
 * Date: June 27, 2016
 * Description: Looks up a file and converts values to hex
 */

import java.util.Scanner;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;

public class ViewHex {
    public static void main(String[] args) throws Exception {
    	Scanner input = new Scanner(System.in);
    	
        System.out.print("Enter a file: ");
        String fileName = input.next();
        File file = new File(fileName);
        
        try (BufferedInputStream input2 = 
        		new BufferedInputStream(new FileInputStream(file))) {

        	int hexValue;
        	while ((hexValue = input2.read()) != -1) {
        		System.out.println(Integer.toHexString(hexValue));
        	}
        }
    }
}