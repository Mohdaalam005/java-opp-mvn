package com.example.list;

import java.util.ArrayList;
import java.util.List;

public class GenericMain {
    static <X> X addElement(X element) {
        return element;
    }
    static <X extends List> void addList(X list){
        list.addAll(list) ;
    }
    static double sumOfNumber(List<? extends Number> numbers) {
        double sum = 0.0 ;
        for(Number number : numbers){
            sum += number.doubleValue() ;
        }
        return sum ;
    }
    public static void main(String[] args) {
        //
        ArrayList<Integer> list = new ArrayList<Integer>(List.of(1,2,3));
        System.out.println(list);
        System.out.println(sumOfNumber(list));

        addList(list);
        System.out.println(list);

        System.out.println(addElement(54));
        System.out.println(addElement("mohammad"));
        System.out.println(addElement(56l));
        System.out.println(addElement(43d));

    }
}
