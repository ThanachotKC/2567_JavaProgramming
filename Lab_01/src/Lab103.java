import javax.swing.JOptionPane;

public class Lab103 {
	public static void main(String[] args) {
		String minute_input = JOptionPane.showInputDialog(null, "Input Time Parking (minute)","Input",JOptionPane.QUESTION_MESSAGE);
		
		int minute = Integer.parseInt(minute_input);
		int hour = minute / 60 ;
		int total_min = minute % 60;
		double  Amount_paid = hour * 50.25;
		
		
		String message = "You parking "+ hour +" Hour "+total_min+" Minute." + "\nAmount to be paid is " + Amount_paid + " baht." ;
		JOptionPane.showMessageDialog(null, message, "Message",JOptionPane.INFORMATION_MESSAGE);
	}
}
