package polymorphism;

//introduction of new class SalaryCalculator to show overriding

public class AppraisalCalculator extends SalaryCalculator{
	
	//modifying SalaryCalculator method in AppraisalCalculator class to avoid over riding
	public int totalAmountOfSalary(int netSalary, int benefit, int bonus) {
		int total = netSalary + benefit + bonus -1000;
		return total;} 

}
