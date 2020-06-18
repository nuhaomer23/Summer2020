package com.company;
/*
Enter a Scanner system
Print the scanner Enter the integer number to see if it's weird!
print string answer for later
then print enter a number to see if its weird with the scanner input
start the dow while loop
use if statement and then use the module for if the number %2 is 1 then print weird
then do an else if statement if the number%2 = 0 then do an if statement if the number is between (inclusive)
of 2 and 5 (print not weird)
then do another else if statement if the number is between 6 and 20 and print weird
then print another else if statement if the number is greater than 20 and print not weird
then make a statement that says if you want to quit?
then type while and answer contain "n"
the print statement Thank you for your number!
 */
import java.util.Scanner;

public class ConditionStatementChallenge {

    public static void main (String [] args) {
        Scanner Weird = new Scanner(System.in);
        String answer;
        System.out.println("Enter the integer number to see if it's weird! ");
        int number = Weird.nextInt();

       do {
           if (number % 2 == 1) {
               System.out.println("Weird");
           } else if (number % 2 == 0) {
               if (number >= 2 && number <= 5) {
                   System.out.println("Not Weird");
               } else if (number >= 6 && number <= 20) {
                   System.out.println("Weird");
               } else if (number > 20) {
                   System.out.println("Not Weird");
               }
           }
           System.out.println("Do you want to quit? ");
           answer = Weird.next();

       }
       while (answer.contains("n"));
        String input = "Thank you for your number!";
        System.out.println(input);
    }
}
