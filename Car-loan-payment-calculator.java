// This program calculates a car payment monthly with interest.

public class CarLoan {

	public static void main(String[] args) {
    int carLoan = 10000;
    // loan length in years
    int loanLength = 3;
    // interest rate
    int interestRate = 5;
    // downpayment
    int downPayment = 2000;


    if (loanLength <= 0 || interestRate <= 0) {
      System.out.println("Error! You must take out a valid car loan.");
    } else if (downPayment >= carLoan) {
      System.out.println("The car can be paid in full.");
    } else {
      int remainingBalance = carLoan - downPayment;
      // we need the monthly payment
      int months = loanLength * 12;
      // This represents the monthly payment without interest included
      int monthlyBalance = remainingBalance / months;
      // But we need to pay for interest
      int interest = (monthlyBalance*interestRate) / 100;
      int monthlyPayment = monthlyBalance + interest;
      System.out.println(monthlyPayment);


    }

	}
}
