/**Name: Joseph Tassone
 * Description: Asks a string and a file name and then removes all the occurrences of that string from that file
 */

import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;
import java.io.PrintWriter;


public class RemoveStringFromFile {
	public static void main(String[] args) throws Exception {
		Scanner input1 = new Scanner(System.in);
		
		//Allows user to select which file to modify
		System.out.print("Enter a file you wish to modify: ");
		String fileSelect = input1.nextLine();
		
		File firstFile = new File(fileSelect);
		
		//Array list will store all strings from the file
		ArrayList<String> array = new ArrayList<>();
		
		//Allows user to enter a specific string to remove from a file
		System.out.print("Enter a string you wish to remove: ");
		String stringSelect = input1.nextLine();
		
		//Reads through the file and stores the values in an array
		try (
				Scanner input = new Scanner(firstFile);
				) {
			
			while (input.hasNext()) {
				String reader = input.nextLine();
				String replacer = reader.replaceAll(stringSelect, "");
				array.add(replacer);
			}
		}
		
		//Output new file from arraylist
		try (	
				PrintWriter output = new PrintWriter(firstFile);
				) {
			
			for(int i = 0; i < array.size(); i++) {
				output.println(array.get(i));
			}
		}
	}
}
