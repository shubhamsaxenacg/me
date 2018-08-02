package palindrome;
import java.util.Scanner;

public class Palindrome {
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int numberToCheck;
		boolean checkEqual;
		System.out.print("Enter number: ");
		numberToCheck = sc.nextInt();
		String numberToString = String.valueOf(numberToCheck);
		String reverse = new StringBuffer(numberToString).reverse().toString();
		
		checkEqual = reverse.equals(numberToString);
		
		if(checkEqual)
		{
			System.out.println("Palindrome");
			
		}
		else
		{
			System.out.println("Not Palindrome");

		}
	}
	
}
