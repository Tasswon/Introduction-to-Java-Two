/**Name: Joseph Tassone
 * Description: Count the number of characters, words, and lines in a file or URL
 */

import java.util.Scanner;
import java.io.File;
import java.net.URL;

public class CountFile {
	public static void main(String[]args) throws Exception {
		Scanner input1 = new Scanner(System.in);
		
		//Allows user to decide whether they are checking a file or URL
		System.out.print("Are counting a file or URL: ");
		String selection = input1.next();
		
		//Goes to fileCount method if file
		if(selection.equals("file")) {
			fileCount(true);
		}
		
		//Goes to urlCount method if URL
		else if (selection.equals("URL")); {
			urlCount(true);
		}
	}
		
	public static void fileCount(boolean a) throws Exception {
		Scanner input2 = new Scanner(System.in);
		
		//User enters a file they wish to test out
		System.out.print("Select a file to test: ");
		String fileTest = input2.nextLine();
		
		//File is taken in and scanner reads through it
		try {
		File file = new File(fileTest);
		Scanner input = new Scanner(file);
		
		int character = 0;
		int words = 0;
		int lines = 0;
		
		//Loop sums up the number of lines, characters, and words
		while(input.hasNextLine()) {
			String s = input.nextLine();
			lines++;
			
			character += s.length();
			
			String[] z = s.split(" ");
			words += z.length;
			
		}
		input.close();
		System.out.print(lines);
		System.out.print("\n" + character);
		System.out.print("\n" + words);
		}
		
		//Returns if file isn't found
		catch (Exception ex) {
			System.out.print("Invalid File");
		}
		//Once completed closes the program
		System.exit(0);
	}
		
	public static void urlCount(boolean b)  {
		Scanner input3 = new Scanner(System.in);
		
		//User enters a URL they wish to test out
		System.out.print("Select a URL to test: ");
		String urlTest = input3.next();
		
		//URL is taken in and scanner reads through it (using url.openStream())
		try {
			URL url = new URL(urlTest);
			Scanner input = new Scanner(url.openStream());
		
			int character = 0;
			int words = 0;
			int lines = 0;
			
			//Loop sums up the number of lines, characters, and words
			while(input.hasNextLine()) {
				String s = input.nextLine();
				lines++;
			
				character += s.length();
			
				String[] z = s.split(" ");
				words += z.length;
			}
			System.out.print(lines);
			System.out.print("\n" + character);
			System.out.print("\n" + words);
		}
		//Returns if file isn't found
		catch (Exception ex) {
			System.out.print("Invalid URL");
		}
		//Once completed closes the program
		System.exit(1);
	}
}
