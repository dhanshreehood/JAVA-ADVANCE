package com.cybage.junit;

import org.junit.Test;

public class DemoTest {

	@Test(timeout=100)
	public void testRandom() {
		Demo demo=new Demo();
		demo.random();
	}

}
