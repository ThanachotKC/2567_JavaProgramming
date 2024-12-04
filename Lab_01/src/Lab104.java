import javax.swing.JOptionPane;

public class Lab104 {
	public static void main(String[] args) {
		
		JOptionPane.showMessageDialog(null, "Welcome to the payroll application", "Message",JOptionPane.INFORMATION_MESSAGE);
		String name = JOptionPane.showInputDialog(null, "Enter employee name","Input",JOptionPane.QUESTION_MESSAGE);
		String hourInput = JOptionPane.showInputDialog(null, "Enter total hours for this employee.","Input",JOptionPane.QUESTION_MESSAGE);
		double hour = Double.parseDouble(hourInput);
		String wageInput = JOptionPane.showInputDialog(null, "Enter total wage for this employee.","Input",JOptionPane.QUESTION_MESSAGE);
		double wage = Double.parseDouble(wageInput);
		double grossEarning = hour * wage;
		double taxRate = 0.15; 
        double tax = grossEarning * taxRate;
		double netEarning = grossEarning - tax;
		
		String message = "Employee name: " + name + "\nHours worked:" + hour +"\nHourly wage:$" + wage +"\nGross earnings:$" + 
		grossEarning +"\nTax rate" + taxRate +"\nTax:$" + tax +"\nNet earning" + netEarning;
		JOptionPane.showMessageDialog(null, message, "Message", JOptionPane.INFORMATION_MESSAGE);
	}
}