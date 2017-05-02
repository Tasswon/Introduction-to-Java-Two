/**Name: Joseph Tassone
 * Description: Creates an interactive display where one can resize two rectangles, determine
 * their coordinates, and whether they intersect
 */

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ContentDisplay;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyCode;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class TwoRectanglesIntersect extends Application{
	
	public static void main(String[] args) {
		Application.launch(args);
	}
	
	public void start(Stage primaryStage) {
		
		BorderPane panePrime = new BorderPane();
		HBox hbox = new HBox(5);
		GridPane r1Info = new GridPane();
		GridPane r2Info = new GridPane();
		
		//Everything relating to Rectangle 1 GridPane
		Text textR1Info = new Text("Enter rectangle 1 info:");
		Text textR1X = new Text("X:");
		Text textR1Y = new Text("Y:");
		Text textR1Width = new Text("Width:");
		Text textR1Height = new Text("Height:");
		
		TextField r1X = new TextField();
		r1X.setMaxWidth(40);
		TextField r1Y = new TextField();
		r1Y.setMaxWidth(40);
		TextField r1Width = new TextField();
		r1Width.setMaxWidth(40);
		TextField r1Height = new TextField();
		r1Height.setMaxWidth(40);
		
		r1Info.getChildren().addAll(textR1Info, textR1X, textR1Y, textR1Width, textR1Height, r1X, r1Y, r1Width, r1Height);
		r1Info.getColumnConstraints().add(new ColumnConstraints(40));
		r1Info.setConstraints(textR1Info, 0, 1);
		r1Info.setConstraints(textR1X, 0, 2);
		r1Info.setConstraints(textR1Y, 0, 3);
		r1Info.setConstraints(textR1Width, 0, 4);
		r1Info.setConstraints(textR1Height, 0, 5);
		r1Info.setConstraints(r1X, 1, 2);
		r1Info.setConstraints(r1Y, 1, 3);
		r1Info.setConstraints(r1Width, 1, 4);
		r1Info.setConstraints(r1Height, 1, 5);
		
		r1Info.setPrefWidth(125);
		r1Info.setPadding(new Insets(5));
		r1Info.setStyle("-fx-background-color : white;" + "-fx-border-color: black;");
		
		//Everything relating to Rectangle 2 GridPane
		Text textR2Info = new Text("Enter rectangle 2 info:");
		Text textR2X = new Text("X:");
		Text textR2Y = new Text("Y:");
		Text textR2Width = new Text("Width:");
		Text textR2Height = new Text("Height:");
		
		TextField r2X = new TextField();
		r2X.setMaxWidth(40);
		TextField r2Y = new TextField();
		r2Y.setMaxWidth(40);
		TextField r2Width = new TextField();
		r2Width.setMaxWidth(40);
		TextField r2Height = new TextField();
		r2Height.setMaxWidth(40);
		
		r2Info.getChildren().addAll(textR2Info, textR2X, textR2Y, textR2Width, textR2Height, r2X, r2Y, r2Width, r2Height);
		r2Info.getColumnConstraints().add(new ColumnConstraints(40));
		r2Info.setConstraints(textR2Info, 0, 1);
		r2Info.setConstraints(textR2X, 0, 2);
		r2Info.setConstraints(textR2Y, 0, 3);
		r2Info.setConstraints(textR2Width, 0, 4);
		r2Info.setConstraints(textR2Height, 0, 5);
		r2Info.setConstraints(r2X, 1, 2);
		r2Info.setConstraints(r2Y, 1, 3);
		r2Info.setConstraints(r2Width, 1, 4);
		r2Info.setConstraints(r2Height, 1, 5);
		
		r2Info.setPrefWidth(125);
		r2Info.setPadding(new Insets(5));
		r2Info.setStyle("-fx-background-color : white;" + "-fx-border-color: black;");
		
		//Button used to reshape rectangles
		StackPane buttonHolder = new StackPane();
		VBox vboxOmega = new VBox(10);
		Button button = new Button("Reshape Rectangles");
		
		//Rectangles created here and Intersection Texts
		Pane rectangleArea = new Pane();
		rectangleArea.setStyle("-fx-background-color : white;");
		
		Rectangle r1 = new Rectangle(20, 20, 20, 20);
		r1.setFill(Color.TRANSPARENT);
		r1.setStroke(Color.BLACK);
		
		Rectangle r2 = new Rectangle(100, 100, 20, 20);
		r2.setFill(Color.TRANSPARENT);
		r2.setStroke(Color.BLACK);
		
		StackPane intersection = new StackPane();
		Text yes = new Text("Two rectangles intersect? Yes");
		Text no = new Text("Two rectangles intersect? No");
		
		//Where all the Magic Happens
		r1X.setText(Double.toString(r1.getX())); //Shows all r1 info at start
		r1Y.setText(Double.toString(r1.getY()));
		r1Width.setText(Double.toString(r1.getWidth()));
		r1Height.setText(Double.toString(r1.getHeight()));
		
		r2X.setText(Double.toString(r2.getX())); //Shows all r2 info at start
		r2Y.setText(Double.toString(r2.getY()));
		r2Width.setText(Double.toString(r2.getWidth()));
		r2Height.setText(Double.toString(r2.getHeight()));
		
		if (r1.intersects(r2.getX(), r2.getY(), r2.getHeight(), r2.getWidth())) {
			intersection.getChildren().add(yes);
		}
		else {
			intersection.getChildren().add(no);
		}
		
		r1.setOnMouseDragged(e -> { //Moves r1 on mouse drag
			r1.setX(e.getX());
			r1.setY(e.getY());
			
			r1X.setText(Double.toString(r1.getX()));
			r1Y.setText(Double.toString(r1.getY()));
			r1Width.setText(Double.toString(r1.getWidth()));
			r1Height.setText(Double.toString(r1.getHeight()));
			
			if (r1.intersects(r2.getX(), r2.getY(), r2.getHeight(), r2.getWidth())) {
				intersection.getChildren().clear();
				intersection.getChildren().add(yes);
			}
			else {
				intersection.getChildren().clear();
				intersection.getChildren().add(no);
			}
		});
		
		r2.setOnMouseDragged(e -> { //Moves r2 on mouse drag
			r2.setX(e.getX());
			r2.setY(e.getY());
			
			r2X.setText(Double.toString(r2.getX()));
			r2Y.setText(Double.toString(r2.getY()));
			r2Width.setText(Double.toString(r2.getWidth()));
			r2Height.setText(Double.toString(r2.getHeight()));
			
			if (r1.intersects(r2.getX(), r2.getY(), r2.getHeight(), r2.getWidth())) {
				intersection.getChildren().clear();
				intersection.getChildren().add(yes);
			}
			else {
				intersection.getChildren().clear();
				intersection.getChildren().add(no);
			}
		});
		
		button.setOnAction(e -> { //Changes both r1 and r2 when button is pushed
			r1.setX(Double.parseDouble(r1X.getText()));
			r1.setY(Double.parseDouble(r1Y.getText()));
			r1.setWidth(Double.parseDouble(r1Width.getText()));
			r1.setHeight(Double.parseDouble(r1Height.getText()));
			r2.setX(Double.parseDouble(r2X.getText()));
			r2.setY(Double.parseDouble(r2Y.getText()));
			r2.setWidth(Double.parseDouble(r2Width.getText()));
			r2.setHeight(Double.parseDouble(r2Height.getText()));
			
			if (r1.intersects(r2.getX(), r2.getY(), r2.getHeight(), r2.getWidth())) {
				intersection.getChildren().clear();
				intersection.getChildren().add(no);
			}
			else {
				intersection.getChildren().clear();
				intersection.getChildren().add(yes);
			}
		});
		
		//Joins all the panes together
		rectangleArea.getChildren().addAll(r1, r2);
		hbox.getChildren().addAll(r1Info, r2Info);
		hbox.setAlignment(Pos.CENTER);
		hbox.setPadding(new Insets(10));
		buttonHolder.getChildren().add(button);
		vboxOmega.getChildren().addAll(hbox, buttonHolder);
		panePrime.setBottom(vboxOmega);
		panePrime.setCenter(rectangleArea);
		panePrime.setTop(intersection);
		
		Scene scene = new Scene(panePrime, 300, 350);
		primaryStage.setTitle("Intersecting Rectangles");
		primaryStage.setScene(scene);
		primaryStage.show();
	}
}
