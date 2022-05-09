package com.example.list;

public class LinkedList {
    public static void main(String[] args) {
        java.util.LinkedList<Integer> linkedList = new java.util.LinkedList<>();
        linkedList.add(3);
        linkedList.add(4);
        linkedList.add(5);
        linkedList.add(7);
        linkedList.add(6);

        linkedList.addLast(9);
        linkedList.addLast(8);
        linkedList.addLast(10);

        linkedList.addFirst(2);
        linkedList.addFirst(1);

        System.out.println(linkedList);


    }
}