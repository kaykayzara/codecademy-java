/*
Project: Car Loan Payment Calculator (Codecademy – Learn Java)

Summary:
- Calculate the monthly car payment for a loan based on user inputs.
- Takes into account loan amount, interest rate, loan length, and down payment.
- Combines conditionals, Boolean expressions, and arithmetic operations.
- Demonstrates real-world financial calculation using Java fundamentals.

Inputs:
- Car loan amount (double)
- Interest rate of the loan (double, as percentage)
- Length of the loan in years (int)
- Down payment (double)

Concepts practiced:
- Conditional statements (if/else logic)
- Boolean expressions for validation
- Arithmetic expressions and order of operations
- Variable declarations and assignments
- Data types (int, double)
- Console output formatting
- Real-world math: loan payment formula

Run:
javac CarLoanCalculator.java
java CarLoanCalculator
*/

public class CarLoan {
	public static void main(String[] args) {
        int carLoan = 10000;
        int loanLength = 3;
        int interestRate = 5;
        int downPayment = 2000;

        if (loanLength <= 0 || interestRate <= 0) {
        System.out.println("Error! You must take out a valid car loan.");
        } else if (downPayment >= carLoan) {
            System.out.println("The car can be paid in full.");
        } else {
            int remainingBalance = carLoan - downPayment;
            int months = loanLength * 12;
            int monthlyBalance = remainingBalance / months;
            int interest = (monthlyBalance * interestRate) / 100;
            int monthlyPayment = monthlyBalance + interest;
            System.out.println(monthlyPayment);
        }
	}
}