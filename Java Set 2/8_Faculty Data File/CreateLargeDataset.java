/**Name: Joseph Tassone
 * Course: COSC1047
 * Date: June 7, 2016
 * Description: Creates a data file with 1,000 lines that consists of a faculty member’s first name, last name, rank, and salary.
 */

import java.io.PrintWriter;

public class CreateLargeDataset {
	public static void main(String[] args) {
		
		//Creates a file called Salary.txt
		try (PrintWriter output = new PrintWriter("C:/Users/Joseph/Desktop/Test Text Folder/Salary.txt")) {
			
			//Loops the program for 1000 lines
			for (int i = 1; i <= 1000; i++) {
				
				//Methods generate random rank and random salary based on rank
				String rank = rank();
	            Double salary = salary(rank);
	            
	            //Prints the "i"th point in the loop next to both names and then the rank
	            output.print("FirstName" + i + " LastName" + i + " " + rank + " ");
	            //Prints salary to two decimal points
	            output.printf("%.2f", salary);
	            //Ensures that it starts a new line
	            output.println();
	        }
		} 
	    catch (Exception e) {
	    	e.printStackTrace();
	    	}
		}

	public static String rank() {
		
		//String array holds the potential ranks
		String[] ranks = {"assistant", "associate", "full"};
		
		//Generates a random point in the array for the return value
		String returnRank = ranks[(int) (Math.random() * ranks.length)];
		
		return returnRank;
	}

	public static double salary (String rank) {
		
		//Uses a bunch of if statements to determine salary range by rank
		int max = 0;
	    int min = 0;
	        
	    if (rank.equals("assistant")) {
	    	min = 50000;
            max = 80000;
	    }
	        
        else if (rank.equals("associate")) {
        	min = 60000;
            max = 110000;
        }
	        
        else if (rank.equals("full")) {
        	min = 75000;
            max = 130000;
        }
	    
	    //Generates a random salary based on the specific if and returns said value
	    double returnSalary = (double) (Math.random() * (max - min) + min);
	    
        return returnSalary;
    }
}