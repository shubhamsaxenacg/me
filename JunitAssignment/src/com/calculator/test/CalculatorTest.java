package com.calculator.test;

import org.junit.Test;

import com.calculator.tax.CountrynotValidException;
import com.calculator.tax.NamenotValidException;
import com.calculator.tax.TaxCalculator;
import com.calculator.tax.TaxNotEligibleException;

//........Tax Calculator Testcases checking the exceptions thrown
public class CalculatorTest {

//Checking exception when name is null
	@Test(expected = NamenotValidException.class)
	public void nameNull() {
		
			TaxCalculator taxCalculator = new TaxCalculator();
			taxCalculator.calculateTax("",true, 30_000);
		
	}
	
//Checking exception when not Indian

	@Test(expected = CountrynotValidException.class)
	public void isIndian() {
		
			TaxCalculator taxCalculator = new TaxCalculator();
			taxCalculator.calculateTax("Ron",false, 34000);
		
	}
	
//Checking exception when less than 10_000
	@Test(expected = TaxNotEligibleException.class)
	public void lessThanTenThousand() {
			
		TaxCalculator taxCalculator = new TaxCalculator();
		taxCalculator.calculateTax("Ron",true, 900);
		
	}


}
