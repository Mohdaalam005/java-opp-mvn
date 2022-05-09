package com.example.list;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class DemoLIst {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>( );
        //add
        list.add(6);
        list.add(5);
        list.add(4);
        list.add(2);
        list.add(2);
        list.add(1) ;

        //contain function
        boolean containsAll = list.containsAll(List.of(6,5,4,2,2,1));
        System.out.println("Contain "+ list.contains(1));
        System.out.println(containsAll);


        //remove function using index number
        list.remove(5);

        // remove function using index number
        System.out.println(" remove "+list.remove(3) );

        // finding the index number from the list
        System.out.println("index of " +list.indexOf(2));


        // using a listIterator  with lambda function
        ListIterator<Integer> stringListIterator = list.listIterator() ;

        stringListIterator.forEachRemaining(integer -> {
            System.out.println(integer);
        });


        System.out.println(list);







    }

}
