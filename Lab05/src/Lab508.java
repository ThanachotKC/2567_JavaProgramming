import javax.swing.JOptionPane;

public class Lab508 {

    public static void main(String[] args) {
       
        int[] num = {25, 78, 41, 22, 36, 85, 37};
        
        int index;
        String input;
        
        
        do {
            input = JOptionPane.showInputDialog("Input index of array:");
            index = Integer.parseInt(input); 
        } while (!checkIndex(num, index)); 

        
        String message = "Current data, nums[" + index + "] is " + currentData(num, index) + "\n"
                + "Previous data, nums[" + (index - 1) + "] is " + prevData(num, index) + "\n"
                + "Next data, nums[" + (index + 1) + "] is " + nextData(num, index);
        JOptionPane.showMessageDialog(null, message);
    }

    public static boolean checkIndex(int[] nums, int index) {
        return index >= 0 && index < nums.length;
    }

    
    public static int currentData(int[] nums, int index) {
        return nums[index];
    }

    
    public static int prevData(int[] nums, int index) {
        return (index > 0) ? nums[index - 1] : nums[index];
    }

    
    public static int nextData(int[] nums, int index) {
        return (index < nums.length - 1) ? nums[index + 1] : nums[index];
    }
}
