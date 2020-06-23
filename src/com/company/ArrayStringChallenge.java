package com.company;

import java.util.Scanner;

/*
Nuha Omer
Input the scanner so the user can type the string.
define the T valuable with int
Define the string phrase first
Start the do while loop
    print type # of words:
    create an if statement for when T is between 1 and 10
    create a for loop in the do part when T is between 1 and 10 that gives the user
    input and prints the return method.
Then for the while statement when T does not meet those requirements put error

Create the return method for the even and odd index's
Define and evenword string and an oddword string
Find the word length and subtract it by 1
    use for loop for the even word with even = 0, even<= length, even +=2
    Then print it
    Then print a space
Then do the same thing for the odd with a for loop but odd = 1
return the string phrase


 */
public class ArrayStringChallenge {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int T;

        String first;
            System.out.println("Type the number of words in your sentence here: ");
            T = keyboard.nextInt();// This is where the number of words by the user is needed
            while (T < 1 && T > 10) {
            System.out.println("Error (should be between 1 and 10) Try Again!");
            first = keyboard.next();// when it does not fit the constraints
            }
            if (T >= 1 && T <= 10) {

                //String [] outputarray = {" ", " ", " ", " ", " ", " ", " ", " ", " ", " "}
                for (int loop = 1; loop <= T; loop++) {
                    String [] outputarray = new String[loop];
                    String [] output = outputarray;
                    System.out.println("Enter the " + loop + " word: ");// the loop is for the number of the word
                    first = keyboard.next();
                    output = evenandodd(first);// printing the even and odd scrambled word
                    System.out.println();
                }
            }



    }
    public static String evenandodd(String words) {
        char evenletter;
        char oddletter;
        int len = words.length(); // finding the length

        len = len - 1;
        for (int even = 0; even <= len; even += 2) {
            evenletter = words.charAt(even); // use charAt to scramble the even
            System.out.print(evenletter); // printing the even

            System.out.print(" "); // printing the space between the two scrambled parts
            for (int odd = 1; odd <= len; odd += 2) { // the loop that gets the odd index
                oddletter = words.charAt(odd);
                System.out.print(oddletter); // printing the odd letter
                words = evenletter + " " + oddletter;
            }
        }
            return words;
    }

    }

