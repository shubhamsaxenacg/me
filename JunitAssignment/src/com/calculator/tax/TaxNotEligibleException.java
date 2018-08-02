package com.calculator.tax;

//.......NamenotvalidException extends RunTimeException 
//......type of unchecked Exception
public class TaxNotEligibleException extends RuntimeException{

	public TaxNotEligibleException(String string) {
		// TODO Auto-generated constructor stub
		super(string);
	}

}
