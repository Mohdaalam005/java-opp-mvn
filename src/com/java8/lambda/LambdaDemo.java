package com.java8.lambda;

interface Add{
    int addition(int num1 , int num2);

}




public class LambdaDemo {
    public static void main(String[] args) {
        Add add = ((num1, num2) -> num1+num2) ;
        System.out.println(add.addition(12,21));

    }
}
