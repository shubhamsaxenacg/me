package whiteSpace;

import java.util.Scanner;

//.........Contains main function which creates an object of WhiteSpaceFunction
//...Removes extra white space and then removes a specific word from a specific position provided

public class WhiteSpace {
	
	public static void main(String args[])
	{
		WhiteSpaceFunction whiteSpaceFunction = new WhiteSpaceFunction();
		Scanner scanner = new Scanner(System.in);
		
		//.....Input the value of sentence by user
		String sentence;
		System.out.println("Enter the sentence....");
		sentence = scanner.nextLine();
		
		whiteSpaceFunction.setSentence(sentence); 
		
		//....String passed into function to remove the extra spaces
		String updatedSentence = whiteSpaceFunction.removeSpace();
		System.out.println(updatedSentence);
		
		String word;
		int position;
		System.out.println("Enter the word to be removed.....");
		word = scanner.next();
		
		System.out.println("Enter the position");
		position = scanner.nextInt();
		
		//....word string passed to  delete from sentence
		String sentenceAfterWordRemove = whiteSpaceFunction.removeWord(word, position);
		System.out.println(sentenceAfterWordRemove);
		
		
		scanner.close();
	}


}
