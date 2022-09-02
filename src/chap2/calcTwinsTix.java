package chap2;

import javax.swing.JOptionPane;

public class calcTwinsTix {

	public static void main(String[] args) {
		//ask user to input numbers
		String tickets = JOptionPane.showInputDialog(null, "How many tickets?");
		
		
		final int price = 75;
		final int fee = 20;
		final double tax_rate = .07;
		
		int calc = tickets * price;
		
		int sum = calc + fee;
		double tax_total = sum * tax_rate;
		int total = (int) (sum + tax_total);
		
		
		
		System.out.println("Total Cost: " + total);
				
	}


}
