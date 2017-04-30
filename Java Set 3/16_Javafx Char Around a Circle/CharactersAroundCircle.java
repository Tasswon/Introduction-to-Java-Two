/**Name: Joseph Tassone
 * Course: COSC1047	
 * Date: June 9, 2016
 * Description: Displays a string My name is Joseph around the circle
 */

import java.util.ArrayList;
import javafx.application.Application;
import javafx.geometry.Point2D;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class CharactersAroundCircle extends Application{

    public void start(Stage primaryStage) {

        Pane pane = new Pane();
        
        //Creates string which will be put into a circle
        String phrase = " My name is Joseph";
        ArrayList<Text> stringValue = new ArrayList<>();
        
        //Variables used to place letters in a circle and to rotate letters
        int rotation = 360 / phrase.length();
        int rotationCounter = 0;
        int rotationTracker = 70;
        
        //Loops until each letter is placed and rotated 
        for(int i = 0; i < phrase.length(); i++) {
        	String x = Character.toString(phrase.charAt(i));
        
        	Text text = new Text(x);
        	text.setFont(Font.font(20));
        	text.setFill(Color.BLACK);
        	
        	//Used to set letter point
        	double xPoint = 150 + (Math.cos(Math.toRadians(rotationCounter)) * 100);
        	double yPoint = 150 + (Math.sin(Math.toRadians(rotationCounter)) * 100);
     
        	rotationCounter += rotation;
        	rotationTracker += rotation;
        	
        	//Used to set letter rotation
        	text.setRotate(rotationTracker);
        	
        	text.setX(xPoint);
        	text.setY(yPoint);
        	
        	//Stores text objects into array
        	stringValue.add(i, text);
        }
        
        //Loops and prints each text object from the array
        for(int y = 0; y < stringValue.size(); y++) {
        	pane.getChildren().add(stringValue.get(y));
        }
        
        Scene scene = new Scene(pane, 300, 300);
        primaryStage.setTitle("Display String Circle");
		primaryStage.setScene(scene); 
		primaryStage.show(); 
    }
    
    public static void main(String[] args) {
        launch(args);
    }
}