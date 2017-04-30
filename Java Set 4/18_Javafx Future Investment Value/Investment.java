/**Name: Joseph Tassone
 * Course: COSC1047
 * Date: June 15, 2016
 * Description: Investment class used for determining the future value on an investment
 */

public class Investment {
	private double investmentAmount;
	private int numberOfYears;
	private double annualInterestRate;

	public Investment() {
		this(0.0, 0, 0.0);
	}

	public Investment(double investmentAmount, int numberOfYears, double annualInterestRate) {
		this.investmentAmount = investmentAmount;
		this.numberOfYears = numberOfYears;
		this.annualInterestRate = annualInterestRate;
	}

	public double getIvestmentAmount() {
		return investmentAmount;
	}

	public void setIvestmentAmount(double ivestmentAmount) {
		this.investmentAmount = ivestmentAmount;
	}

	public int getNumberOfYears() {
		return numberOfYears;
	}

	public void setNumberOfYears(int numberOfYears) {
		this.numberOfYears = numberOfYears;
	}

	public double getAnnualInterestRate() {
		return annualInterestRate;
	}

	public void setAnnualInterestRate(double annualInterestRate) {
		this.annualInterestRate = annualInterestRate;
	}
	
	public double getfutureValue() {
		double monthlyInterestRate = (annualInterestRate / 12) / 100;
		double futureValue = investmentAmount * (Math.pow((1 + monthlyInterestRate) , (numberOfYears * 12)));
		
		return futureValue;
	}
}