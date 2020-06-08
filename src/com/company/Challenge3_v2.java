package com.company;

import com.sun.javaws.progress.CustomProgress2PreloaderAdapter;

/*06/07/20*/
public class Challenge3_v2 {
public static final int SIZE = 4;
    public static void main(String[] args) {
        Base();
        Top1();
        Top2();
        Base();
        Top2();
        Top1();
        Base();
    }

    public static void Base() {
        System.out.print("+");
        for (int dash = 0; dash <= SIZE*2; dash++) {
            System.out.print("=");
        }
        System.out.println("+");

    }
    public static void Top1() {
        for (int line = 1; line <= SIZE ; line++) {
            System.out.print("|");
            spacesUp(line);
            for (int slashf = 1; slashf <= line - 1; slashf++) {
                System.out.print("/");
            }
            System.out.print("*");
            for (int slashb = 1; slashb <= line - 1; slashb++) {
                System.out.print("\\");
            }
            spacesUp(line);
            System.out.println("|");
        }
    }

    public static void spacesUp(int line) {
        for (int spaces = 1; spaces <= -1 * line + SIZE+1 ; spaces++) {
            System.out.print(" ");

        }
    }
    public static void spacesDown(int line) {
        for (int spaces = 1; spaces <= line; spaces++) {
            System.out.print(" ");
        }
    }
    public static void Top2() {
        for (int line = 1; line <= SIZE; line++) {
            System.out.print("|");
            spacesDown(line);
            for (int slashf = 1; slashf <= -1*line +SIZE ; slashf++) {
                System.out.print("\\");
            }
            System.out.print("*");
            for (int slashb = 1; slashb <= -1* line +SIZE; slashb++) {
                System.out.print("/");
            }
            spacesDown(line);
            System.out.println("|");
        }
    }
}








