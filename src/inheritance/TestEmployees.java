package inheritance;

public class TestEmployees {

	public static void main(String[] args) {
		Managers manager1 = new Managers();
		manager1.responsibilities();
		manager1.authority();
		manager1.shareHolders();
	
	Officers officer1 = new Officers();
	officer1.performance();
	officer1.responsibilities();
	officer1.authority();
	officer1.shareHolders();
	System.out.println("officers also get benefited from the aobve");
	
	}

}
