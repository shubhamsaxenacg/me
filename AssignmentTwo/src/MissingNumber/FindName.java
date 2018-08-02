package MissingNumber;

import java.util.*;

public class FindName {

	//.........Method to check name.........
	public static void findName(String array[],int size, String searchString)
	{
		Scanner scan =new Scanner(System.in);
		int count = 0;

		for(int i=0; i<size;i++)
		{
			if(searchString.equals(array[i]))
			{
				count++;
			}
		}
		System.out.println(searchString+" occured "+count+" times");
		scan.close();
		
	}
	
	
	//....... Main Function Starts here..........
	public static void main(String args[])
	{
		Scanner scan =new Scanner(System.in);
		
		//Declaration
		int size;
		String searchString;
				
		System.out.println("Enter the size of array...");
		size = scan.nextInt();
		
		String arrayElements[] = new String[size];	
		for(int i=0; i<size; i++)
		{
			arrayElements[i]= scan.next();
		}
	
		System.out.println("Enter the word to search...");
		searchString = scan.next();
		
		findName(arrayElements,size,searchString); // Finds the name and return count
		
		scan.close();
	}

}
