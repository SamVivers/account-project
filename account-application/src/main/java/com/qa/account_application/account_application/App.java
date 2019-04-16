package com.qa.account_application.account_application;

import java.util.HashMap;
import java.util.Map;

import com.google.gson.Gson;

public class App {
    
    public static void main(String[] args) {
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
	    
    	Service.retrive(a142);
    	
    	System.out.println(Service.fetch(142).contains("Bob "));
    	
    	System.out.println(Service.cycle("Bob"));
       
//        System.out.println(lloyds.m1);
//        
//        Gson gson = new Gson();
//        String json = gson.toJson(lloyds.m1);
//        System.out.println(json);
//        
//        Map m2 = new HashMap();
//        m2 = gson.fromJson(json, HashMap.class);
//        System.out.println(m2);
    }

}
