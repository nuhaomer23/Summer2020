package com.company;
/*Nuha Omer
Pseudo Code:
Declare given variable
int i value
double d value
String s value
Create Scanner object to input the numbers
Declare the first variable (give it a name)
Ask user for value using scanner using next integer
Declare the first variable (give it a name)
Ask user for value using scanner using next double
Declare the first variable (give it a name)
Ask user for value using scanner using next string
Input Scanner:
Then do the sum for double and integer and concatenate the string by creating a int double and string variable
Then do system.out.printf and use the % in order of d then f then s and then use the sum variables for the int double and string
 */

import java.util.Scanner;
public class ChallengeDataType {
    public static void main(String [] args){
        int i = 4;
        double d = 4.0;
        String s = "Greenhill ";
        Scanner number = new Scanner(System.in);
        System.out.println("Input an integer: ");
        int newint = number.nextInt();
        System.out.println("Input a double: ");
        double newdouble = number.nextDouble();
        number.nextLine();
        System.out.println("Input a string: ");
        String newstring = number.nextLine();
        int sumall = i + newint;
        double sumdouble = d + newdouble;
        String sumstring = s + newstring;
        System.out.printf(" %1d \n %1.1f \n %s\n ",sumall,sumdouble,sumstring);

    }
}
