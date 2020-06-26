package com.company;
import java.io.*;
import java.util.*;
public class FileTesting {
    public static void main(String []args) throws FileNotFoundException
    {
        File file = new File("/Users/nuhaomer/IdeaProjects/Summer2020/src/com/company/weather.txt");
        Scanner scan = new Scanner(file);
        //find the difference between two consecutive temps
        double temp1=0;
        double temp2 =0;
        if (scan.hasNextDouble()) {
            temp1 = scan.nextDouble();
        }
        while (scan.hasNextLine()){


                if (scan.hasNextDouble()){
                    temp2 = scan.nextDouble();
                    System.out.printf("The difference between %5.2f  and  %5.2f  is  %7.2f\n",temp1,temp2,(temp2-temp1));
                    temp1 = temp2;
                }
                else {
                    String trash = scan.next();
                }

    }
    }
}
