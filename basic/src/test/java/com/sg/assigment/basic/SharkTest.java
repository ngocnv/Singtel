package com.sg.assigment.basic;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.sg.assigment.basic.domain.Fish;
import com.sg.assigment.basic.domain.Shark;
import com.sg.assigment.basic.enums.Color;
import com.sg.assigment.basic.enums.Size;

public class SharkTest {
	
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
	public void testCharacters() {
	
		Shark shark = new Shark();
		assertEquals(Color.BLUE, shark.getColor());
		assertEquals(Size.LARGE, shark.getSize());
		
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		PrintStream ps = new PrintStream(baos);
		PrintStream old = System.out;
		System.setOut(ps);
		
		shark.eat(new Fish());
		System.out.flush();
		System.setOut(old);
		
		String actual = baos.toString();
		boolean isCorrect = "Shark eat fish\r\n".equals(actual);
		assertTrue(isCorrect);
	}

}
