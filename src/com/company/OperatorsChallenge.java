package com.company;
import java.util.Scanner;
/*Nuha Omer
First set up the static double solve to set up the
calculations for the tip and the tax and the total cost
calculations with int int for tax and tip and double for total cost but then round
the set up a public static void main to input the scanner system
so that the user can input the money
print What is the meal cost? with nextDouble
print How much do you want to tip? with nextInt
print What is the tax? with nextInt
then in the main call on solve with the calculations to find the total meal cost rounded integers.

 */
public class OperatorsChallenge {
    Scanner input = new Scanner(System.in);
    static double solve(double mealcst, int tip, int tax) {

        double totaltippercent = (mealcst) * (tip / 100.0);
        double totaltaxpercent = (mealcst) * (tax / 100.0);
        double totalcost = mealcst + totaltippercent + totaltaxpercent;
        totalcost = Math.round(totalcost);
        System.out.println("The total cost of your meal is: " + (int) totalcost);
        return totaltippercent;
    }

    public static void main(String[]args) {
        Scanner input = new Scanner(System.in);

        System.out.println(" What is the meal cost?");
        double mealcst = input.nextDouble();
        System.out.println("How much do you want to tip?");
        int tip = input.nextInt();
        System.out.println("What is the tax?");
        int tax = input.nextInt();
        solve(mealcst,tip, tax);
    }

    }

