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

import com.sg.assigment.basic.domain.Clownfish;
import com.sg.assigment.basic.domain.Fish;
import com.sg.assigment.basic.enums.Color;
import com.sg.assigment.basic.enums.Size;

public class ClownFishTest {
	
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
	
		Clownfish clownfish = new Clownfish();
		assertEquals(Color.ORANGE, clownfish.getColor());
		assertEquals(Size.SMALL, clownfish.getSize());
		
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		PrintStream ps = new PrintStream(baos);
		PrintStream old = System.out;
		System.setOut(ps);
		
		clownfish.makeJoke();
		System.out.flush();
		System.setOut(old);
		
		String actual = baos.toString();
		boolean isCorrect = "Smile !\r\n".equals(actual);
		assertTrue(isCorrect);
	}

}
