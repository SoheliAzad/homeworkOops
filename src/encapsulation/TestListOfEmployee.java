package encapsulation;

public class TestListOfEmployee {

	public static void main(String[] args) {//setting method
		ListOfEmployee emp1 = new ListOfEmployee();
				emp1.setEmpId(101);
				emp1.setEmpName("Smith");
				emp1.setDepartmentName("Human Resources");
				emp1.setGender('M');
				emp1.setUsCitizen(true);
				
				//getting result
				System.out.println(emp1.getEmpId()+ "  "+emp1.getEmpName()+ "  "+emp1.getDepartmentName()+ " "+emp1.getGender()+ " "+emp1.isUsCitizen());
				
				
		ListOfEmployee emp2 = new ListOfEmployee();//setting method
				emp2.setEmpId(102);
				emp2.setEmpName("Joanna");
				emp2.setDepartmentName("IT");
				emp2.setGender('F');
				emp2.setUsCitizen(true);		
				
				//getting result
				System.out.println(emp2.getEmpId()+ " "+emp2.getEmpName()+ " "+ emp2.getDepartmentName()+ " "+emp2.getGender()+ " "+emp2.isUsCitizen());

		ListOfEmployee emp3 = new ListOfEmployee();//setting method
				emp3.setEmpId(103);
				emp3.setEmpName("Rick");
				emp3.setDepartmentName("Accounting");
				emp3.setGender('M');
				emp3.setUsCitizen(true);
				
				//getting result
				System.out.println(emp3.getEmpId()+ " "+emp3.getEmpName()+ " "+emp3.getDepartmentName()+ " "+emp3.getGender()+ " "+emp3.isUsCitizen());
			
	

		ListOfEmployee emp4 = new ListOfEmployee(104, "Bella", "Communications", 'F', true);
		System.out.println(emp4.getEmpId()+ " "+emp4.getEmpName()+ " "+emp4.getDepartmentName()+ " "+emp4.getGender()+ " "+emp4.isUsCitizen());
	}
}
