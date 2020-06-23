package com.company;
import java.lang.reflect.Array;
import java.util.*;
public class ArrayandThings {
    public static void main(String []args) {
        Random randy = new Random();
        int[] myArray = new int[10];
        for (int index = 0; index < myArray.length; index++) {
            myArray[index] = randy.nextInt(100) + 1;

            System.out.println("the value of my array at " + index + " is " + myArray[index]);

        }
        double[] doubleArray = new double[10];
        for (int index = 0; index < doubleArray.length; index++) {
            doubleArray[index] = randy.nextDouble() * 100;
            System.out.println("the value of my array at " + index + " is " + doubleArray[index]);

        }
        String[] names = {"Maria", "Nuha", "Erica", "Joohan", "Tej"};
        Arrays.sort(names);
        String[] testingarray = new String[10];
        Arrays.fill(testingarray, "a");
        for (int i = 0; i < names.length; i++) {
            if (names[i].contains("r")) ;
            {
                System.out.println(names[i]);
            }
        }
        int[] number = {3, 2, 6, 12, 16, 28, 79, 9, 1};
        int len = number.length;
        System.out.println("The array " + Arrays.toString(number) + "has " + len + " elements");
        // create a random object to feed my new array
        Random rand = new Random();// only to create the object
        int[] num2 = new int[10];
        for (int i = 0; i < num2.length; i++) {
            num2[i] = rand.nextInt(70) + 20;// bound is always the range of the value plus the minimum
        }
        System.out.println(Arrays.toString(num2));
        num2 = reverse(num2);
        System.out.println(Arrays.toString(num2));
    }
    public static int[]reverse(int[]array){
        for(int i = 0; i< array.length/2; i++){//we need only half of the index because we are swapping
            int temp = array[i];
            array[i] = array[array.length -1-i];
            array[array.length -1-i] = temp;
        }

        return array;
    }
}
