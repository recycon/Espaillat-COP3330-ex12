package org.example;
import java.util.Scanner;


/**
 * Enter the principal: 1500
 * Enter the rate of interest: 4.3
 * Enter the number of years: 4
 * After 4 years at 4.3%, the investment will be worth $1758.
 *
 */


/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Mario Espaillat
 */

public class App 
{
    public static void main( String[] args )
    {
        int p;
        double rate;
        int years;
        Scanner in= new Scanner(System.in);
        System.out.println( "Enter the principal: " );
        p=in.nextInt();
        System.out.println( "Enter the rate of interest: " );
        rate=in.nextDouble();
        System.out.println( "Enter the number of years: " );
        years=in.nextInt();
        double x=rate/100;
       double y= x*years;
        double c= p*(1 + y);
        int w=(int) c;

        System.out.println( "After "+years +" years at "+ rate+"%, the investment will be worth $"+w+"." );
    }

    }

