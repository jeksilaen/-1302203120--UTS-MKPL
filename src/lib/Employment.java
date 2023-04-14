package lib;

import java.time.LocalDate;

public class Employment {
    private LocalDate joinedDate;
	private int monthlySalary;
	private int otherMonthlyIncome;
	private int annualDeductible;

    public Employment(LocalDate joinedDate, int monthlySalary, int otherMonthlyIncome, int annualDeductible){
        this.joinedDate = joinedDate;
        this.monthlySalary = monthlySalary;
        this.otherMonthlyIncome = otherMonthlyIncome;
        this.annualDeductible = annualDeductible;
    }

    public int getYear() {
        return joinedDate.getYear();
    }

    public int getMonth() {
        return joinedDate.getMonthValue();
    }

    public int getMonthlySalary() {
        return monthlySalary;
    }

    public int getOtherMonthlyIncome() {
        return otherMonthlyIncome;
    }

    public int getAnnualDeductible() {
        return annualDeductible;
    }

}
