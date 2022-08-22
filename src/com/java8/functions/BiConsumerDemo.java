package com.java8.functions;

import java.util.function.BiConsumer;

public class BiConsumerDemo {
    public static void main(String[] args) {
        // in this interface we have accept method which take two parameter
        // the return type is void

        BiConsumer<String ,Integer> biConsumer = (s, integer) -> System.out.println(s + integer) ;

        biConsumer.accept("50",50);
    }
}
