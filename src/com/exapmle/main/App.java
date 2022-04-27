package com.exapmle.main;

import com.example.model.Person;

public class App {
    public static void main(String[] args) {
        Person person = new Person();
        person.setFirstName("aalam");
        person.setLastName("idrisi");

        System.out.println(person.getFirstName() + " | " + person.getLastName());
    }
}
