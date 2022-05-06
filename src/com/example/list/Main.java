package com.example.list;

import com.example.set.MySet;

import java.util.ArrayList;
import java.util.List;

public class Main {

    static <X> X doSomething(X value) {
        return value;
    }

    static <X extends List> void duplicateList(X value) {
        value.addAll(value);

    }

    static double sumOfNumberList(List<? extends Number> number){
        double sum = 0.0 ;
        for(Number number1 : number){
            sum+=number1.doubleValue() ;
        }
        return sum ;
    }
    static void addValue(List<? super  Number> list){
        list.add(5);
        list.add(6f);
        list.add(7d);

    }

    public static void main(String[] args) {

        ArrayList<Integer> duplicate = new ArrayList<>(List.of(1,2,3,4));
        System.out.println(sumOfNumberList(duplicate) );
        System.out.println(duplicate);
        duplicateList(duplicate);
        System.out.println(duplicate);

        Integer i = doSomething(Integer.valueOf(6));
        Double aDouble = doSomething(Double.valueOf(5d));
        System.out.println(i + aDouble);
        MySet<Integer> set = new MySet<>();
        set.addSet(1);
        set.addSet(5);
        set.removeSet(5);
        System.out.println(set);

        MySet<Double> set1 = new MySet<>();
        set1.addSet(5d);
        System.out.println(set1);


    }
}
