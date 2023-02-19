package com.Junit.demo;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class CalculatorTest {
	Calculator calc;
	@Before
	public void setUp() {
		calc=new Calculator();
	}
	
	@Test 
	public void testAdd2Numbers() {
		int r=calc.calculator("1+2");
		assertEquals(3,r);
	}
	@Test 
	public void testAdd3Numbers() {
		int r=calc.calculator("1+2+3");
		assertEquals(6,r);
	}
	
	@Test 
	public void testAddLargeNumbers() {
		int r=calc.calculator("123+256");
		assertEquals(379,r);
	}
	//异常测试，传入一个空值，用@Test()中的excepted指定异常的类型，对可能发生的每种异常都进行测试
	@Test(expected=NumberFormatException.class)
	public void testCalcWithEmptyString() {
		calc.calculator("");
	}
	//异常测试，传入一个Null异常
	@Test(expected=NullPointerException.class)
	public void testCalcWithNull() {
		calc.calculator(null);
	}
}