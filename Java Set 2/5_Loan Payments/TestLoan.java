/**Name: Joseph Tassone
 * Course: COSC1047
 * Date: June 7, 2016
 * Description: Test the loan class and ensures the error finding works
 */

public class TestLoan {
	public static void main(String args []) {
		
		//Creates a new loan
		Loan loan = new Loan();
		
		//Sets loan variables
		loan.setAnnualInterestRate(0.05);
		loan.setNumberOfYears(1);
		loan.setLoanAmount(9);
		
		//If nothing is caught than loan payment processes
		System.out.print(loan.getMonthlyPayment());
	}
}
