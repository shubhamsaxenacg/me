package com.calculator.tax;

public class TaxCalculator {

	public float calculateTax(String name, boolean indian, int empSal) throws NamenotValidException, CountrynotValidException,TaxNotEligibleException
	{
		float taxCalculate = 0;
		
	//throw exception when no name is in input
		if (name == "")
			throw new NamenotValidException("The employee should not be empty....");
		
	//throw exception when indian is false
		if(indian == false)
			throw new CountrynotValidException("The employee should be indian citizen for calculating message");
	
	//Calculating value of tax for different empSal values
		if(empSal>100_000)
			taxCalculate = empSal *8 /100;
		else if(empSal>50_000 && empSal<=100_000)
			taxCalculate = empSal *6 /100;
		else if(empSal>30_000 && empSal<=50_000)
			taxCalculate = empSal *5 /100;
		else if(empSal>10_000 && empSal<=30_000)
			taxCalculate = empSal *4 /100;
		else		//......Throwing exception if value less than 10_000
			throw new TaxNotEligibleException("The employee does not need to pay tax");

		return taxCalculate;
	}

}
