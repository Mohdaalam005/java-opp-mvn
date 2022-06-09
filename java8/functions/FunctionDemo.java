package com.java8.functions;

import java.util.function.Function;

public class FunctionDemo {
    public static void main(String[] args) {

        // in function Interface we can pass only one argument
        // and only have apply method
        Function<Integer,Integer> function = num -> num*num ;

        Integer square  = function.apply(6);

        System.out.println(square);

    }
}
