package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        // instantiating Singleton class with variable x
        Singleton x = Singleton.getInstance();

        // instantiating Singleton class with variable y
        Singleton y = Singleton.getInstance();

        // instantiating Singleton class with variable z
        Singleton z = Singleton.getInstance();

        // changing variable of instance x // it will affect the variables of objects y and z
        x.str = (x.str).toUpperCase();

        System.out.println("String from x is " + x.str);
        System.out.println("String from y is " + y.str);
        System.out.println("String from z is " + z.str);
        System.out.println("\n");

        // changing variable of instance z // it will affect the variables of objects y and x
        z.str = (z.str).toLowerCase();

        System.out.println("String from x is " + x.str);
        System.out.println("String from y is " + y.str);
        System.out.println("String from z is " + z.str);
    }
}
