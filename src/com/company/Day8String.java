package com.company;
import java.util.Scanner;
public class Day8String {
    public static void main (String [] args) {
        Scanner keyboard = new Scanner (System.in);
        System.out.print("Type you name, playa: ");
        String fullname = keyboard.nextLine();
        System.out.println(fullname);
        char intial = fullname.charAt(0);
        System.out.print("Give me a number: ");
        int number = keyboard.nextInt();
        System.out.print ("Your number is " + number );
      /*String name= "Nuha";
      sayHi(name);
        Challenge3.Base();
      String teacher = "Maria Suarez is the Teacher in the School";
      sayHi(teacher);
        Challenge3.Base();
      String student = "Ekaum";
      sayHi(student);
        Challenge3.Base();
      String letter= "I";
      sayHi(letter);
        Challenge3.Base();*/
    }
    public static void sayHi (String name){
        System.out.println ("Hi " + name);
        System.out.println ("Hi " + name.toUpperCase());
        int len = name.length();
        System.out.println ("Your name is " + len + " characters long");
        int indexOf = name.indexOf("a");
        System.out.println ("The letter a is at index " + indexOf);
        String partial;
        if(indexOf > 0){
            partial = name.substring(indexOf); // give string from that index to then end
            System.out.println (partial);
        }
        if (name.length()>4) {
            partial = name.substring(1,4);
            System.out.println (partial);
            char letter = name.charAt(4);
            System.out.println("the letter at index 4 is " + letter);
        }
    }
}
