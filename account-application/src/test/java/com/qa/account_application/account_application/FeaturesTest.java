package com.qa.account_application.account_application;

import static org.junit.Assert.*;

import org.junit.*;

public class FeaturesTest {
	@Test
	public void test1() {
		assertEquals(1,Features.cycle("Sam"));
	}
}
