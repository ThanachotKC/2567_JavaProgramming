public class Teststudent {
	public static void main(String[] args) {
		// Create two Student objects
		student student1 = new student();
		student student2 = new student();
		
		//Set student details
		student1.setStudentDetails("Siriyakorn", new double[] {85.0,78.0,92.0});
		student2.setStudentDetails("Sumsoo", new double[] {68.0,66.5});
		
		//Display student details
		System.out.println("Student 1 details:");
		student1.displayStudentDetails();
		System.out.println("\nStudent 2 details:");
		student2.displayStudentDetails();
	}
}