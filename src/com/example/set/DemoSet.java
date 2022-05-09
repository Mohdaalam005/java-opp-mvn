package com.example.set;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DemoSet {
    public static void main(String[] args) {
        Set<Object> set = new HashSet<>();

        set.add(3);
        set.add(2);
        // it removes duplicate element
        set.add(2);
        set.add(1);
        set.add(4);
        set.add(5);
        set.add(7);
        System.out.println(set.toArray());




    }
}
