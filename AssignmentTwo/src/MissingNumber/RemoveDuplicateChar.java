package MissingNumber;

import java.util.Scanner;
//.....Contains main function
public class RemoveDuplicateChar {
	
//.....	Checks duplicate characters and remove
	public static void removeDupChar(String word)
	{
		int size = word.length();
		char wordCharacter;
		String newString = "";
		
		for(int i=0; i<size; i++)
		{
			wordCharacter = word.charAt(i);
			if(wordCharacter!=' ')
			{
				newString = newString + wordCharacter;
			}
			word = word.replace(wordCharacter, ' ');
			
		}
		System.out.println(newString);
	}
	
	
//.........Inputs string and calls method to remove duplicate character from the string	
	public static void main(String args[])
	{
		Scanner scan =new Scanner(System.in);
		
		System.out.println("Enter the word...");
		String word = scan.next();
		
		
		removeDupChar(word);
		
		
		scan.close();
	}

}
