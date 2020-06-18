package com.company;
import java.util.Scanner;
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

