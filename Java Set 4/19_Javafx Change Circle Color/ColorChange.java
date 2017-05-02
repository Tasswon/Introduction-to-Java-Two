/**Name: Joseph Tassone
 * Description: Allows the user to change the colour of a circle depending on what key is pushed
 */

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.input.KeyCode;
import javafx.scene.input.MouseButton;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class ColorChange extends Application{
	
	public static void main(String[] args) {
		Application.launch(args);
	}
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		
		Pane pane = new Pane();
		
		Circle circle = new Circle(100, 100, 80);
		circle.setStroke(Color.BLACK);
		
		
		circle.setOnMousePressed(e -> {
			circle.setFill(Color.WHITE);
			
			if(e.isAltDown()) {
				circle.setFill(Color.RED);
			}
			
			if(e.isControlDown()) {
				circle.setFill(Color.GREEN);
			}
			
			if(e.isShiftDown()) {
				circle.setFill(Color.BLUE);
			}	
	    });
		
		circle.setOnMouseReleased(e -> {
			circle.setFill(Color.BLACK);
		});
		
		pane.getChildren().add(circle);
		
		Scene scene = new Scene(pane, 200, 200);
		primaryStage.setTitle("Color Change");
		primaryStage.setScene(scene);
		primaryStage.show();
		
		circle.requestFocus();
	}
}
