/**Name: Joseph Tassone
 * Description: Creates a circle that can be moved around the pane and have it's colour changed
 */

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class MoveTheBall extends Application {
  @Override
  // Override the start method in the Application class
  public void start(Stage primaryStage) {
	
	 
	Pane pane = new Pane();
	HBox hBox = new HBox();
	HBox hBox2 = new HBox();
	VBox buttons = new VBox();
	BorderPane borderpane = new BorderPane();
	
	
	Circle circle = new Circle(40, 50, 20);
	circle.setFill(Color.RED);
	
	Button left = new Button("Left");
	left.setOnAction(e -> {
		double centerX = circle.getCenterX();
		if(centerX >= (0 + 25)) {
			circle.setCenterX(centerX - 5);
		}
    });
	
	Button up = new Button("Up");
	up.setOnAction(e -> {
		double centerY = circle.getCenterY();
		if(centerY >= (0 + 25)) {
			circle.setCenterY(centerY - 5);
		}
	});

	Button down = new Button("Down");
	down.setOnAction(e -> {
		double centerY = circle.getCenterY();
		if(centerY <= (pane.getHeight() - 25)) {
			circle.setCenterY(centerY + 5);
		}
    });
	
	Button right = new Button("Right");
	right.setOnAction(e -> {
		double centerX = circle.getCenterX();
		if(centerX <= pane.getWidth() - 25) {
			circle.setCenterX(centerX + 5);	
		}
    });
	
	Button red = new Button("Red");
	red.setOnAction(e -> {
			circle.setFill(Color.RED);
    });
	
	Button green = new Button("Green");
	green.setOnAction(e -> {
		circle.setFill(Color.GREEN);
    });
	
	Button blue = new Button("Blue");
	blue.setOnAction(e -> {
		circle.setFill(Color.BLUE);
    });
	
	Button purple = new Button("Purple");
	purple.setOnAction(e -> {
		circle.setFill(Color.PURPLE);
    });
	
	
    pane.getChildren().add(circle);
    
	hBox.getChildren().addAll(left, up, down, right);
	hBox.setAlignment(Pos.TOP_CENTER);
	hBox2.getChildren().addAll(red, blue, green, purple);
	hBox2.setAlignment(Pos.BOTTOM_CENTER);
	
	buttons.getChildren().addAll(hBox, hBox2);
    
	borderpane.setCenter(pane);
	borderpane.setBottom(buttons);
	
	Scene scene = new Scene(borderpane, 200, 200);
	primaryStage.setTitle("Move Circle");
	primaryStage.setScene(scene);
	primaryStage.show();
  }
  
  public static void main(String[] args) {
    launch(args);
  }
} 
