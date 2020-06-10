package com.company;

import java.util.Scanner;

public class Challenge4Gangsta {
    /*Write a program that outputs a person's "gangsta name."
–first initial
–Diddy
–last name (all caps)
–first name
–-izzle
Example Output:
Type your name, playa: Marge Simpson
Your gangsta name is "M. Diddy SIMPSON Marge-izzle" */
    public static void main (String [] args) {
        typename1();
        String Fullname = "Nuha Omer";
        typename(Fullname);
    }
    public static void typename (String fullname) {
        char letter = fullname.charAt(0);
        System.out.print("Your gangsta name is " + letter + ". Diddy ");
        String partial;
        int indexOf = fullname.indexOf("O");
        if (indexOf > 0) {
            partial = fullname.substring(indexOf); // give string from that index to then end
            System.out.print(partial);
            indexOf = fullname.indexOf("N");
            fullname = partial = fullname.substring(0, 4);
            System.out.println(" " + partial + "-izzle");

        }
    }
    public static void typename1 (){
        Scanner keyboard = new Scanner (System.in);
        System.out.print("Type you name, playa: ");
        String fullname = keyboard.nextLine();
        System.out.println("Thank you "+fullname);
    }
}


