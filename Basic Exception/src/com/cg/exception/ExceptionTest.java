package com.cg.exception;

import java.util.Scanner;
//........main function which calculates factorial 
public class ExceptionTest {

	public static void main(String[] args) {
		
		Factorial fact = new Factorial();
		
		System.out.println("Enter the number");
		Scanner scanner = new Scanner(System.in);
		int value = scanner.nextInt();
	//...........Throws exception if value is less than 2
	//............Throws exception if factorial value exceed int limit
		try {
			int factorial = fact.getFactorial(value);
			System.out.println("factorial is "+factorial);
		} catch (FactorialException | InvalidInputException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
