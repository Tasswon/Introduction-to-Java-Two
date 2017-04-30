/**Name: Joseph Tassone
 * Course: COSC1047
 * Assignment: 2
 * Question: 6 (11.16)	
 * Date: June 7, 2016
 * Description: Creates a math quiz, and tells the user if an incorrect answer has been answered
 */

import java.util.ArrayList;
import java.util.Scanner;

public class RepeatAdditionQuiz {
    public static void main(String[] args) {
    	Scanner input = new Scanner(System.in);
    	
    	//Program generate two random numbers between 1 and 10
        int number1 = (int)(Math.random() * 10);
        int number2 = (int)(Math.random() * 10);
        
        //Allows user to enter an answer
        System.out.print( "What is " + number1 + " + " + number2 + "? ");
        int answer = input.nextInt();
        
        //Creates an array list which will store incorrect answers
        ArrayList<Integer> sameAnswer = new ArrayList<>();
        
        //Loops until user enters the correct answer
        while (number1 + number2 != answer) {
        	
        	//Tells the user if they've answered the same thing again, but looking through the arraylist
            if (sameAnswer.contains(answer)) {
                System.out.println("You already entered " + answer);
                System.out.print("Wrong answer. Try again. What is " + number1 + " + " + number2 + "? ");
            }
            //If the same answer hasn't been entered then tells them incorrect, and adds to the arraylist
            else {
            	System.out.print("Wrong answer. Try again. What is " + number1 + " + " + number2 + "? ");
            	sameAnswer.add(answer);
            }
            answer = input.nextInt();
        }
        
        System.out.println("You got it!");
    }
}