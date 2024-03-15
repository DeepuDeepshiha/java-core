package com.learning.core.day10;

public class ValidatorStudent extends Student{
	public boolean  checkname(String name) throws nameexception
	{
		if(name.isBlank()==false)
		{
			return true;
		}
		else
		{
			throw new nameexception();
		}
	}
	public boolean  checkadd(String add) throws addressexception
	{
		if(add.isBlank()==false)
		{
			return true;
		}
		else
		{
			throw new addressexception();
		}
	}

}
