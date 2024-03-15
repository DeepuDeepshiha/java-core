package com.learning.core.day10;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CalculatorTest {
	@Test
	public void testadd()
	{
		assertEquals(3,D10P07.add(1, 2));
	}
	@Test
	public void testsub()
	{
		assertEquals(3,D10P07.sub(5, 2));
	}
	@Test
	public void testmul()
	{
		assertEquals(10,D10P08.mul(5, 2));
	}
	@Test
	public void testdiv()
	{
		assertEquals(5,D10P08.div(10, 2));
	}
	@Test
	public void testdivcatch()
	{
		assertEquals(-1,D10P08.div(10, 0));
	}
	int arr[]= {1,2,3,4,5,6};
	int arr1[]= {-1,-2,-3,-4,-5,-6};
	@Test
	public void testfindmax()
	{
		assertEquals(-1,D10P09.findmax(arr1));
	}

}
