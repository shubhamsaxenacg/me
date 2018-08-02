package Discount;

import java.util.Scanner;

//....Contains Main function..... creates an object of Calcualte class
public class Discount {
	public static void main(String args[])
	{
		//.......Object of calculate class
		Calculate calculate = new Calculate();
		Scanner scanner = new Scanner(System.in);
		
		//.......Getting the value of original price from user
		double originalPrice;
		System.out.println("Enter the original Value");
		originalPrice = scanner.nextDouble();
		
		calculate.setValue(originalPrice);
		//......The function returns discount price in variable
		double discountValue1 = calculate.discountCalculate();
		System.out.println("Discount Price: "+discountValue1);
		
		//.......calling function which returns discount price in the variable
		double finalPrice = calculate.afterDiscountFinal(discountValue1);
		System.out.println("Final Price: "+finalPrice);
		scanner.close();
	}

}
