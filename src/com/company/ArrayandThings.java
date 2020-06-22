package com.company;
import java.lang.reflect.Array;
import java.util.*;
public class ArrayandThings {
    public static void main(String []args){
        Random randy = new Random();
        int[]myArray = new int [10];
        for (int index = 0; index<myArray.length; index++){
            myArray[index]= randy.nextInt(100)+1;

            System.out.println("the value of my array at "+ index+ " is " + myArray[index]);

        }
        double[]doubleArray = new double [10];
        for (int index = 0; index<doubleArray.length; index++){
            doubleArray[index]= randy.nextDouble()*100;
            System.out.println("the value of my array at "+ index+ " is " + doubleArray[index]);

        }
        String  [] names = {"Maria","Nuha","Erica", "Joohan", "Tej"};
        Arrays.sort(names);
        String [] testingarray = new String [10];
        Arrays.fill(testingarray,"a");
        for (int i=0; i<names.length; i++){
            if (names[i].contains("r"));{
                System.out.println(names[i]);
            }
        }


    }
}
