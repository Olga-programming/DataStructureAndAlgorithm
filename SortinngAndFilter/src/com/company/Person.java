package com.company;

import java.util.Comparator;

public class Person implements Comparable<Person>{
    String firstName;
    String lastName;
    int salary;
    boolean isMarried;

    //constructor
    public Person(String fName, String lName, int sal, boolean isMar){
        this.firstName = fName;
        this.lastName = lName;
        this.salary = sal;
        this.isMarried = isMar;
    }

    @Override
    public String toString() {
        return "First Name : " + this.firstName + ", Family Name : " + this.lastName  + ", Salary : " + this.salary + ", Married : "  + this.isMarried;
    }

    @Override
    public int compareTo(Person o) {
        if (salary > o.salary)
            return 1;
        else if (salary < o.salary)
            return -1;
        else
            return 0;
    }
}
