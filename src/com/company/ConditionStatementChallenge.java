package com.company;
/*
Enter a Scanner system
Print the scanner Enter the integer number to see if it's weird!
print string answer for later
create a random variable for the inputted number
then print enter a number to see if its weird with the scanner input
then print this is your number!+number
create a method for the if else statments
use if statement and then use the module for if the number %2 is 1 then print weird
then do an else if statement if the number%2 = 0 then do an if statement if the number is between (inclusive)
of 2 and 5 (print not weird)
then do another else if statement if the number is between 6 and 20 and print weird
then print another else if statement if the number is greater than 20 and print not weird
then make a statement that says if you want to quit?
then type while and answer contain "n"
the print statement Thank you for your number!
 */
import java.util.*;

public class ConditionStatementChallenge {

    public static void main (String [] args) {
        Scanner Weird = new Scanner(System.in);
        Random rando = new Random(); // creating the random scanner

        String answer;
       do {
           System.out.println("Enter the integer number to see if it's weird! ");
           int number = rando.nextInt(137)+1; // the limit between the bounds of the numbers
           System.out.println("This is the inputted number: " + number);
           ifstatements(number); // this is where the random number is input into the program
           System.out.println("Do you want to quit? ");
           answer = Weird.next();

       }
       while (answer.contains("y")); // while statement went into after you say you want to quit
        String input = "Thank you for your number!";
        System.out.println(input);
    }
    public static void ifstatements (int number){
        if (number % 2 == 1) {// if method for the statements
            System.out.println("Weird"); // when it is an odd number
        } else if (number % 2 == 0) {
            if (number >= 2 && number <= 5) {
                System.out.println("Not Weird"); // when its even and between 2 and 5
            } else if (number >= 6 && number <= 20) {
                System.out.println("Weird"); // when the number is between 6 and 20
            } else if (number > 20 && number <=137) {
                System.out.println("Not Weird"); // when number is even and between 20 and 135
            }
        }
    }
}
