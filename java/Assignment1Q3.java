package com.capg.datastructure;

import java.util.Scanner;

public class Assignment1Q3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the values to calculate simple interest and compound interest");
        System.out.println("Enter the Principal Amount");
        double principal=sc.nextInt();
        System.out.println("Enter the time in years");

        int time=sc.nextInt();

        System.out.println("Enter rate of interest");
        double rateOfInterest=sc.nextInt();

        calculateSimpleInterest(principal,time,rateOfInterest);
        calculateCompoundInterest(principal,time,rateOfInterest);
    }

    public static double calculateSimpleInterest(double principal,int time,double rateOfInterest){
        double simpleInterest = (principal * rateOfInterest * time) /(100);
        System.out.println("Simple interest of amount "+ principal + " is :"+simpleInterest);
        return principal;
    }
    public static double calculateCompoundInterest(double principal,int time,double rateOfInterest)
    {
        double compoundInterest = principal * (Math.pow(1 + (rateOfInterest/100), time) - 1);
        System.out.println("Compound interest of amount "+ principal + " is : "+compoundInterest);
        return  principal;

    }
}
