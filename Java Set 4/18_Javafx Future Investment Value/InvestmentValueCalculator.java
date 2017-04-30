/**Name: Joseph Tassone
 * Course: COSC1047
 * Date: June 15, 2016
 * Description: Implements the investment class to determine the future value
 */

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.geometry.HPos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class InvestmentValueCalculator extends Application {
	private TextField tfInvestmentAmount = new TextField();
	private TextField tfNumberOfYears = new TextField();
	private TextField tfAnnualInterestRate = new TextField();
	private TextField tfFutureValue = new TextField();
	private Button btCalculate = new Button("Calculate");

	@Override // Override the start method in the Application class
	public void start(Stage primaryStage) {
		// Create UI
		GridPane gridPane = new GridPane();
		gridPane.setHgap(5);
		gridPane.setVgap(5);
		gridPane.add(new Label("Investement Amount:"), 0, 0);
		gridPane.add(tfInvestmentAmount, 1, 0);
		gridPane.add(new Label("Number of Years:"), 0, 1);
		gridPane.add(tfNumberOfYears, 1, 1);
		gridPane.add(new Label("Annual Interest Rate:"), 0, 2);
		gridPane.add(tfAnnualInterestRate , 1, 2);
		gridPane.add(new Label("Future Value:"), 0, 3);
		gridPane.add(tfFutureValue , 1, 3);
		gridPane.add(btCalculate, 1, 5);

		// Set properties for UI
		gridPane.setAlignment(Pos.CENTER);
		tfInvestmentAmount.setAlignment(Pos.BOTTOM_RIGHT);
		tfNumberOfYears.setAlignment(Pos.BOTTOM_RIGHT);
		tfAnnualInterestRate.setAlignment(Pos.BOTTOM_RIGHT);
		tfFutureValue.setAlignment(Pos.BOTTOM_RIGHT);
		tfFutureValue.setEditable(false);
		GridPane.setHalignment(btCalculate, HPos.RIGHT);

		// Process events
		btCalculate.setOnAction(e -> calculateFutureValue());

		// Create a scene and place it in the stage
		Scene scene = new Scene(gridPane, 400, 250);
		primaryStage.setTitle("Investement Calculator"); // Set title
		primaryStage.setScene(scene); // Place the scene in the stage
		primaryStage.show(); // Display the stage
	}

	private void calculateFutureValue() {
		// Get values from text fields
		double investment =
				Double.parseDouble(tfInvestmentAmount.getText());
		int year = Integer.parseInt(tfNumberOfYears.getText());
		double interest =
				Double.parseDouble(tfAnnualInterestRate.getText());

		// Create a loan object. Loan defined in Listing 10.2
		Investment investmentCalculate = new Investment(investment, year, interest);

		// Display monthly payment and total payment
		tfFutureValue.setText(String.format("$%.2f",
				investmentCalculate.getfutureValue()));
	}
	
	public static void main(String[] args) {
		Application.launch(args);
	}
}