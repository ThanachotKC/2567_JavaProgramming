import java.util.Scanner;

import javax.swing.JOptionPane;

public class Lab103 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        
        String productName = JOptionPane.showInputDialog("Input time parking (minute): ");
        int minutes = scanner.nextInt();
        
       
        int hours = minutes / 60;  
        int remainingMinutes = minutes % 60;  
        
        
        double hourlyRate = 50.0;  
        double minuteRate = 0.25;  
        
        
        double totalCharge = (hours * hourlyRate) + (remainingMinutes * minuteRate);
        
        
        JOptionPane.showMessageDialog(null,"Your Parking : " + hours + " hours " + remainingMinutes + " minutes.");
        System.out.printf("Amount to be paid is : %.2f Baht\n", totalCharge);
        
        
        scanner.close();
    }
}
