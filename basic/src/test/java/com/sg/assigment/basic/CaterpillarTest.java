package com.sg.assigment.basic;

import static org.junit.Assert.assertTrue;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.sg.assigment.basic.domain.Bird;
import com.sg.assigment.basic.domain.Butterfly;
import com.sg.assigment.basic.domain.Caterpillar;

public class CaterpillarTest {
	
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
	public void testTransform() {
		Caterpillar caterpillar = new Caterpillar();
		assertTrue(!caterpillar.getContext().get(Caterpillar.FLY));
		assertTrue(caterpillar.getContext().get(Caterpillar.WALK));
		Butterfly butterfly = caterpillar.transform();
		assertTrue(butterfly.getContext().get(Caterpillar.FLY));
		assertTrue(!butterfly.getContext().get(Caterpillar.MAKESOUND));
	
	}

}
