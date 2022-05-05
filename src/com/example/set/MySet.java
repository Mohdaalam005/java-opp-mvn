package com.example.set;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class MySet<T> {
    Set<T> set = new HashSet<>();

    TreeSet<T> treeSet = new TreeSet<>() ;

    public void addSet(T element){
        treeSet.add(element);
    }

    public void removeSet(T element){
        treeSet.remove(element);
//        System.out.println();
    }

    @Override
    public String toString() {
        return  treeSet.toString();
    }
}
