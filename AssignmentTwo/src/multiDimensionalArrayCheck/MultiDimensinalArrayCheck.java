package multiDimensionalArrayCheck;

import java.util.Scanner;

//.....Contains main function where user inputs value of 2D Array
public class MultiDimensinalArrayCheck {
	
	public static void main(String args[])
	{
		CheckArray checkArray = new CheckArray();
		Scanner scanner = new Scanner(System.in);
		
		String array[][] = new String[20][20];
		
		System.out.println("Enter the row");
		int rowLength = scanner.nextInt();
		System.out.println("Enter the column");
		int colLength = scanner.nextInt();
		
		System.out.println("Enter the two dimensional array.....");
		for(int i=0; i< rowLength; i++)
		{
			for(int j=0; j< colLength; j++)
			{
				array[i][j] = scanner.next();
				
			}
		}
//.....Inputtting the element to be found
		System.out.println("Enter the element to be found");
		String element = scanner.next();
//.......findElement function called from checkArray class	
		checkArray.findElement(array, rowLength, colLength, element);
		
		scanner.close();
	}

	

}
