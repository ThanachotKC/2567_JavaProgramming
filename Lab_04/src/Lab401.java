
import javax.swing.*;
public class Lab401 {
 
	public static void main(String[] args) {
		inputEmail();
	}
	
	public static void inputEmail() {
		String ans;
		String varEmail;
		do {
			varEmail = JOptionPane.showInputDialog("Input your e-mail: ");
			if(varEmail != null && !varEmail.isEmpty()) {
				checkEmailError(varEmail);
			}else {
				JOptionPane.showMessageDialog(null, "E-mail cannot be empty!!!");
			}
			ans =JOptionPane.showInputDialog("Do you want to input email address[Y/y]");
		}while(ans !=null && ans.equalsIgnoreCase("y"));
	}
	public static void checkEmailError(String email) {
		while(email.startsWith("@")||email.contains(" ")) {
			email = JOptionPane.showInputDialog("Invaild e-mail. Input your e-mail, again: ");
 
		}
		email =email.toLowerCase();
		JOptionPane.showMessageDialog(null, checkEmail(email)?"Your e-mail is "+email
				:"Your e-mail is not a hotmail or gmail." );
	}
	public static boolean checkEmail(String email) {
		
		return email.endsWith("@gmail.com")||email.endsWith("hotmail.com");
		
	}
 
}