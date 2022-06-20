package com.example.inheritance;

public class B  extends  A{
    public void addNUm(int ... a) {
            int sum = 0;
        for (int add : a)
            sum += add ;
        System.out.println(sum);


        }
        public void addNumber(int ... a){
        int sum = 0 ;
        for(int total : a){
            sum += total ;
        }
            System.out.println(sum);
        }




    }


