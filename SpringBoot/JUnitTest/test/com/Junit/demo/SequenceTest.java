package com.Junit.demo;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class SequenceTest {
	//JUnit的Before,After注解，他的执行顺序演示
	@BeforeClass
	public static void setUpBeforeClass() throws Exception{
		System.out.println("setUpBeforeClass");
	}
	@AfterClass
	public static void tearDownAfterClass() throws Exception{
		System.out.println("tearDownAfterClass");
	}
	@Before
	public  void setUp() throws Exception{
		System.out.println("	setUp");
	}
	@After
	public  void tearDown() throws Exception{
		System.out.println("	tearDown");
	}
	@Test
	public void testA(){
		System.out.println("	testA()");
	}
	@Test
	public void testB(){
		System.out.println("	testB()");
	}
	@Test
	public void testC(){
		System.out.println("	testC()");
	}
}
