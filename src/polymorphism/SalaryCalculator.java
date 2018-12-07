package polymorphism;

public class SalaryCalculator {

	//to avoid overloading during compilation, parameter order and size are being kept different
	
public int totalAmountOfSalary(int netSalary, int benefit) {
		int total = netSalary + benefit;
		return total; }
	
	
public int totalAmountOfSalary(int netSalary, int benefit, int bonus) {
		int total = netSalary + benefit + bonus;
		return total;} 
		
public int totalAmountOfSalary(int netSalary, int benefit , int bonus , int commission) {
		int total = netSalary + benefit + bonus + commission;
		return total; }
			
public int totalAmountOfSalary(int netSalary, int benefit, int bonus, int commission, String appraisalOutcome) {
		int total = netSalary + benefit + bonus ;
		return total; }}


