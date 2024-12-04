import java.util.*;
import java.text.*;
public class Lab101 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		DecimalFormat frm = new DecimalFormat("#,###.00");
		DecimalFormat nhd = new DecimalFormat("##");
		System.out.print("Input product name\t: ");
		String productName = input.nextLine();		
		//แสดงและรับข้อมูลจำนวนสินค้า
		System.out.print("Input product unit\t: ");
		int productUnit = input.nextInt();
		//แสดงและรับข้อมูลราคาสินค้า
		System.out.print("Input price per unit\t: ");
		float productPrice = input.nextFloat();
		float totalPrice = productUnit*productPrice;
		System.out.println("------------------------------------------");
		System.out.println("Total Price is " + totalPrice +" baht .");
		System.out.println("------------------------------------------");
		System.out.print("How many discount (%)\t:");
		float discount = input.nextFloat();
		double totalDiscount = totalPrice*discount/100;
		double Amount = totalPrice - totalDiscount;
		System.out.println("Discount from "+nhd.format(discount)+"%"+"\t"+frm.format(totalDiscount)+" baht.");
		System.out.print("Amount to be paid "+"\t" +frm.format(Amount)+" baht.");
		input.close();
		
		

	}

}
