package com.company;
import java.util.*;
public class TestingAndThings {
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        String answer;
        Random randy = new Random();

            double doubly1 = Math.sqrt(902.9323);
            double doubly2 = doubly1 * 3.234234;
            double doubly3 = doubly2 / 2.345345;
            int num1 = 345;
            int num2 = -58;
        do {
            int rand = randy.nextInt(10) +75;
            double doubly4 = Math.random() * 10;
            System.out.printf("My random is %5d \n ", rand);
            System.out.println("Do you want to quit");
            answer = input.next();
        }
        while (answer.contains("n"));
        String whatEver=" Greenhill is awesome";
        System.out.printf("Showing how to use an printf \n $%10.3f \n $%10.3f \n $%10.3f \n -%6d \n -%6d \n %20.21s",doubly1,doubly2, doubly3, num1, num2, whatEver);
    }
}
