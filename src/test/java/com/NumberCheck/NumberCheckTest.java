package com.NumberCheck;

import org.testng.Assert;
import org.testng.annotations.Test;

public class NumberCheckTest {

	@Test
	public void testadd1()
	{
		NumberCheckMain num=new NumberCheckMain();
		Assert.assertEquals(-5,num.add());
	}
	@Test
	public void testsub1()
	{
		NumberCheckMain num=new NumberCheckMain();
		Assert.assertEquals(-15,num.sub());
	}
	@Test
	public void testmulti1()
	{
		NumberCheckMain num=new NumberCheckMain();
		Assert.assertEquals(-50,num.multi());
	}
	@Test
	public void testdiv1()
	{
		NumberCheckMain num=new NumberCheckMain();
		Assert.assertEquals(-2,num.div());
	}
}
