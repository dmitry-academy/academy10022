package by.academy.classwork;

import org.junit.Test;

import by.academy.junit.Calculator;
import junit.framework.Assert;

public class FirstTest {

	@Test
	public void mathDivide() {
		Assert.assertEquals(5, Calculator.divide(10, 2));
	}

	@Test(expected = ArithmeticException.class)
	public void testException() {

	}

	@Test(timeout = 1000)
	public void timeout() {
		//todo count 10000
	}
}
