package com.company;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static java.util.stream.Collectors.toList;

public class Main {

    public static void main(String[] args) {
	// write your code here
        ArrayList<Person> persons = new ArrayList<Person>();
        persons.add(new Person("Mick", "Fisher", 10000, true));
        persons.add(new Person("Louise","Derrick", 20000, false));
        persons.add(new Person("Albert","Chung", 1500, true));
        persons.add(new Person("Joshua","Pearson",16000, true));
        persons.add(new Person("Julia","Marshall",3000,true));
        persons.add(new Person("Chris","Lee", 1500, true));
        persons.add(new Person("John","Abbott",16000, true));
        persons.add(new Person("Pete","Green",3000,true));

        //Collections.sort(persons, new Person.InnerSalary());
        //persons.forEach((o)->System.out.println(o));


        List<Person> filterSortedPerson = persons.stream().filter(p -> p.isMarried == true).sorted((Person o1, Person o2) -> {return o2.salary-o1.salary;}).limit(5).collect(toList());
        filterSortedPerson.forEach((o)->System.out.println(o));

        //List<Person> filterSortedPerson = new ArrayList<Person>();

    }

}
