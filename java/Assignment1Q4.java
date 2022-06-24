package com.capg.datastructure;

import java.util.Scanner;

public class Assignment1Q4 {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the three subject marks");
        System.out.println("First subject marks");
        int marksOfSubject1=scanner.nextInt();

        System.out.println("Second subject marks");
        int marksOfSubject2=scanner.nextInt();

        System.out.println("Third subject marks");
        int marksOfSubject3=scanner.nextInt();

        checkResult(marksOfSubject1,marksOfSubject2,marksOfSubject3);

    }

    public static void checkResult(int marksOfSubject1,int marksOfSubject2,int marksOfSubject3){
        int count=0;

        if(marksOfSubject1>60){
            count++;
        }

        if(marksOfSubject2>60){
            count++;
        }

        if(marksOfSubject3>60){
            count++;
        }

        if(count==3){
            System.out.println("Result : Passed");
        }

        if(count==2){
            System.out.println("Result : Promoted");
        }

        if(count<=1){
            System.out.println("Result : Failed");
        }
    }
}
