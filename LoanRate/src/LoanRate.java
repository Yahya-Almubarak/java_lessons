
public class LoanRate {

	public static void main(String[] args) {
		double initialPrincipal = 100000;
		double annualInterestRate = 0.05;
		int numberOfYears = 10;
		int periodsPerYear = 12;
		double interestRatePerPeriod = interestRatePerPeriod(annualInterestRate, periodsPerYear);
		int numberOfPayments = numberOfYears * periodsPerYear;
		double paymentAmount = paymentPerPeriod(initialPrincipal, interestRatePerPeriod, numberOfPayments);
		System.out.println(paymentAmount);
		double[] perInterest = new double[numberOfPayments];
		double[] perPrincipal = new double[numberOfPayments];
		double[] balance = new double[numberOfPayments];
		amortizationSchedule(numberOfPayments, periodsPerYear, initialPrincipal, annualInterestRate, perInterest, perPrincipal, balance);

	}
	
	
	public static double amortizationSchedule(int numberOfPayments, int periodsPerYear, double initialPrincipal, double annualInterestRate,
			double[] perInterest, double[] perPrincipal, double[] balance) {
		double interestRatePerPeriod = interestRatePerPeriod(annualInterestRate, periodsPerYear);
		double paymentAmount = paymentPerPeriod(initialPrincipal, interestRatePerPeriod, numberOfPayments);
		double tempBalance = initialPrincipal;
		for(int k = 0; k < numberOfPayments; k++) {
			perInterest[k] = interest(tempBalance, interestRatePerPeriod);
			perPrincipal[k] = paymentAmount - perInterest[k];
			tempBalance -= perPrincipal[k];
			balance[k] = tempBalance;
		System.out.println(k + "   " + paymentAmount + "   " + perInterest[k] + "   " + perPrincipal[k] + "  " + balance[k]);
		}
		return paymentAmount;
	}
	
	public static double paymentPerPeriod(double initialPrincipal, double interestRatePerPeriod, int numberOfPayments) {
		double p = initialPrincipal;
		double r = interestRatePerPeriod;
		int n = numberOfPayments;
		double a = p * (r * Math.pow((1 + r),  n)) / (Math.pow((1 + r), n) - 1);
		return a;
		
	}
	
	public static double interestRatePerPeriod(double annualInterest, int periodsPerYear) {
		double r = annualInterest / periodsPerYear;
		return r;
	}
	
	public static double interest(double principal, double interestRate) {
		double interest = principal * interestRate;
		return interest;
	}

}
