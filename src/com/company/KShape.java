package com.company;

public class KShape {
    public static void main(String[] args) {

        char letter = 65;
        for (int line = 6; line > 0; line--) {
            for (int let = 0; let < line; let++) {
                System.out.print((char) (letter + let) + " ");
            }
            System.out.println();
        }
            for (int line2 = 1; line2 < 6; line2++) {
                for (int let = 0; let < line2; let++) {
                    System.out.print((char) (letter + let) + " ");
                }
                System.out.println();
            }
    }
}




