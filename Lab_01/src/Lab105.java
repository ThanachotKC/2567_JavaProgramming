import javax.swing.JOptionPane;

public class Lab105 {
	public static void main(String[] args) {
		String cardId = JOptionPane.showInputDialog(null, "This progeam calculates the total cost of CD order Please enter the ID of he CD","Input",JOptionPane.QUESTION_MESSAGE);
		String cardTitle = JOptionPane.showInputDialog(null, "Plaese enter the title of the CD","Input",JOptionPane.QUESTION_MESSAGE);
		String Price = JOptionPane.showInputDialog(null, "Plaese enter the price of the CD in U.S> dollars","Input",JOptionPane.QUESTION_MESSAGE);
		String Quantity = JOptionPane.showInputDialog(null, "Plese enter the quantity to be purchased","Input",JOptionPane.QUESTION_MESSAGE);
		
		double cardPrice = Double.parseDouble(Price);
		double cardQuantity = Double.parseDouble(Quantity);
		double cardSubtotal = cardPrice * cardQuantity;
		double Tax_rate = 6.25/100;
		double cardTotal = cardSubtotal * (1+ Tax_rate);
		
		String message = "Summary of the transaction:\n"+"\nCD ID: "+
		cardId+"\nCD Title: "+
		cardTitle+"\nCD Unit Price:$"+
		cardPrice+"\nCD Quantity: "+
		cardQuantity+"\n"+"\nSubtotal:$"+
		cardSubtotal+"\nTax rate: "+Tax_rate* 100+"%"+"\nTotal:$"+cardTotal+"\n\nEnd of Program" ;
		
	}
}