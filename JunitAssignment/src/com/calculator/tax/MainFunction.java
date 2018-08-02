package com.calculator.tax;

//........Main function passing different values to check different test cases
public class MainFunction {

	public static void main(String[] args) {
		TaxCalculator tax = new TaxCalculator();
		float taxValue;
	
//.......Test case where the employee name is empty
		try 
		{
			taxValue = tax.calculateTax("", true, 30_000);
			System.out.println("Tax amount is "+taxValue);
		}
		catch (NamenotValidException | CountrynotValidException | TaxNotEligibleException e) {
			e.printStackTrace();
		}

//........Test case where the citizen is not indian
		try 
		{
			taxValue = tax.calculateTax("Ron", false, 34_000);
			System.out.println("Tax amount is "+taxValue);
		}
		catch (NamenotValidException | CountrynotValidException | TaxNotEligibleException e) {
			e.printStackTrace();
		}
		
//........Test case where salary is less than 10_000
		try 
		{
			taxValue = tax.calculateTax("Tim", true, 1000);
			System.out.println("Tax amount is "+taxValue);
		}
		catch (NamenotValidException | CountrynotValidException | TaxNotEligibleException e) {
			e.printStackTrace();
		}

//.........Test case to check the tax amount if it satisfies all conditions
		try 
		{
			taxValue = tax.calculateTax("Jack", true, 55_000);
			System.out.println("Tax amount is "+taxValue);
		}
		catch (NamenotValidException | CountrynotValidException | TaxNotEligibleException e) {
			e.printStackTrace();
		}

	}

}
