package com.cg.randominteger;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.function.Predicate;

 class CheckInteger {

	 public static Predicate<Integer> isEven(){
		return (a -> a%2 == 0);
		 
	 }
	 
	 public static Predicate<Integer> isOdd(){
			return (a -> a%2 != 0);
			 
	 }
	 
	public static Predicate<Integer> isPalindrome(){
		Predicate<Integer> p = a-> {
										String word = ""+a;
										StringBuilder str = new StringBuilder(word);
										return(word.equals(str.reverse().toString())?true:false);
									};
		return p;
	}
	
//	public static Predicate<Integer> isPrime(){
//		return (a -> {
//					if (a == 1)
//						return true;
//				};)
//	}
	
	 public static void main(String args[]) throws IOException
	{
		Scanner scanner = new Scanner(System.in);
		List<Integer> number = new ArrayList<>();
		number.add(scanner.nextInt());
		
		number.stream().filter(isEven()).forEach(i->System.out.println("Even"));
		number.stream().filter(isOdd()).forEach(i->System.out.println("Odd"));
		number.stream().filter(isPalindrome()).forEach(i->System.out.println("No. is palindrome"));
		number.stream().filter(isPalindrome().negate()).forEach(i->System.out.println("No. is not palindrome"));
	
		scanner.close();
	}
}
