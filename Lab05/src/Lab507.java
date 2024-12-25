import javax.swing.*;

public class Lab507 {
    public static void main(String[] args) {
        int[] numbers = new int[5];

        
        for (int i = 0; i < 5; i++) {
            numbers[i] = Integer.parseInt(JOptionPane.showInputDialog("Enter number " + (i + 1) + ":"));
        }

        
        String even = "";
        String odd = "";
        for (int num : numbers) {
            if (num % 2 == 0) {
                even += num + " ";
            } else {
                odd += num + " ";
            }
        }

        
        JOptionPane.showMessageDialog(null, "Even numbers: " + even.toString());
        JOptionPane.showMessageDialog(null, "Odd numbers: " + odd.toString());
    }
}
