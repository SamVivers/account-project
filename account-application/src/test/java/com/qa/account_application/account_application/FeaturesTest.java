package com.qa.account_application.account_application;

import static org.junit.Assert.*;

import org.junit.*;

public class FeaturesTest {
	@BeforeClass
	public static void setup() {
        Account a111 = new Account("Sam", "Vivers", 111);
        Account a142 = new Account("Bob", "Rivers", 142);
        Account a843 = new Account("Fred", "Divers", 843);
        Account a964 = new Account("Sue", "Livers", 964);
        Account a445 = new Account("Bob", "Jenkins", 445);
      
        Service.add(a111);
        Service.add(a142);
        Service.add(a843);
        Service.add(a964);
        Service.add(a445);
	}
	
	@Test
	public void test1() {
		assertEquals(1, Service.cycle("Sam"));
	}
	@Test
	public void test2() {
		assertEquals(2, Service.cycle("Bob"));
	}
	@Test
	public void test3() {
		Account a446 = new Account("Bob", "Menkins", 446);
		Service.add(a446);
		assertEquals(3, Service.cycle("Bob"));
	}
}
