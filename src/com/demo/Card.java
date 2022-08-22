package com.demo;

public class Card {
    public static String firstDigit(long num)
    {
        String type = " " ;
        while(num >= 10)
        {
            num = num / 10;
        }
        if(num==3){
            type = "American Express";
        }
        else if(num==4){
            type = "Visa";
        }
        else if (num==5){
            type = "Master Card";
        }
        else if (num==6){
            type = "Discover" ;
        }
        else
            System.out.println("Invalid Card !!");
        return type;
    }

    public String cardNumber(String number ){
        String type = "" ;
    if(number != null) {
        if (number.startsWith("3")) {
            type = "American Express";

        } else if (number.startsWith("4")) {
            type = "Visa";
        } else if (number.startsWith("5")) {
            type = "MasterCard";
        } else if (number.startsWith("6")) {
            type = "Discover";
        } else {
            System.out.println("Not a  Valid Card !");
        }
    }
        return type ;
    }

    public static void main(String[] args) {

        Card card = new Card();
        System.out.println(card.cardNumber("45678923") );
//        System.out.println(firstDigit(79969583848512l));

        System.out.println(card.cardNumber(null));



    }
}

