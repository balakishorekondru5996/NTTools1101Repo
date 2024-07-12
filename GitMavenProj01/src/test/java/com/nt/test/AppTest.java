package com.nt.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

import com.nt.service.Arithmetic;

public class AppTest {
	@Test
	public void  testWithPostives() {
		Arithmetic ar = new Arithmetic();
		System.out.println("AppTest.testWithPostives()");
		float expected = 40.0f;
		float actual = ar.sum(20.0f, 20.0f);
		assertEquals(expected,actual);
	}
	
	@Test
	public void testWithNegative() {
		Arithmetic ar = new Arithmetic();
		System.out.println("AppTest.testWithNegative()");
		float expected = -40.0f;
		float actual = ar.sum(-20.0f, -20.0f);
		assertEquals(expected,actual);
	}
	
	@Test
	public void testWithZero() {
		Arithmetic ar = new Arithmetic();
		System.out.println("AppTest.testWithZero()");
		float expected = 0.0f;
		float actual = ar.sum(0.0f, 0.0f);
		assertEquals(expected,actual);
	}
	
	@Test
	public void testWithMixed() {
		Arithmetic ar = new Arithmetic();
		System.out.println("AppTest.testWithMixed()");
		float expected = 40.0f;
		float actual  = ar.sum(100.0f,-60.0f);
		assertEquals(expected,actual);
	}
}
