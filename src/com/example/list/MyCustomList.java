package com.example.list;

import java.util.ArrayList;
import java.util.List;

public class MyCustomList<T> {

    List<T> list = new ArrayList<>();

    public void addElement(T element) {
        list.add(element);
//        System.out.println(list);
    }

    public void removeElement(T element) {
        list.remove(element);
//        System.out.println(list);
    }
    public String toString(){
        return  list.toString() ;
    }

    public T get(Integer index) {
        return list.get(index);

    }
}
