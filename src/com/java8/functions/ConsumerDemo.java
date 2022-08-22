package com.java8.functions;

import java.util.function.Consumer;

public class ConsumerDemo {
    public static void main(String[] args) {
        // it takes only one , Type argument
        // the return type is void
        // in this we have accept method

        Consumer<String> consumer = name  -> System.out.println("hello " + name) ;
        consumer.accept("aalam");
    }
}
