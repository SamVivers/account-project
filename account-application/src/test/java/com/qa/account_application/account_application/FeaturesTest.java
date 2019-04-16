package com.qa.account_application.account_application;

import static org.junit.Assert.*;

import org.junit.*;

public class FeaturesTest {
	@BeforeClass
	public void setup() {
        Account a111 = new Account("Sam", "Vivers", 111);
        Account a142 = new Account("Bob", "Rivers", 142);
        Account a843 = new Account("Fred", "Divers", 843);
        Account a964 = new Account("Sue", "Livers", 964);
        Account a445 = new Account("Bob", "Jenkins", 445);
        
        Service lloyds = new Service();
        
        lloyds.add(a111);
        lloyds.add(a142);
        lloyds.add(a843);
        lloyds.add(a964);
        lloyds.add(a445);
	}
	
	@Test
	public void test1() {
		assertEquals(1,Features.cycle("Sam"));
	}
	public void test2() {
		assertEquals(2,Features.cycle("Bob"));
	}
}
