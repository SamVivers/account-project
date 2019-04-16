package com.qa.account_application.account_application;

import java.util.*;

public class Service {
	static Map<Integer, String> m1 = new HashMap(); 
	
  	public static void add(Account a) {
		m1.put(a.getAccountNumber(), a.getFirstName() + " " + a.getLastName());
	}
	public static void retrive(Account a) {
		System.out.println(m1.get(a.getAccountNumber()));
	}
	public static int size() {
		return m1.size();
	}
	public static int cycle(String name) {
		int n = 0;
		for (int i : m1.keySet()) {
			if () {
				n++;
			}
		}
		return n;
	}
}
