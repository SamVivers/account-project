package com.qa.account_application.account_application;

import java.util.HashMap;
import java.util.Map;

import com.google.gson.Gson;

public class App 
{
    public static void main(String[] args) {
        System.out.println( "Hello World!" );

        Account a111 = new Account("Sam", "Vivers", 111);
        Account a142 = new Account("Bob", "Rivers", 142);
        Account a843 = new Account("Fred", "Divers", 843);
        Account a964 = new Account("Sue", "Livers", 964);
        
        Service lloyds = new Service();
        
        lloyds.add(a111);
        lloyds.add(a142);
        lloyds.add(a843);
        lloyds.add(a964);
        
        lloyds.retrive(a142);
        
        System.out.println(lloyds.m1);
        
        Gson gson = new Gson();
        String json = gson.toJson(lloyds.m1);
        System.out.println(json);
        
        Map m2 = new HashMap();
        m2 = gson.fromJson(json, HashMap.class);
        System.out.println(m2);
    }
}
