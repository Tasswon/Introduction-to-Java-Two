/**Name: Joseph Tassone
 * Description: Allows one to convert between binary, hexadecimal, and decimal values
 */


import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyCode;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class ConvertNumbers extends Application{
	
	public static void main(String[] args) {
		Application.launch(args);
	}
	
	public void start(Stage primaryStage) {
		
		TextField tfDecimal = new TextField();
		TextField tfHex = new TextField();
		TextField tfBinary = new TextField();
		
		GridPane gridPane = new GridPane();
		gridPane.setHgap(5);
		gridPane.setVgap(5);
		gridPane.add(new Label("Decimal:"), 0, 0);
		gridPane.add(tfDecimal, 1, 0);
		gridPane.add(new Label("Hex:"), 0, 1);
		gridPane.add(tfHex, 1, 1);
		gridPane.add(new Label("Binary:"), 0, 2);
		gridPane.add(tfBinary , 1, 2);
		gridPane.setPadding(new Insets(10));
		
		tfDecimal.setOnKeyPressed(e -> {
			if (e.getCode() == KeyCode.ENTER) {
				tfHex.setText(Integer.toHexString(Integer.parseInt(tfDecimal.getText())));
				tfBinary.setText(Integer.toBinaryString(Integer.parseInt(tfDecimal.getText())));
			}
		});
		
		tfHex.setOnKeyPressed(e -> {
			if (e.getCode() == KeyCode.ENTER) {
				tfDecimal.setText(String.valueOf(Integer.parseInt(tfHex.getText(), 16)));
				tfBinary.setText(Integer.toBinaryString(Integer.parseInt(tfHex.getText(), 16)));
			}
		});

		tfBinary.setOnKeyPressed(e -> {
			if (e.getCode() == KeyCode.ENTER) {
				tfDecimal.setText(String.valueOf(Integer.parseInt(tfBinary.getText(), 2)));
				tfHex.setText(Integer.toHexString(Integer.parseInt(tfBinary.getText(), 2)));
			}
		});
		
		 
		Scene scene = new Scene(gridPane, 250, 100);
		primaryStage.setTitle("Convert Numbers");
		primaryStage.setScene(scene);
		primaryStage.show();
	}
}
