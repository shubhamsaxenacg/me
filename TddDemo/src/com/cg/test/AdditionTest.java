package com.cg.test;

import org.junit.Assert;

import com.cg.calculator.Maths;


class AdditionTest {

	@Test
	void testAddTwoPositive() {
		Maths math = new Maths();
		int ans = math.add(3,4);
		Assert.assertEquals(7,ans);
	}
	
	@Test
	void testAddtwoNegative()
	{
		Maths math = new Maths();
		int ans = math.add(-3,-4);
		Assert.assertEquals(-7,ans);
	}
	
	@Test
	void testAddOneNegativeOnePositive()
	{
		Maths math = new Maths();
		int ans = math.add(-3,4);
		Assert.assertEquals(1,ans);
	}
	
	@Test
	void testAddOneNegativeOneZero()
	{
		Maths math = new Maths();
		int ans = math.add(-3,0);
		Assert.assertEquals(-3,ans);
	}
	
	@Test
	void testAddOnePositiveOneZero()
	{
		Maths math = new Maths();
		int ans = math.add(3,0);
		Assert.assertEquals(3,ans);
	}
	
	@Test(expected = java.lang.ArithmeticException.class)
	public void testNotInteger()
	{
		Maths math = new Maths();
		int ans = math.add(3,0);
		Assert.assertEquals(3,ans);	}

}
