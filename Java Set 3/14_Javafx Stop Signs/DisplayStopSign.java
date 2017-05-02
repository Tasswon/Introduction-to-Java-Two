/**Name: Joseph Tassone
 * Description: Creates two stop signs next to each other, that constantly center themselves
 */

import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.scene.shape.Polygon;
import javafx.scene.text.Font;
import javafx.scene.text.Text;


public class DisplayStopSign extends Application {
    public void start(Stage primaryStage) throws Exception {
    	
    	//The HBox stores the two stackpanes, side by side
    	HBox splitter = new HBox(50);
        StackPane pane = new StackPane();
        StackPane pane2 = new StackPane();
        
        //Creates two polygons which will be the stop signs
        Polygon polygon = new Polygon();
        polygon.setStroke(Color.BLACK);
        polygon.setFill(Color.RED);
        
        Polygon polygon2 = new Polygon();
        polygon2.setStroke(Color.BLACK);
        polygon2.setFill(Color.RED);
        
        //These two observable lists will track changes to the signs
        ObservableList<Double> points = polygon.getPoints();
        ObservableList<Double> points2 = polygon2.getPoints(); 
        
        double width = 200, height = 200;
        double centerX = width / 2, centerY = height / 2;
        double radius = 80;
        
        
        //For loops set the sides and placement for each of the corners
        for (int i = 0; i < 8; i++) {
        	points.add(centerX + radius * Math.cos(2 * i * Math.PI / 8));
        	points.add(centerY - radius * Math.sin(2 * i * Math.PI / 8));
        }
        
        for (int i = 0; i < 8; i++) {
        	points2.add(centerX + radius * Math.cos(2 * i * Math.PI / 8));
        	points2.add(centerY - radius * Math.sin(2 * i * Math.PI / 8));
        }
        
        //Rotates the signs and puts the text within them
        polygon.setRotate(23);
        Text text = new Text("STOP");
        text.setFont(Font.font(50));
        text.setFill(Color.WHITE);
        
        polygon2.setRotate(23);
        Text text2 = new Text("ARRET");
        text2.setFont(Font.font(50));
        text2.setFill(Color.WHITE);
       
        pane.getChildren().addAll(polygon, text);
        pane2.getChildren().addAll(polygon2, text2);
      
        //Forces the HBox to constantly center itself 
        splitter.getChildren().addAll(pane, pane2);
        splitter.setAlignment(Pos.CENTER);
        
        Scene scene = new Scene(splitter, 400, 200);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Show Stopsigns");
        primaryStage.show();
    }
    
    public static void main(String[] args) {
        launch(args);
    }
}