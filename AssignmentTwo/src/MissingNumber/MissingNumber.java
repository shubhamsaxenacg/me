package MissingNumber;
import java.util.*;



public class MissingNumber {

	
	//...........Method to input Array values called in Main...........
	public static int[] inputArray(int size) 
	{
		Scanner scan =new Scanner(System.in);
		int arrayElements[] = new int[size];
		for(int i=0; i<size-1; i++)
		{
			arrayElements[i]= scan.nextInt();
		}
		scan.close();
		return arrayElements;
	}
	
	//...........Method to find missing number...........
	public static void missingNumber(int array[], int size)
	{
		int sum=0;
		int originalSum = (size+1)*(size)/2;
		int missing;
		for(int i=0; i<size; i++)
		{
			sum = sum+ array[i];
		}
		
		missing = originalSum-sum;		
		System.out.println(missing);
	}
	
	
	
	//...........Main Function..............
	public static void main(String args[])
	{
		Scanner scan =new Scanner(System.in);
		
		//Declaration
		int size, array[];
		
		System.out.println("Enter the size of array...");
		size = scan.nextInt();
		
		array = inputArray(size); //inputArray takes the input from user into the array
		missingNumber(array,size); // Finds the missing number and prints value
		
		scan.close();
	}
}
