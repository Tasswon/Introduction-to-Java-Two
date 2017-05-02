/**Name: Joseph Tassone
 * Description: Creates a pie chart to display the percentages of the overall grade
 */

import java.util.ArrayList;
import java.util.Scanner;
import javafx.application.Application;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.shape.Arc;
import javafx.scene.shape.ArcType;
import javafx.scene.paint.Color;
import javafx.scene.layout.Pane;
import javafx.scene.text.Text;
import javafx.geometry.Insets;

public class DisplayPieChart extends Application {

	public static void main(String[]args) {
		launch(args);
	}
	
	public void start(Stage primaryStage) {
		Scanner input = new Scanner(System.in);
		
		//Alows user to enter how many pieces 
		System.out.print("Enter values: ");
		int arcValue = input.nextInt();
		
		Pane pane = new Pane();
		
		double[] value = new double[arcValue];
		
		//Determines the values of each piece
		System.out.print("Enter the percentages: ");
		
		//Assigns each value to a point in an array
		for(int i = 0; i < value.length; i++) {
			value[i] = input.nextInt();
		}
		
		double sum = 0;
		int xAndY = 200;
		int radius = 100;
		
		//Sums the array values to a point that will be used to determine the value percentage
		for(int i = 0; i < value.length; i++) {
			sum += value[i];
		} 
		
		//Stores each arc into an arrayList 
		ArrayList<Object> arcHolder = new ArrayList<>();
	
		Color newColor = new Color(0,0,0,1.0);
		double startAngle = 0;
		
		//Loops through and creates an arc up to the number of pie chart pieces
		for(int x = 0; x < value.length; x++) {
			Arc arc = new Arc(xAndY, xAndY, radius, radius, startAngle, 360 * (value[x] / sum));
			startAngle += 360 * (value[x] / sum);
			arc.setFill(newColor.rgb((int)(Math.random() * 255), (int)(Math.random() * 255), (int)(Math.random() * 255)));
			arc.setType(ArcType.ROUND);
			arcHolder.add(x, arc);
		}
		
		//Displays objects held in the arcHolder arrayList
		for(int i = 0; i < value.length; i++) {
			pane.getChildren().add((Node) arcHolder.get(i));	
		}
		Scene scene = new Scene(pane, 400, 400);
		primaryStage.setTitle("Display Pie Chart");
		primaryStage.setScene(scene); 
		primaryStage.show(); 
	}
}