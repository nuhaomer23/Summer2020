package com.company;

import jdk.nashorn.internal.objects.Global;

import java.nio.channels.ClosedByInterruptException;

/*06/04/20
* Version using For loop*/
public class Challenge2Mirror_v2 {
public static final int SIZE = 5;
    public static void main(String[] args) {
        Top();
        Pattern1();
        Pattern2();
        Top();

        }


    public static void Top ()  {
        System.out.print("#");
        //initialize a variable   control the variable   increment the variable by 1
        for(int dash=0; dash < 4* SIZE ; dash++) {
            System.out.print("=");
        }
        System.out.println("#");
    }
        //this is my method for the top and bottom part of the image
    public static void Pattern1 () {

        for (int line = 1; line <= SIZE; line++) {
            System.out.print("|");
            spacesDown(line);
                System.out.print("<>");
                for (int dot = 1; dot <= 4 * line - SIZE+1; dot++) {
                    System.out.print(".");
                }
                System.out.print("<>");
                spacesDown(line);
                    System.out.println("|");
                }
            }
            public static void spacesDown (int line){
                for (int space = 1; space <= -2 * line + 2*SIZE; space++) {
                    System.out.print(" ");
                }
            }
            public static void spacesUp (int line){
                for (int space = 1; space <= 2 * line -2 ; space++) {
                    System.out.print(" ");
                }
            }
    // this is my method for the first half of the pattern
    public static void Pattern2 () {
        for (int line = 1; line <= SIZE; line++) {
            System.out.print("|");
            spacesUp(line);

            System.out.print("<>");
            for (int dot = 1; dot <= -4 * line + 4*SIZE; dot++) {
                System.out.print(".");
            }
            System.out.print("<>");
            spacesUp(line);

            System.out.println("|");
        }
        }
    } // this is my method for the second half which is the first half flipped

