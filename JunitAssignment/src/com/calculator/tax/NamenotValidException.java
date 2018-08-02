package com.calculator.tax;

//.......NamenotvalidException extends RunTimeException 
//......type of unchecked Exception
public class NamenotValidException extends RuntimeException {

	public NamenotValidException(String message) {
		super(message);
	}
}
