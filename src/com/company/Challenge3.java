package com.company;
/*06/03/20*/
public class Challenge3 {

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
        System.out.println("+---------+");
    }

    public static void Top1() {
        System.out.println("|    *    |");
        System.out.println("|   /*\\   |");
        System.out.println("|  //*\\\\  |");
        System.out.println("| ///*\\\\\\ |");
    }

    public static void Top2 () {
        System.out.println("| \\\\\\*/// |");
        System.out.println("|  \\\\*//  |");
        System.out.println("|   \\*/   |");
        System.out.println("|    *    |");
    }
}
