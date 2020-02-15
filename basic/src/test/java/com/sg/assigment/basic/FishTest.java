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
import com.sg.assigment.basic.domain.Fish;

public class FishTest {
	
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
	public void testSwim() {
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		PrintStream ps = new PrintStream(baos);
		PrintStream old = System.out;
		System.setOut(ps);
		Fish fish = new Fish();
		fish.swim();
		System.out.flush();
		System.setOut(old);
		
		String actual = baos.toString();
		boolean isCorrect = "I am swimming\r\n".equals(actual);
		assertTrue(isCorrect);
	}
	
	
	@Test
	public void testWalk() {
		Fish fish = new Fish();
		try {
		fish.walk();
		}catch(RuntimeException e) {
			assertTrue(true);
			return;
		}
		assertTrue(false);
	}
	
	@Test
	public void testSing() {
		Fish fish = new Fish();
		try {
			fish.sing();
		} catch (RuntimeException e) {
			assertTrue(true);
			return;
		}
		
		assertTrue(false);
	}

}
