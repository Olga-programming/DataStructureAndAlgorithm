package com.company;

public class Singleton {
    private static Singleton theinstance;

    public String str;
    //private constructor
    private Singleton() {
        str = "belongs to a Singleton class";
    }

    //create the instance when it is accessed for the first time
    public static synchronized Singleton getInstance() {
        if(theinstance == null) {
            theinstance = new Singleton();
        }
        return theinstance;
    }
}
