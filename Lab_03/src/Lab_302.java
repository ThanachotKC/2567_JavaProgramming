import javax.swing.*;
public class Lab_302 {

	public static void main(String[] args) {
		String inputEmail = JOptionPane.showInputDialog(" Input your e-mail : ");
		
		while(inputEmail.startsWith("@")|| inputEmail.contains(" ")) {
			inputEmail = JOptionPane.showInputDialog("Input your e-mail,agains: ");
			
		}
		if(inputEmail.endsWith("@gmail.com")||inputEmail.endsWith("@hotmail.com")) {
			JOptionPane.showMessageDialog(null, "Your e-mail is "+inputEmail);
		}
		else {
			JOptionPane.showMessageDialog(null, "Your e-mail is not hotmail or gmail.com");
		}
	}

}
