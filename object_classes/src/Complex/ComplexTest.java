package Complex;

import java.util.Scanner;

public class ComplexTest {
	
	public static void main(String args[])
	{
		Scanner scanner = new Scanner(System.in);
		Complex complexNum1 = new Complex();
		Complex complexNum2 = new Complex();
		int realNum1,imaginaryNum1 ,imaginaryNum2, realNum2;
		
		System.out.println("Enter for complex number 1: ");
		realNum1 = scanner.nextInt();
		imaginaryNum1 = scanner.nextInt();
		
		System.out.println("Enter for complex number 2: ");
		realNum2 = scanner.nextInt();
		imaginaryNum2 = scanner.nextInt();
		
		complexNum1.set(realNum1,imaginaryNum1);
		complexNum2.set(realNum2,imaginaryNum2);
		System.out.println("Complex number 1: ");
		complexNum1.display();
		System.out.println("Complex number 2: ");
		complexNum2.display();
		
		Complex complexNum3 = new Complex();
		System.out.println("Sum is :    ");
		complexNum3 = complexNum3.sum(complexNum1,complexNum2);
		complexNum3.display();
		
		scanner.close();
	}
}
