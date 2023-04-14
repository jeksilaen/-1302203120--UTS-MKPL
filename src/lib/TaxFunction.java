package lib;

public class TaxFunction {
	
	public static int calculateTax(Employment employment, Family family) {
		
		int tax = 0;
		final int deductibleA = 54000000;
		final int deductibleB = 4500000;
		final int deductibleC = 1500000;
		final double roundable = 0.05;
		
		if (numberOfMonthWorking > 12) {
			System.err.println("More than 12 month working per year");
		}
		
		if (numberOfChildren > 3) {
			numberOfChildren = 3;
		}
		
		if (isMarried) {
			tax = (int) Math.round(roundable * (((monthlySalary + otherMonthlyIncome) * numberOfMonthWorking) - deductible - (deductibleA + deductibleB + (numberOfChildren * deductibleC))));
		}else {
			tax = (int) Math.round(roundable * (((monthlySalary + otherMonthlyIncome) * numberOfMonthWorking) - deductible - deductibleA));
		}
		
		if (tax < 0) {
			return 0;
		}else {
			return tax;
		}
			 
	}
	
}
