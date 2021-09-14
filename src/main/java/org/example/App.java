/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Jack Nelson
 */

package org.example;
import java.util.Scanner;
public class App
{
    public static void main( String[] args )
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("What is your height in inches and weight in pounds? ");
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        int bmi = (n2/(n1*n1))*703;
        if(bmi>18.5 && bmi<25)
            System.out.print("You are within the ideal weight range.");
        else if(bmi>25)
            System.out.print("You are overweight. You should see your doctor.");
        else if(bmi<18.5)
            System.out.print("You are underweight. You should see your doctor.");
    }
}
