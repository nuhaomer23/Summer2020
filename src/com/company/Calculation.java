package com.company;

public class Calculation {
    public static void main (String [] args) {
        double dish1= 38;
        double dish2 = 40;
        double dish3 = 30;
        double subtotal = dish1 + dish2 + dish3;
        final double Tax =0.08;
        final double Tip = 0.15;
        double totalprice = subtotal + subtotal* Tax + subtotal* Tip;
        double totaltax = subtotal*Tax;
        double totaltip = subtotal*Tip;


        System.out.println("Subtotal:"+subtotal);
        System.out.println("Tax:"+totaltax);
        System.out.println("Tip:"+totaltip);
        Challenge3.Base();
        System.out.println("Total:"+totalprice);

    }
}
