import java.util.*;
public class LabSheet_203 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		 final double COMMISSION_RATE = 0.15;
		 final int SENTINEL = -1; // Terminating value for input
		 final double BASE_SALARY = 1000.0;
		 int sales; // Input gross sales
		 double salary; // Salary to be computed
		   
		 while(true) {
			 System.out.print("Enter gross Sales for the salesperson(or -1 to end): ");
			 sales = input.nextInt();
			 if (sales==SENTINEL) {
					 break;
			 }
			 salary = BASE_SALARY + (sales * COMMISSION_RATE);
			 
			 System.out.printf("The salesperson's salary is : $%.2f%n%n",salary);
		 }
		 	System.out.println("BYE BYE");
		 
		 input.close();
	}

}
