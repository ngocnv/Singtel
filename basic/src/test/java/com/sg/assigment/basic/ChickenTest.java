package com.sg.assigment.basic;

import static org.junit.Assert.assertTrue;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.sg.assigment.basic.domain.Chicken;

public class ChickenTest {
	
	ByteArrayOutputStream baos;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testSing() {
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		PrintStream ps = new PrintStream(baos);
		PrintStream old = System.out;
		System.setOut(ps);
		Chicken chicken = new Chicken();
		chicken.sing();
		System.out.flush();
		System.setOut(old);
		
		String actual = baos.toString();
		boolean isCorrect = "Cluck, cluck\r\n".equals(actual);
		assertTrue(isCorrect);
	}
	
	@Test
	public void testFly() {
		Chicken chicken = new Chicken();
		chicken.fly();
		assertTrue(true);
	}

}
