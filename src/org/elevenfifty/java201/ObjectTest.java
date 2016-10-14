package org.elevenfifty.java201;

import static org.junit.Assert.*;

import org.junit.Test;

public class ObjectTest {

	@Test
	public void testEquals() {
		Object o1 = new Object();
		Object o2 = new Object();
		
		assertTrue(o1.equals(o1));
		assertFalse(o1.equals(o2));
	}

}
