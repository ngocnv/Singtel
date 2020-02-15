package com.sg.assigment.basic;

import static org.junit.Assert.assertTrue;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.sg.assigment.basic.domain.Cat;
import com.sg.assigment.basic.domain.Dog;
import com.sg.assigment.basic.domain.Duck;
import com.sg.assigment.basic.domain.Parrot;
import com.sg.assigment.basic.domain.Phone;
import com.sg.assigment.basic.domain.Rooster;

public class ParrotTest {

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

		// Test parrot live with Cat
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		PrintStream ps = new PrintStream(baos);
		PrintStream old = System.out;
		System.setOut(ps);
		Parrot parrot = new Parrot();
		parrot.setThingLiveWith(new Cat());
		parrot.sing();
		System.out.flush();
		System.setOut(old);

		String actual = baos.toString();
		boolean isCorrect = "Meow\r\n".equals(actual);

		assertTrue(isCorrect);

		// Test parrot live with Dog
		System.setOut(ps);
		parrot.setThingLiveWith(new Dog());
		parrot.sing();
		System.out.flush();
		System.setOut(old);

		String actual1 = baos.toString();
		boolean isCorrect1 = "Meow\r\nWoof, woof\r\n".equals(actual1);
		assertTrue(isCorrect1);

		// Test parrot live with rooster
		System.setOut(ps);
		parrot.setThingLiveWith(new Rooster());
		parrot.sing();
		System.out.flush();
		System.setOut(old);

		String actual2 = baos.toString();
		boolean isCorrect2 = "Meow\r\nWoof, woof\r\nCock-a-doodle-doo\r\n".equals(actual2);
		assertTrue(isCorrect2);

		// Test parrot live with Duck
		System.setOut(ps);
		parrot.setThingLiveWith(new Duck());
		parrot.sing();
		System.out.flush();
		System.setOut(old);

		String actual3 = baos.toString();
		boolean isCorrect3 = "Meow\r\nWoof, woof\r\nCock-a-doodle-doo\r\nQuack, quack\r\n".equals(actual3);
		assertTrue(isCorrect3);

		// Test parrot live with Phone
		System.setOut(ps);
		parrot.setThingLiveWith(new Phone());
		parrot.sing();
		System.out.flush();
		System.setOut(old);

		String actual4 = baos.toString();
		boolean isCorrect4 = "Meow\r\nWoof, woof\r\nCock-a-doodle-doo\r\nQuack, quack\r\nRing ring\r\n".equals(actual4);
		assertTrue(isCorrect4);
	}

}
