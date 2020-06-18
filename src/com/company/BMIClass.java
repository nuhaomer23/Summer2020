package com.company;
import java.util.Scanner;
public class BMIClass {
    public static void main(String[] args) {
        double p1height;
        double p1weight;
        Scanner input = new Scanner (System.in);
        System.out.println(" What is person 1's height in inches?");
        p1height = input.nextDouble();
        System.out.println(" What is person 1's weight in pounds?");
        p1weight = input.nextDouble();

        double p1bmi = ((p1weight)/(p1height*p1height))*703;
        String p1weightclass= new String();

        if (p1bmi<18.5){
        p1weightclass = "underweight";
        }
        else if (p1bmi>=18.5 && p1bmi<=24.9){
          p1weightclass = "normal";
        }
        else if (p1bmi>= 25.0&& p1bmi<=29.9){
            p1weightclass = "overweight";
        }
        else if (p1bmi>=30.0){
            p1weightclass = "obese";
        }

        double p2height;
        double p2weight;

        System.out.println(" What is person 2's height in inches?");
        p2height = input.nextDouble();
        System.out.println(" What is person 2's weight in pounds?");
        p2weight = input.nextDouble();

        double p2bmi = ((p2weight)/(p2height*p2height))*703;
        String p2weightclass = new String();

        if (p1bmi<18.5){
            p2weightclass = "underweight";
        }
        else if (p1bmi>=18.5 && p1bmi<=24.9){
            p2weightclass = "normal";
        }
        else if (p1bmi>= 25.0&& p1bmi<=29.9){
            p2weightclass = "overweight";
        }
        else if (p1bmi>=30.0){
            p2weightclass = "obese";
        }
        double pbmidiff = p1bmi - p2bmi;
        System.out.println("Person 1 BMI = " + p1bmi);
        System.out.println(p1weightclass);
        System.out.println("Person 2 BMI = " + p2bmi);
        System.out.println(p2weightclass);
        System.out.println("Difference: "+pbmidiff);



    }
}
