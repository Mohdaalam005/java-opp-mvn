package com.login;

public class Swap {
    public static void main(String[] args) {
        //swapping using third variable
        int a  = 10 ;
        int b = 20 ;

        System.out.println(a);
        System.out.println(b);
        System.out.println("--------------");

//        c =  a ;
//        a = b ;
//        b = c ;

//        System.out.println(a);
//        System.out.println(b);

        // without using third variable

        a = a + b ; // 30 = 10 + 20
        b = a - b ; // 10  = 30 - 20
        a = a - b ; //  =  30 - 10
        System.out.println(a);
        System.out.println(b);

        // swapping three variable

        int c = 30 ;

        a = a + b + c ;
        b = a - (b+c) ;
        c = a - (b +c) ;
        a  = a - (b + c) ;

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);




    }
}
