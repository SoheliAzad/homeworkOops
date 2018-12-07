package Abstraction;

public class TestOrganization {

	public static void main(String[] args) {
		
Organization organization = new GrameenPhone();
organization.structures();
organization.employees();
organization.roles();
organization.hierarchy();

GrameenPhone departments = new GrameenPhone();
departments.humanResourcesDept();


	NewBranchOffice newBranchOffice = new GrameenPhone();
	newBranchOffice.newDepartments();
	newBranchOffice.newEmployees();
	newBranchOffice.newStructures();
	newBranchOffice.newRules();
	}

}
