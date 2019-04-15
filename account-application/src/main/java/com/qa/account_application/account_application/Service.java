package com.qa.account_application.account_application;

import java.util.*;

public class Service {
	 Map m1 = new HashMap(); 
	
  	public void add(Account a) {
		m1.put(a, a.getFirstName() + " " + a.getLastName() + " " + a.getAccountNumber());
	}
	public void retrive(Account a) {
		System.out.println(m1.get(a));
	}
}
