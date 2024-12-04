import java.text.DecimalFormat;

import javax.swing.*;
public class LabSheet_201 {

	public static void main(String[] args) {
		final int BUFFET = 299;
		int isMember ;
		
		DecimalFormat frm = new DecimalFormat("#,###.00");
		int numberofCustomer = Integer.parseInt(JOptionPane.showInputDialog("How many customer per bill"));
		
		double totalPrice = BUFFET * numberofCustomer;
		//System.out.printf("Total price is %,.2f baht.",totalPrice);
		//int isMember = JOptionPane.showConfirmDialog(null, "Total price is "+ totalPrice + " baht."+
				//"\nDo you have a member card ? ");
		do {isMember = JOptionPane.showConfirmDialog(null, "Total price is "+ frm.format(totalPrice) + " baht."+
				"\nDo you have a member card ? ");
			
		}while (isMember==JOptionPane.CANCEL_OPTION);//isMember==2
		
		
		if(isMember==JOptionPane.YES_OPTION) {
			double priceAfterdiscount = totalPrice * 0.90 ;
			JOptionPane.showMessageDialog(null, "Amount to be paid is "+ frm.format(priceAfterdiscount) + " baht.");
			
		
		}else if (isMember==JOptionPane.NO_OPTION);
		JOptionPane.showMessageDialog(null, "Amount to be paid is "+ frm.format(totalPrice) + " baht.");
				

	}

}
