package com.example.set;

public class Main {
    public static void main(String[] args) {
        MySet<Integer> set = new MySet<>();
        set.addSet(1);
        set.addSet(5);
        set.removeSet(5);
        System.out.println(set);

    }
}
