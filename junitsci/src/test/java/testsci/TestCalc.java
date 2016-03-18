package testsci;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import ro.sci.math.Calculator;

public class TestCalc {

	@Test
	public void testAdd() {
		Calculator c = new Calculator();
		assertEquals(5, c.add(2, 3));
	}
}
