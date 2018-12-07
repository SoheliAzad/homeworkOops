package encapsulation;

public class ListOfEmployee {

	private int empId; //private variables
	private String empName;
	private String departmentName;
	private char gender;
	private boolean usCitizen;
	
	
	public ListOfEmployee() {//declaration of default constructor
		
	}
	
	public ListOfEmployee(int empId, String empName, String departmentName, char gender, boolean usCitizen) {//constructor
	
		this.empId = empId;
		this.empName = empName;
		this.departmentName = departmentName;
		this.gender = gender;
		this.usCitizen = usCitizen;
		
	
	}
	
	//declaring getter and setter method to get public access of private variables
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getDepartmentName() {
		return departmentName;
	}
	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}
	public char getGender() {
		return gender;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	public boolean isUsCitizen() {
		return usCitizen;
	}
	public void setUsCitizen(boolean usCitizen) {
		this.usCitizen = usCitizen;
	}
	

}
