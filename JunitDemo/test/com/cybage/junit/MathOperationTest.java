package com.cybage.junit;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class MathOperationTest {
    static MathOperation mOperations =null;
	@BeforeClass
	public static void beforeClassMethod() {
		mOperations = new MathOperation();
		System.out.println("before class method..");
	}
	
	@AfterClass
	public static void afterClassMethod() {
		mOperations = new MathOperation();
		System.out.println("after class method..");
	}
	
	@Test
	public void testAdd() {
		assertEquals(30,mOperations.add(10,20));
	}

	@Test
	public void testSub() {
		assertEquals(10,mOperations.sub(20,10));
	}

	@Test
	public void testTestAddForNegative() {
		assertEquals(-30,mOperations.add(-10,-20));
	}
	
	@Test(expected =IllegalArgumentException.class)
	public void testAddForException() {
		mOperations.add(2000,0);
	}

	@Test
	public void testCheck() {
		assertFalse(mOperations.check("Hi"));
	}

}
