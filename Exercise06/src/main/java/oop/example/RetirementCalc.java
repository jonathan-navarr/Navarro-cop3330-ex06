package oop.example;
import java.util.Scanner;
import java.util.Calendar;
/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Jonathan Navarro
 */
public class RetirementCalc {
    public static void main(String[] args){
        Scanner scnr = new Scanner(System.in);
        System.out.print("What is your current age?");
        int age = scnr.nextInt();
        System.out.print("At what age would you like to retire?");
        int retireage = scnr.nextInt();
        int yearsleft = (retireage-age);
        System.out.println("You have " + (yearsleft) + " years left until you can retire.");
        int year = Calendar.getInstance().get(Calendar.YEAR);
        System.out.println("It's " + year + ", so you can retire in " + (year+yearsleft));
    }
}
