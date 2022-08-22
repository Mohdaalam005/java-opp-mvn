package com.example.regex;

import java.util.regex.* ;

public class DemoRegEx {
    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("Aalam mohd ",Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher("Aalam mohd");

        System.out.println(matcher.lookingAt());
    }
}
