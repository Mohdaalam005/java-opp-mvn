package com.example.list;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class DemoLIst {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>( );
        list.add(6);
        list.add(5);
        list.add(4);
        list.add(2);
        list.add(2);

        System.out.println(list);

        LinkedList<Integer> linkedList = new LinkedList<>( );

        linkedList.add(2);
        linkedList.add(3);
        linkedList.addLast(8); // not adding on a last
        linkedList.add(4);
        linkedList.add(5);
        linkedList.add(7);
        linkedList.add(6);
        linkedList.addFirst(1);
        System.out.println(linkedList);

    }

}
