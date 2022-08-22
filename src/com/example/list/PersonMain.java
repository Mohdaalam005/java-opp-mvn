package com.example.list;

import java.util.ArrayList;
import java.util.List;

public class PersonMain {


    public static void main(String[] args) {
        List<Person> list = new ArrayList<>();
        Person p1 = new Person(1,"mohammad","Aalam");
        Person p2 = new Person(2,"mohammad","ifran");
        Person p3 = new Person(4,"mohammad","sultan");

        Person p4 = new Person(4,"mohammadd","sultan");

        list.add(p1);
        list.add(p2);
        list.add(p3);
        System.out.println(list.contains(p4));




    }
}
