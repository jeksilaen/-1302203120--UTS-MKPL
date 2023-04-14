package lib;

public class TaxFunction {
	final static int deductibleA = 54000000;
	final static int deductibleB = 4500000;
	final static int deductibleC = 1500000;
	final static double roundable = 0.05;

	public static int calculateTax(Employment employment, Family family, int numberOfMonthWorking) {
		
		int tax = 0;
		int numberOfChildren = family.getChildIdNumbers();
		boolean isMarried = family.getSpouseIdNumber() == "";
		
		if (numberOfMonthWorking > 12) {
			System.err.println("More than 12 month working per year");
		}
		if (numberOfChildren > 3) {
			numberOfChildren = 3;
		}
	
		
		if (isMarried) {
			tax = (int) Math.round(roundable * (((employment.getMonthlySalary() + employment.getOtherMonthlyIncome()) * numberOfMonthWorking) - employment.getAnnualDeductible() - (deductibleA + deductibleB + (numberOfChildren * deductibleC))));
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
