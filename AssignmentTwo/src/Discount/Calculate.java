package Discount;

//Calculate class contains methods called by Discount class to calculate different prices
public class Calculate {
	private double value;
	private static final double discountPercentage = 35; //...........Static final

//........Constructor setting the default value of Double
	public Calculate() {
		value = 100;
	}

	public double getValue() {
		return value;
	}
	
	public void setValue(double value) {
		this.value = value;
	}
	
//.....calculate the discount value and return
	public double discountCalculate()
	{
		double discountValue = value * discountPercentage /100;
		return discountValue;
	}

//........Calculates the final price after discount 
	public double afterDiscountFinal(double disountValue)
	{
		double afterDiscountValue = value - disountValue;
		return afterDiscountValue;
	}

}