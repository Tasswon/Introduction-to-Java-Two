/**Name: Joseph Tassone
 * Description: Program traverses from a URL to any connected URLs, 
 * then takes count of the total words and lines from them
 */

import java.util.Scanner;
import java.net.URL;
import java.util.ArrayList;

public class WebCrawler {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
	
		System.out.print("Enter a URL: ");
		String url = input.nextLine();
		crawler(url); // Traverse the Web from the a starting url
	}

	public static void crawler(String startingURL) {
		ArrayList<String> listOfPendingURLs = new ArrayList<>();
		ArrayList<String> listOfTraversedURLs = new ArrayList<>();
		
		listOfPendingURLs.add(startingURL);
		int characters = 0;
		int words = 0;
		int lines = 0;
		
		while (!listOfPendingURLs.isEmpty() && listOfTraversedURLs.size() <= 10) {
			String urlString = listOfPendingURLs.remove(0);
			
			if (!listOfTraversedURLs.contains(urlString)) {
				listOfTraversedURLs.add(urlString);
				System.out.println("Crawl " + urlString);
				
				/*As it progresses through the loops takes total of lines, characters, and words
				 *Note: the counts never reset as they exist within the loop*/
				
				try {
					URL url = new URL (urlString);
					Scanner input = new Scanner(url.openStream());
				
					while(input.hasNextLine()) {
						String s2 = input.nextLine();
						lines++;
						
						characters += s2.length();
						
						String[] z = s2.split(" ");
						words += z.length;
					}
				}
				catch (Exception ex1) {
					System.out.print(ex1);
				}
				
				for (String s: getSubURLs(urlString)) {
					if (!listOfTraversedURLs.contains(s))
						listOfPendingURLs.add(s);
				}
			}
		}
		//Prints number of URLS visited and total words/lines within them
		System.out.println("Number of unique URLs travelled: " + listOfTraversedURLs.size());
		System.out.println("Number of words found: " + words);
		System.out.println("Number of lines found: " + lines);
	}
	
	public static ArrayList<String> getSubURLs(String urlString) {
		ArrayList<String> list = new ArrayList<>();

		try {
			java.net.URL url = new java.net.URL(urlString);
			Scanner input = new Scanner(url.openStream());
			int current = 0;
			
			while (input.hasNext()) {
				String line = input.nextLine();
				current = line.indexOf("http:", current);

				while (current > 0) {
					int endIndex = line.indexOf("\"", current);
					if (endIndex > 0) { // Ensure that a correct URL is found
						list.add(line.substring(current, endIndex));
						current = line.indexOf("http:", endIndex);
					}
					
					else
						current = -1;
				}
			}
		}
		catch (Exception ex) {
			System.out.println("Error: " + ex.getMessage());
		}
		
		return list;
		}
}