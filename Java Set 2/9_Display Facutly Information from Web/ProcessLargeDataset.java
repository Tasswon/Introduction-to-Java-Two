/**Name: Joseph Tassone
 * Course: COSC1047	
 * Date: June 7, 2016
 * Description: Displays the total salary and average salary for assistant professors, associate professors, full professors, and all faculty
 */

import java.net.URL;
import java.util.ArrayList;
import java.util.Scanner;

//How would you use try and catch with URL and Scanner

public class ProcessLargeDataset {
	public static void main(String[] args) throws Exception {
		
		//Creates three arraylists to hold the respective salaries 
		ArrayList<String> assistant = new ArrayList <>();
		ArrayList<String> associate = new ArrayList <>();
		ArrayList<String> full = new ArrayList <>();
		
		//Sets the URL and creates a scanner to read it
		URL url = new URL("http://cs.armstrong.edu/liang/data/Salary.txt");
        Scanner input = new Scanner(url.openStream());
        
        
        //Sorts the URL and adds salaries to the respective arrays
        while (input.hasNext()) {
            String firstName = input.next();
            String lastName = input.next();
            String rank = input.next();
            String salary = input.next();
            
            if (rank.contains("assistant")) {
            	assistant.add(salary);
            } 
            else if (rank.contains("associate")) {
            	associate.add(salary);
            }
            else if (rank.contains("full")) {
            	full.add(salary);
            } 
        }
        
        //Prints out each total and average for the arraylists 
        System.out.printf("Assistant total = $%.2f", sum(assistant));
        System.out.printf("\nAssistant average = $%.2f", sum(assistant) / (assistant.size()));
        System.out.printf("\nAssociate total = $%.2f", sum(associate));
        System.out.printf("\nAssociate average = $%.2f", sum(associate) / (associate.size()));
        System.out.printf("\nFull total = $%.2f", sum(full));
        System.out.printf("\nFull average = $%.2f", sum(full) / (full.size()));
        
        //Calculates the sum of all salaries and the average of all based on the sum
        Double sumAll = sum(assistant) + sum(associate) + sum(full);
        Double averageAll = sumAll / (assistant.size() + associate.size() +full.size());
        
        System.out.printf("\nAll total = $%.2f", sumAll);
        System.out.printf("\nAll average = $%.2f", averageAll);
        
	}
	
	
	//Method converts each arraylist value to a double and returns the sum of all elements
	public static double sum(ArrayList<String> arrayList) {
    	double sum = 0;
    	double value = 0;
    
    	for (int i = 0; i < arrayList.size(); i++) {
    		value = Double.valueOf(arrayList.get(i));  	
    	sum += value;
    	}
		return sum;
    }
}