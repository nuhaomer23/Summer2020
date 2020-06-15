package com.company;
import java.util.Scanner;
public class ClassWorkJune11 {
    public static Scanner Keyboard = new Scanner(System.in);
    public static void main (String [] args) {
        System.out.print ("Type any phrase: ");
        String phrase = Keyboard.nextLine();
        String firstWord = firstword(phrase);
        int len = firstWord.length();
        // phrase = phrase- firstword
    System.out.println(" first word is" + len + " characters long");
        char letter = 0;
        int count = 0;
        for (int index = 0; index< firstWord.length(); index++) {
            letter = firstWord.charAt(index);
            if (letter != ' ') {
                count++;
                String temp = phrase.substring(index + 1);
                len = temp.indexOf(letter);
                while (len >= 0) {
                    count++;
                    temp = temp.substring(len + 1);
                    len = temp.indexOf(letter);
                }
                phrase = phrase.replace(letter,' ');
                firstWord = firstWord.replace(letter,' ');
                System.out.println(letter + " " + count);
                //System.out.println("***"+ tcount + "***");
                count = 0;


            }
        }
        restprog(letter,phrase,count);
    }
    public static int restprog(char letter, String phrase, int count){
        int indexOf2 = phrase.indexOf(" ");
        phrase = phrase.substring(indexOf2, phrase.length());
        System.out.println(phrase);
        return count;
    }
    public static String firstword (String phrase){
        int indexOf = phrase.indexOf(" ");
        String firstword = phrase.substring (0, indexOf+1);
        System.out.print(firstword);
        return firstword;

    }


    }

