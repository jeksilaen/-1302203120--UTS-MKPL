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
}
