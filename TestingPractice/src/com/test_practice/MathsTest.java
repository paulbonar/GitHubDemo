package com.test_practice;
		
	import org.junit.Assert;
	import org.junit.Test;
		
			public class MathsTest {
		
				@Test
					public void testAdd() {
						int a = 5;
						int b = 6;
						int expected = 11;
						int actual = Maths.add(a,b);
						Assert.assertEquals("Add Test", expected, actual); //error
					
			}
				@Test
					public void testSubtract() {
						int a = 5;
						int b = 2;
						int expected = 3;
						int actual = Maths.subtract(a,b);
						Assert.assertEquals("Subtract Test", expected, actual); //error
			}
				@Test
					public void testDivide() { //error
						double a = 5;
						double b = 2;
						double expected = 2.5;
						double actual = Maths.divide(a,b);
						Assert.assertEquals("Divide Test", expected, actual, 0.001);
			}
				@Test
					public void testMultiply() { //error
						int a = 5;
						int b = 2;
						int expected = 10;
						int actual = Maths.multiply(a,b);
						Assert.assertEquals("Multiply Test", expected, actual);
			}
}