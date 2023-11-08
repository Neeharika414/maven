package com.NumberCheck;
import java.lang.Math;
import java.util.ResourceBundle;

public class NumberCheckMain {

	int add()
	{
		ResourceBundle rb=ResourceBundle.getBundle("config");
		int x=Integer.parseInt(rb.getString("a"));
		int y=Integer.parseInt(rb.getString("b"));
		if((x>0 && y>0) || (x<0 && y<0))
		{
			return (Math.abs(x+y));
		}
		if((x>0 && y<0) || (x<0 && y>0))
		{
			return (x+y);
		}
		return 0;
	}
	int sub()
	{
		ResourceBundle rb=ResourceBundle.getBundle("config");
		int x=Integer.parseInt(rb.getString("a"));
		int y=Integer.parseInt(rb.getString("b"));
		if((x>0 && y>0) || (x<0 && y<0))
		{
			return (Math.abs(x-y));
		}
		if((x>0 && y<0) || (x<0 && y>0))
		{
			return (x-y);
		}
		return 0;
	}
	int multi()
	{
		ResourceBundle rb=ResourceBundle.getBundle("config");
		int x=Integer.parseInt(rb.getString("a"));
		int y=Integer.parseInt(rb.getString("b"));
		if((x>0 && y>0) || (x<0 && y<0))
		{
			return (Math.abs(x*y));
		}
		if((x>0 && y<0) || (x<0 && y>0))
		{
			return (x*y);
		}
		return 0;
	}
	int div()
	{
		ResourceBundle rb=ResourceBundle.getBundle("config");
		int x=Integer.parseInt(rb.getString("a"));
		int y=Integer.parseInt(rb.getString("b"));
		if((x>0 && y>0) || (x<0 && y<0))
		{
			return (Math.abs(x/y));
		}
		if((x>0 && y<0) || (x<0 && y>0))
		{
			return (x/y);
		}
		return 0;
	}
	
}
