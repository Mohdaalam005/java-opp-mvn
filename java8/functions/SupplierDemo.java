package com.java8.functions;

import java.util.function.Supplier;

public class SupplierDemo {
    public static void main(String[] args) {

        // in this interface we have get method
        // return type is String , we cannot use sout in lambda
        Supplier<String> supplier = () -> "hello world" ;

        System.out.println(supplier.get());
    }
}
