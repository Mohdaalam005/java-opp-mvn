package com.example.set;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DemoSet {
    public static void main(String[] args) {
        Set<Integer>  set = new HashSet<>();

        set.add(3);
        set.add(2);
        // it removes duplicate element
        set.add(2);
        set.add(1);
        set.add(4);
        set.add(5);
        set.add(7);

        List<Integer> list = new ArrayList<>(set) ;

        System.out.println(list.get(5));
    }
}
