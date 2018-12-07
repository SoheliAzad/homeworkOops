package Abstraction;

public class GrameenPhone extends NewBranchOffice implements Organization {
	
	public void structures() {//methods from interface
	System.out.println("An organization must have a structure");
	
	}
	public void employees() {//methods from interface
	System.out.println("An organization to start with must also have employees");
		
	}
	public void roles() {//methods from interface
	System.out.println("employees should have definite roles to perform");
		
	}
	public void hierarchy()//methods from interface
	{	System.out.println("An organization also has either a flat or tall hierarchy");
	}
		

	public void humanResourcesDept() {//introducing method from GrameenPhone class
	System.out.println("Human Resource Department helps to recruit employees");
	}
	
	public void newDepartments() {//abstract method from abstract class that we need to implement in concrete class
		System.out.println("new departments needs to set up for new branch office");}
	
	public void newRules() {
		System.out.println("new rules are in place");}
	}
	





