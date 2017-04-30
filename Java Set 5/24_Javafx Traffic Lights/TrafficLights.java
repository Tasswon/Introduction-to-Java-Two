/**Name: Joseph Tassone
 * Course: COSC1047
 * Date: June 20, 2016
 * Description: Displays a traffic light with option to change light colours
 */

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.CheckBox;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Ellipse;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class TrafficLights extends Application {

  public static void main(String[] args) {
	  Application.launch(args);
  }
  
  @Override // Override the start method in the Application class
  public void start(Stage primaryStage) {
	  
	 StackPane pane = new StackPane();
     
	 Rectangle rectangle = new Rectangle();
	 rectangle.setWidth(50);
	 rectangle.setHeight(140);
	 rectangle.setFill(Color.WHITE);
	 rectangle.setStroke(Color.BLACK);
	  
     Circle circleRed = new Circle ();	
     circleRed.setRadius(20);
     circleRed.setFill(Color.WHITE);
     circleRed.setStroke(Color.BLACK);
     
     Circle circleYellow = new Circle ();
     circleYellow.setRadius(20);
     circleYellow.setFill(Color.WHITE);
     circleYellow.setStroke(Color.BLACK);
     
     Circle circleGreen = new Circle ();
     circleGreen.setRadius(20);
     circleGreen.setFill(Color.WHITE);
     circleGreen.setStroke(Color.BLACK);
       
     RadioButton rbRed = new RadioButton("Red");
     RadioButton rbYellow = new RadioButton("Yellow");
     RadioButton rbGreen = new RadioButton("Green");
     
     ToggleGroup group = new ToggleGroup();
     rbRed.setToggleGroup(group);
     rbYellow.setToggleGroup(group);
     rbGreen.setToggleGroup(group);
     
     rbRed.setOnAction(e -> {
    	 circleRed.setFill(Color.RED);
    	 circleYellow.setFill(Color.WHITE);
    	 circleGreen.setFill(Color.WHITE);
     });
     
     rbYellow.setOnAction(e -> {
    	 circleRed.setFill(Color.WHITE);
    	 circleYellow.setFill(Color.YELLOW);
    	 circleGreen.setFill(Color.WHITE);
     });
     
     rbGreen.setOnAction(e -> {
    	 circleRed.setFill(Color.WHITE);
    	 circleYellow.setFill(Color.WHITE);
    	 circleGreen.setFill(Color.GREEN);
     });
     
     HBox hbox = new HBox(5);
     hbox.getChildren().addAll(rbRed, rbYellow, rbGreen);
     hbox.setAlignment(Pos.CENTER);
     
     VBox vbox = new VBox(5);
     vbox.getChildren().addAll(circleRed, circleYellow, circleGreen);
     vbox.setAlignment(Pos.CENTER);
    
     pane.getChildren().addAll(rectangle, vbox);
     
     BorderPane borderpane = new BorderPane();
     borderpane.setCenter(pane);
     borderpane.setBottom(hbox);

     Scene scene = new Scene(borderpane, 200, 200);
    
     primaryStage.setTitle("Traffic Lights");
     primaryStage.setScene(scene);
     primaryStage.show();
  }
}
