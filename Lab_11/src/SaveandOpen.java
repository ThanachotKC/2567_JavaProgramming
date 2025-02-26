import java.io.*;
import java.util.*;
public class SaveandOpen extends Employee{
	
	private String name;
	private String dept;
	
	public void insert() throws IOException{
		Scanner input = new Scanner(System.in);
		PrintStream writeFile = new PrintStream(new File("src//txtFile//employee.txt"));
		String answer;
		do {
			super.header();
			System.out.print("Enter name: ");
			name = input.next();
			System.out.print("Enter dapartment: ");
			dept = input.next();
			writeFile.println(name+"\t"+dept);
			System.out.print("Do yo want to input data again? : ");
			answer = input.next();
		}while(answer.equalsIgnoreCase("y"));
	}
	public void searchData() {
		try {
			Scanner readFile = new Scanner(new File("src//txtFile//employee.txt"));
			int i=0;
			boolean check = false;
			super.header();
			while(readFile.hasNext()) {
				name = readFile.next();
				dept = readFile.next();
				
			}
		}catch(IOException e) {
			System.out.print("\nSorry, file not found");
		}
	}
}
