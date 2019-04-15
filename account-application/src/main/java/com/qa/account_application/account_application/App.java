package com.qa.account_application.account_application;

import java.util.HashMap;
import java.util.Map;

public class App 
{
    public static void main(String[] args) {
        System.out.println( "Hello World!" );
 
        Account a = new Account("Sam", "Vivers", 111);
        Account b = new Account("Bob", "Rivers", 142);
        Account c = new Account("Fred", "Divers", 843);
        Account d = new Account("Sue", "Livers", 964);
        
        Service lloyds = new Service();
        
        lloyds.add(a);
        lloyds.add(b);
        lloyds.add(c);
        lloyds.add(d);
        
        lloyds.retrive(c);
    }
}
