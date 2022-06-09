package com.java8.functions;

import java.util.function.BiFunction;

public class BiFunctionsDemo {
    public static void main(String[] args) {

        //  here we have apply method with 2 parameter
        // and also have return type

        BiFunction<Integer,Integer,Integer>  biFunction = (integer, integer2) -> integer * integer2 ;

        Integer multiply = biFunction.apply(12,12);

        System.out.println(multiply);
    }
}
