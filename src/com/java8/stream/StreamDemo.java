package com.java8.stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Stream;

public class StreamDemo {
    public static void main(String[] args) {

        Stream<Integer> stream = Stream.of(12,32,45,34,23,34);
        Integer integer = stream.min(Comparator.naturalOrder()) .get()  ;
//      stream.forEach(System.out::println);
        System.out.println(integer);

        List<Integer> list = Arrays.asList(12,21,34,56,84,24);
//        List<Integer> number =
        list.stream().filter(integer1 -> integer1 > 23).map(i -> i * 2).forEach(System.out::println) ;
//                .collect(Collectors.toList()) ;
//        System.out.println(number);

        Function<Integer,Double> function = Math :: sqrt;
        Double integer1 = function.apply(16);

        System.out.println(integer1) ;



    }
}
