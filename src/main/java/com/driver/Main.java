package com.driver;

public class Main {
    public static void main(String[] args) {
        RWOnly obj = new RWOnly("John");

        // Use setter to set value to name
        obj.setName("Doe");

        // Use getter to print the value of name
        System.out.println(obj.getName()); // This should print "Doe"
    }
  
}