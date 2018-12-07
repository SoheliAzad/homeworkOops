package polymorphism;

public class TestSalaryCalculator {

	public static void main(String[] args) {
		
		SalaryCalculator salcal = new SalaryCalculator();
		System.out.println(salcal.totalAmountOfSalary(3000, 2000));//passing two parameters
		System.out.println(salcal.totalAmountOfSalary(3000, 2000, 3000));//passing three parameters
	
	
	
		AppraisalCalculator ac = new AppraisalCalculator();
		ac.totalAmountOfSalary(3000, 2000, 3000);
		System.out.println("Appraisal Calculator: "+ac.totalAmountOfSalary(3000, 2000, 3000));}
	

}
