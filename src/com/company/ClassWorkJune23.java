package com.company;
import java.util.*;
/*
Nuha Omer
Import Java util
Create Random
Create array
get random for length of the array
generate x amount of random numbers in the first array
make method for swtiching
 */
public class ClassWorkJune23 {

    public static void main(String []args) {
        Random rand = new Random();
        int randomLength = rand.nextInt(5) + 5;
        int[] numbers = new int[randomLength];

        for (int placeholder=0; placeholder<numbers.length; placeholder++){
            numbers[placeholder]=rand.nextInt(89)+10;
        }

        int firstreplace;
        int secondreplace;
        do{
            firstreplace=rand.nextInt(numbers.length);
            secondreplace = rand.nextInt(numbers.length);

        }
        while(firstreplace==secondreplace);
        System.out.println(firstreplace+" "+ secondreplace);
        System.out.println(Arrays.toString(numbers));
        swap(numbers, firstreplace, secondreplace);
        System.out.println(Arrays.toString(numbers));

    }

    public static int[]swap(int[]numbers, int firstreplace, int secondreplace) {
            int temp = numbers[firstreplace];
            numbers[firstreplace]=numbers[secondreplace];
            numbers[secondreplace]=temp;
            return numbers;
    }
}
