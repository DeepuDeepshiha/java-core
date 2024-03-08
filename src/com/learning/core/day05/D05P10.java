package com.learning.core.day05;

import java.util.TreeSet;

public class D05P10 {
    public static void main(String[] args) {
        // Creating Person objects
        Person person1 = new Person(1, "Kerry", 30, 999);
        Person person2 = new Person(2, "Smith", 25, 5999);
        Person person3 = new Person(3, "Popeye", 35,2999);
        Person person4 = new Person(4, "Jones", 22, 6999);
        Person person5 = new Person(5, "John", 28, 1999);
        Person person6 = new Person(6, "Tom", 40, 3999);
        
        
        TreeSet<Person> personSet = new TreeSet<>();
        personSet.add(person1);
        personSet.add(person2);
        personSet.add(person3);
        personSet.add(person4);
        personSet.add(person5);
        personSet.add(person6);
        
        System.out.println("First person whose name starts with 'J':");
        for (Person person : personSet) {
            if (person.getName().startsWith("J")) {
                System.out.println(person.getName() + ": ID - " + person.getId() + ", Age - " + person.getAge() + ", Salary - " + person.getSalary());
                break;
            }
        }
    }
}
