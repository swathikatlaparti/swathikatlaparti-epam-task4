package com.code.ccost;
import org.junit.*;
import static org.junit.Assert.*;
public class testcost {
             @Test
	public void test() {

		ccost cc = new ccost();

		double answer = cc.costForConstructionMaterial("Standard", 500, false);

		assertEquals(600000,answer,0.001);

	}
}