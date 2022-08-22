package com.example.map;

import java.util.HashMap;
import java.util.Map;

public class DemoMap {

    public static void main(String[] args) {
        Map<Integer,String> map = new HashMap<>();


        // To add
        map.put(1,"Aalam");
        map.put(2,"ashu");
        map.put(3,"irfan");


        // To remove
        map.remove(1);;

        System.out.println(map.entrySet());

    }
}
