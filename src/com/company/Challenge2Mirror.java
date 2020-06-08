package com.company;
/*06/03/20*/
public class Challenge2Mirror {

    public static void main(String[] args) {
        Top();
        Pattern1();
        Pattern2();
        Top();

    }
    public static void Top ()  {
        System.out.println("#================#");
    } //this is my method for the top and bottom part of the image
    public static void Pattern1 () {
        System.out.println("|      <><>      |");
        System.out.println("|    <>....<>    |");
        System.out.println("|  <>........<>  |");
        System.out.println("|<>............<>|");
    } // this is my method for the first half of the pattern
    public static void Pattern2 () {
        System.out.println("|<>............<>|");
        System.out.println("|  <>........<>  |");
        System.out.println("|    <>....<>    |");
        System.out.println("|      <><>      |");
    } // this is my method for the second half which is the first half flipped
}
