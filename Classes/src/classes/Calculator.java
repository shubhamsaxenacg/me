package classes;

import java.util.Scanner;

public class Calculator {
	Scanner sc = new Scanner(System.in);	
	private int number1;
	private int number2;
	
	private int sum;
	private int subtract;
	private int multiply;
	private int divide;
	
	Calculator()
	{
		System.out.print("Enter the first number");
		number1 = sc.nextInt();
		System.out.print("Enter the second number");
		number2 = sc.nextInt();
	}
	
	public int Sum()
	{
		sum = number1+number2;
		return sum;
	}
	
	public int Subtract()
	{
		subtract = number1-number2;
		return subtract;
	}
	
	public int Multiply()
	{
		multiply = number1+number2;
		return multiply;
	}
	public int Divide()
	{
		divide = number1+number2;
		return divide;
	}
}
