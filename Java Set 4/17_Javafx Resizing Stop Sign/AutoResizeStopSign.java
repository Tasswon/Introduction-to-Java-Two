/**Name: Joseph Tassone
 * Course: COSC1047
 * Date: June 15, 2016
 * Description: Displays a stop sign that resizes based on the size of the pane
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


public class AutoResizeStopSign extends Application {
    public void start(Stage primaryStage) throws Exception {
    	
    	//The HBox stores the two stackpanes, side by side
        StackPane pane = new StackPane();
        
        //Creates two polygons which will be the stop signs
        Polygon polygon = new Polygon();
        polygon.setStroke(Color.BLACK);
        polygon.setFill(Color.RED);
        
        //These two observable lists will track changes to the signs
        ObservableList<Double> points = polygon.getPoints();
        
        double width = 200, height = 200;
        double centerX = width / 2, centerY = height / 2;
        double radius = 80;
        
        //For loops set the sides and placement for each of the corners
        for (int i = 0; i < 8; i++) {
        	points.add(centerX + radius * Math.cos((2 * i * (Math.PI / 8)) + (Math.PI / 8)));
        	points.add(centerY - radius * Math.sin((2 * i * (Math.PI / 8)) + (Math.PI / 8)));
        }
        
        //Rotates the signs and puts the text within them
        Text text = new Text("STOP");
        text.setFont(Font.font(50));
        text.setFill(Color.WHITE);
        
        pane.getChildren().addAll(polygon, text);
        
        pane.widthProperty().addListener(e-> {
           polygon.setScaleX(pane.getWidth() / 300.0);
           text.setScaleX(pane.getWidth() / 300.0);
        });
        
        pane.heightProperty().addListener(e-> {
            polygon.setScaleY(pane.getHeight() / 300.0);
            text.setScaleY(pane.getHeight() / 300.0);
            
         });
        
        
        Scene scene = new Scene(pane, 300, 300);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Show Stopsigns");
        primaryStage.show();
        
    }
    
    public static void main(String[] args) {
        launch(args);
    }
}