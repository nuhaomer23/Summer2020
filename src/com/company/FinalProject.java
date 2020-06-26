package com.company;
import java.io.*;
import java.util.*;
/*
Import java.io and java.util
Import Scanner for the file (File file = new (name of file))
and for the user input with Scanner input = new Scanner (System.in)
Initialize the variables
String temp1
Int temp2
Double temp3
String answer1
Int Playcount
Int Wincount (Set all of these equal to “”, 0, or 0.0
Call on the Welcome method to start the welcome sign
Create the do-while loop for the 3 games (lottery, words, measurements)
Create a scanner in the do part for the file (Scanner file = new Scanner(file))
Print do you want to play words, the lottery, or measurements?
Ask for user input by calling scanner
Create and if statement for the words (answer.contains (“words))
Print The category is Disney, Marvel, and Star Wars characters. What is your guess?
Use String Guess word so that the user can guess and the code reads the file
Create another if statement (words(guessword,scanfile, temp1) == true
Then you would do Wincount++ for their point
Print The category is integers from 1-100. What will you guess?
Use int GuessInt so that the user can guess and the code reads the file
Create another if statement (words(guessword,scanfile, temp2) == true
Then you would do Wincount++ for their point
Print The category is doubles from 0.0 - 24.0. What will you guess?
Use int GuessDouble t so that the user can guess and the code reads the file
Create another if statement (words(guessword,scanfile, temp3) == true
Then you would do Wincount++ for their point
Create another if statement for input.hasNextLine
Use another Challenge pattern to add decor to the code (+--------+)
Print Do you want to play again? Yes/No
Use answer1 as another input for the user
Use the same Challenge3 Pattern
Use the Playcount++ to print the number of times you played
Close the scanner file
Write the while loop for when the answer contains (y)
Print Your total number of plays was: " + playCount
Print Your total number of wins was: " + winCount
Use the Challenge base pattern
Print Thank you so much for playing! - Erica, Isabel, and Nuha
Methods (Words)
First, create a static boolean line
Create code that scans the file with answers
Write code that sees if the answer is true or false
Add in a keyboard.next() for the user to type in the word
Make an if loop
If the keyboard.next matches with a word that is in the file, then print “correct”
After keyboard.next() has been stated and correct, trash it
If false, print “try again”
Return method

Methods(Lottery)
First, create a static boolean line
Create code that scans the file with answers
Write code that sees if the answer is true or false
Add in a keyboard.next() for the user to type in the integer
Make an if loop
If the keyboard.next matches with a word that is in the file, then print “correct”
After keyboard.next() has been stated and correct, trash it
If false, print “try again”
Return method

Methods(Measurements)
First, create a static boolean line
Create code that scans the file with answers
Write code that sees if the answer is true or false
Add in a keyboard.next() for the user to type in the doubles
Make an if loop
If the keyboard.next matches with a word that is in the file, then print “correct”
After keyboard.next() has been stated and correct, trash it
If false, print “try again”
Return method

 */
public class FinalProject {
    public static void main(String[] args) throws FileNotFoundException{
        // this creates new scanner object
        Scanner input = new Scanner(System.in);
        // this creates new file
        File file = new File ("/Users/nuhaomer/IdeaProjects/Summer2020/src/com/company/FinalProject.txt");
        // this initializes the temp variables
        String temp1 = "";
        int temp2 = 0;
        double temp3 = 0.0;
        // this initializes the variable for the user's answer
        String answer1 = "";
        // this initializes the counts for wins and plays
        int playCount = 0;
        int winCount = 0;
        // this calls the welcome sign method
        welcome();
        // this do while loop asks which they want to play, calls, the method, asks if they wat to play again, and then prints scores
        do {
            // create new scanFile object inside the loop so it resets
            Scanner scanFile = new Scanner(file);
            // asks which category
            System.out.println("Do you want to play words, the lottery, or measurements? ");
            String answer = input.nextLine();
            // if they say words, print this
            if (answer.contains("words")) {
                System.out.print("The category is Disney, Marvel, and Star Wars characters. What is your guess? ");
                String guessWord = input.next();
                // call method, if they get it right, add one to winCount
                if (words(guessWord, scanFile, temp1) == true){
                    winCount++;
                }
            }
            // if they say lottery, print this
            if (answer.contains("lottery")) {
                System.out.print("The category is integers from 1-100. What will you guess? ");
                int guessInt = input.nextInt();
                // call method, if they get it right, add one to winCount
                if (lottery(guessInt, scanFile, temp2) == true){
                    winCount++;
                }
            }
            // if they say measurements, print this
            if (answer.contains("measurements")) {
                System.out.print("The category is doubles from 0.0 - 24.0. What will you guess? ");
                double guessDoub = input.nextDouble();
                // call method, if they get it right, add one to winCount
                if (measurements(guessDoub, scanFile, temp3) == true){
                    winCount++;
                }
            }// if answer has a next line, define it
            if (input.hasNextLine()) {
                answer1 = input.nextLine();
            }
            Challenge3.Base(); // print challenge 3 Base to make pretty
            System.out.print("Do you want to play again? Yes/No ");
            // asks whether or not they want to play again
            answer1 = input.nextLine();
            Challenge3.Base();
            // add one to the playCount (number of times they played)
            playCount++;
            scanFile.close();
            // while answer contains yes, keep going
        } while (answer1.contains("Y") || answer1.contains("y"));
        // prints play count and win count
        System.out.println("Your total number of plays was: " + playCount);
        System.out.println("Your total number of wins was: " + winCount);
        Challenge3.Base();
        // thank you message
        System.out.println("Thank you so much for playing! - Erica, Isabel, and Nuha");
    }
    public static boolean words(String guessWord, Scanner scanFile, String temp1){
        // creates boolean variable
        boolean flag = false;
        // looks for whatever they typed in
        while (scanFile.hasNext() && flag == false) {
            if (scanFile.hasNext()) {
                temp1 = scanFile.next();
                // if it finds it, flag = true and prints it's correct
                // System.out.println("Double is " + temp3);
                if (temp1.equals(guessWord)) {
                    flag = true;
                    System.out.println("That is correct! ");
                }
            } else {
                // else, trash whatever they said for both of the other categories
                if (scanFile.hasNextInt()) {
                    int trash = scanFile.nextInt();
                    // System.out.println("Int is " + trash);
                }
                // if flag is false, print try again
                if (scanFile.hasNextDouble()) {
                    double trash = scanFile.nextDouble();
                    // System.out.println("String is " + trash);
                }
            }
        }
        if (flag == false) {
            System.out.println("Try again! ");
        }
        // return flag (true/false)
        return flag;
    }
    public static boolean lottery(int guessInt, Scanner scanFile,int temp2){
        // creates boolean variable
        boolean flag = false;
        // looks for whatever they typed in
        while (scanFile.hasNext() && flag == false){
            if (scanFile.hasNextInt()) {
                temp2 = scanFile.nextInt();
                // if it finds it, flag = true and prints it's correct
                // System.out.println("Int is" + temp2);
                if (temp2 == guessInt){
                    flag = true;
                    System.out.println("That is correct! ");
                }
            }
            else{
                // else, trash whatever they said for both of the other categories
                if (scanFile.hasNextDouble()){
                    double trash = scanFile.nextDouble();
                    // System.out.println("Double is" + trash);
                }
                if (scanFile.hasNext()){
                    String trash = scanFile.next();
                    // System.out.println("String is " + trash);
                }
            }
        }
        // if flag is false, print try again
        if (flag == false){
            System.out.println("Try again! ");
        }
        // return flag (true/false)
        return flag;
    }
    public static boolean measurements(double guessDoub, Scanner scanFile, double temp3) {
        // creates boolean variable
        boolean flag = false;
        // looks for whatever they typed in
        while (scanFile.hasNext() && flag == false) {
            if (scanFile.hasNextDouble()) {
                temp3 = scanFile.nextDouble();
                // if it finds it, flag = true and prints it's correct
                // System.out.println("Double is " + temp3);
                if (temp3 == guessDoub) {
                    flag = true;
                    System.out.println("That is correct! ");
                }
            } else {
                // else, trash whatever they said for both of the other categories
                if (scanFile.hasNextInt()) {
                    int trash = scanFile.nextInt();
                    // System.out.println("Int is " + trash);
                }
                if (scanFile.hasNext()) {
                    String trash = scanFile.next();
                    // System.out.println("String is " + trash);
                }
            }
        }
        // if flag is false, print try again
        if (flag == false) {
            System.out.println("Try again! ");
        }
        // return flag (true/false)
        return flag;
    }
    public static void welcome(){
        // prints a welcome sign to welcome users
        System.out.println(" +-------------------------+ ");
        System.out.println(" |   Welcome to our game!  | ");
        System.out.println(" |   We hope you enjoy it! | ");
        System.out.println(" |   Erica, Isabel, Nuha   | ");
        System.out.println(" +-------------------------+ ");
    }


}
