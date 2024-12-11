import java.util.*;
public class Lab_SecurePasswordChecker {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		while(true) {
			System.out.print("Enter your password (type 'exit' to quit) : ");
			String password = scan.nextLine();
			
			if(password.equalsIgnoreCase("exit")) {
				System.out.println("Program terminated.");
				break;
			}
			String errors="";
			if(password.length()<8) {
				errors += " password must be al least 8 character long.\n ";
			}
			boolean hasUpper = false ;
			boolean hasLower = false ;
			boolean hasDigit = false ; 
			
			for(int i=0;i<password.length();i++) {
				char ch = password.charAt(i);
				if(ch >='A' && ch<='Z') {
					hasUpper = true;
				}else if (ch >='a' && ch<='z') {
					hasLower = true;
				}else if (ch >='0' && ch<='9') {
					hasDigit = true;
			}
		}
			if(!hasUpper)
			{
				errors += "- password must contain at lease one Upper letter(A-Z).\n";
			}
			if(!hasLower)
			{
				errors += "- password must contain at lease one Lower letter(A-Z).\n";
			}
			if(!hasDigit)
			{
				errors += "- password must contain at lease one Digit letter(A-Z).\n";
			}
			if(errors.isEmpty())
			{
				System.out.print("Your passeord is secure");
				break;
			}
			else
			{
				System.out.println("Passeord Validation error.");
				System.out.println(errors);
			}
			
	
		}
		scan.close();
	}
	
}


