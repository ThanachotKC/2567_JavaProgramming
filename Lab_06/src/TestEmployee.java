
public class TestEmployee {

	public static void main(String[] args) {
		Employee emp1 = new Employee();
		Employee emp2 = new Employee();
		
		emp1.setEmployeeDetails("Thanachot", 168, 60.0);
		emp2.setEmployeeDetails("Weerawich", 198, 65.0);
		
		System.out.println("Employee 1 Details");
		emp1.displayEmployeeDetails();
		
		System.out.println("\nEmployee 2 Details");
		emp2.displayEmployeeDetails();
		
		

	}

}
