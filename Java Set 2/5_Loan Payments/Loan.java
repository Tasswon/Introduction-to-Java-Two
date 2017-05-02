/**Name: Joseph Tassone
 * Description: Allows user to calculate payments on a loan and test in a separate class
 */

public class Loan {
	private double annualInterestRate;
	private int numberOfYears;
	private double loanAmount;
	private java.util.Date loanDate;

	/** Default constructor */
	public Loan() {
		this(2.5, 1, 1000);
	}

	/** Construct a loan with specified annual interest rate,
	number of years, and loan amount
	 */
	public Loan(double annualInterestRate, int numberOfYears, double loanAmount) {
		this.annualInterestRate = annualInterestRate;
		this.numberOfYears = numberOfYears;
		this.loanAmount = loanAmount;
		loanDate = new java.util.Date();
	}

	/** Return annualInterestRate */
	public double getAnnualInterestRate() {
		return annualInterestRate;
	}

	/** Set a new annualInterestRate */
	//Included throw to ensure user enters an interest rate greater than or equal to 5%
	public void setAnnualInterestRate(double annualInterestRate) throws IllegalArgumentException {
			if (annualInterestRate >= 0.05) {
				this.annualInterestRate = annualInterestRate;
			}
			else {
				throw new IllegalArgumentException(
						"Annual Interest Rate cannot be less than 5%");
			}
	}

	/** Return numberOfYears */
	public int getNumberOfYears() {
		return numberOfYears;
	}
	
	/** Set a new numberOfYears */
	//Included throw to ensure user enters number of years greater than 0
	public void setNumberOfYears(int numberOfYears) throws IllegalArgumentException {
		if (numberOfYears > 0) {
			this.numberOfYears = numberOfYears;
		}
		else {
			throw new IllegalArgumentException(
					"Number of Years cannot be less than or equal to zero");
		}
	}
	
	/** Return loanAmount */
	public double getLoanAmount() {
		return loanAmount;
	}

	/** Set a new loanAmount */
	//Included throw to ensure user enters a loan amount greater than or equal to 10
	public void setLoanAmount(double loanAmount) throws IllegalArgumentException {
			if(loanAmount >= 10) {
				this.loanAmount = loanAmount;
			}
			else {
				throw new IllegalArgumentException(
						"Loan Amount cannot be less than 10");
			}
	}
	
	/** Find monthly payment */
	public double getMonthlyPayment() {
		double monthlyInterestRate = annualInterestRate / 1200;
		double monthlyPayment = loanAmount * monthlyInterestRate / (1 - (1 / Math.pow(1 + monthlyInterestRate, numberOfYears * 12)));
		return monthlyPayment;
	}
	
	/** Find total payment */
	public double getTotalPayment() {
		double totalPayment = getMonthlyPayment() * numberOfYears * 12;
		return totalPayment;
	}
	
	/** Return loan date */
	public java.util.Date getLoanDate() {
		return loanDate;
	}
}