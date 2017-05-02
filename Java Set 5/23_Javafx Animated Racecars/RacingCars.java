/**Name: Joseph Tassone
 * Description: Displays four racecar animations and allows the user to determine
 * their individual speeds
 */

import javafx.scene.shape.Shape;
import javafx.animation.PathTransition;
import javafx.animation.PathTransition.OrientationType;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyCode;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;
import javafx.util.Duration;

public class RacingCars extends Application{
	
	public static void main(String[]args) {
		Application.launch(args);
	}
	
	public void start(Stage primaryStage) {
		
		BorderPane borderpane = new BorderPane();
		Pane pane = new Pane();
		
		Line carOneLine = new Line(-30, 40, 360, 40);
		carOneLine.setStroke(Color.BLACK);
		Line carTwoLine = new Line(-30, 80, 360, 80);
		carOneLine.setStroke(Color.BLACK);
		Line carThreeLine = new Line(-30, 120, 360, 120);
		carOneLine.setStroke(Color.BLACK);
		Line carFourLine = new Line(-30, 160, 360, 160);
		carOneLine.setStroke(Color.BLACK);
		
		Shape racecar1 = racecar();
		Shape racecar2 = racecar();
		Shape racecar3 = racecar();
		Shape racecar4 = racecar();
		
		PathTransition pt1 = new PathTransition();
		pt1.setNode(racecar1);
	    pt1.setPath(carOneLine);
	    pt1.setCycleCount(Timeline.INDEFINITE);
	    pt1.play();
	     
		PathTransition pt2 = new PathTransition();
		pt2.setNode(racecar2);
	    pt2.setPath(carTwoLine);
	    pt2.setCycleCount(Timeline.INDEFINITE);
	    pt2.play();
	    
		PathTransition pt3 = new PathTransition();
		pt3.setNode(racecar3);
	    pt3.setPath(carThreeLine);
	    pt3.setCycleCount(Timeline.INDEFINITE);
	    pt3.play();
	    
		PathTransition pt4 = new PathTransition();
		pt4.setNode(racecar4);
	    pt4.setPath(carFourLine);
	    pt4.setCycleCount(Timeline.INDEFINITE);
	    pt4.play();
		
		TextField carOneSpeed = new TextField("1");
		Label lb1 = new Label("Car 1:");
		carOneSpeed.setPrefWidth(30);
		TextField carTwoSpeed = new TextField("1");
		carTwoSpeed.setPrefWidth(30);
		Label lb2 = new Label("Car 2:");
		TextField carThreeSpeed = new TextField("1");
		carThreeSpeed.setPrefWidth(30);
		Label lb3 = new Label("Car 3:");
		TextField carFourSpeed = new TextField("1");
		carFourSpeed.setPrefWidth(30);
		Label lb4 = new Label("Car 4:");
		
		
		carOneSpeed.setOnAction(e -> {
			if(Double.parseDouble(carOneSpeed.getText()) <= 100) {
				pt1.stop();
				pt1.setDuration(Duration.millis(Double.parseDouble(carOneSpeed.getText()) * 1000));
				pt1.setCycleCount(Timeline.INDEFINITE);
				pt1.play();
			}
		});
		
		carTwoSpeed.setOnAction(e -> {
			if(Double.parseDouble(carTwoSpeed.getText()) <= 100) {
				pt2.stop();
				pt2.setDuration(Duration.millis(Double.parseDouble(carTwoSpeed.getText()) * 1000));
				pt2.setCycleCount(Timeline.INDEFINITE);
				pt2.play();
			}
		});
		
		carThreeSpeed.setOnAction(e -> {
			if(Double.parseDouble(carThreeSpeed.getText()) <= 100) {
				pt3.stop();
				pt3.setDuration(Duration.millis(Double.parseDouble(carThreeSpeed.getText()) * 1000));
				pt3.setCycleCount(Timeline.INDEFINITE);
				pt3.play();
			}
		});
		
		carFourSpeed.setOnAction(e -> {
			if(Double.parseDouble(carFourSpeed.getText()) <= 100) {
				pt4.stop();
				pt4.setDuration(Duration.millis(Double.parseDouble(carFourSpeed.getText()) * 1000));
				pt4.setCycleCount(Timeline.INDEFINITE);
				pt4.play();
			}
		});
		
		pane.getChildren().addAll(carOneLine, carTwoLine, carThreeLine, carFourLine, racecar1, racecar2, racecar3, racecar4);
		HBox hbox = new HBox(10);
		hbox.getChildren().addAll(lb1, carOneSpeed, lb2, carTwoSpeed, lb3, carThreeSpeed, lb4, carFourSpeed);
		hbox.setAlignment(Pos.CENTER);
		
		borderpane.setTop(hbox);
		borderpane.setCenter(pane);
		Scene scene = new Scene(borderpane, 320, 220);
		primaryStage.setTitle("Race Cars");
		primaryStage.setScene(scene);
		primaryStage.show();
	}
	
	public Shape racecar() {
		
		Circle wheelOne = new Circle(40, 60, 5);
		Circle wheelTwo = new Circle(60, 60, 5);
		Rectangle body = new Rectangle(25, 45, 50, 10);
		Rectangle roof = new Rectangle(40, 35, 20, 10);
		
		Shape raceCar = Shape.union(Shape.union(wheelOne, wheelTwo), Rectangle.union (body, roof));
		
		return raceCar;
	}
}
