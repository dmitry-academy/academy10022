package by.academy.classwork;

import static junit.framework.Assert.assertEquals;

import org.junit.Ignore;
import org.junit.Test;

import by.academy.junit.Calculator;

public class FirstTest {

	@Test
	public void mathDivide() {
		assertEquals(5, Calculator.divide(10, 2));
	}

	@Test(expected = ArithmeticException.class)
	public void testException() {
		int i = 10 / 0;
	}

	@Ignore
	@Test(timeout = 1)
	public void timeout() {

		for (Integer i = 0; i < 2000; i++) {
			System.err.println(i);
		}
	}
	
	@Ignore
	@Test(timeout = 1)
	public void ignore() {

		for (Integer i = 0; i < 2000; i++) {
			System.err.println(i);
		}
	}
}
