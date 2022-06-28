package com.corejava.lambdaexpression;

import java.util.Scanner;
 interface Maths{
    int arithmeticOperations(int a,int b);
}
public class AssignmentQ1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number");
        int num1 = sc.nextInt();
        System.out.println("Enter Second number");
        int num2 = sc.nextInt();

        Maths add=(a,b)-> a+b;
        System.out.println("Addition:"+add.arithmeticOperations(num1,num2));

        Maths sub=(a,b)-> a-b;
        System.out.println("Subtraction:"+sub.arithmeticOperations(num1,num2));

        Maths mul=(a,b)-> a*b;
        System.out.println("Multiplication:"+mul.arithmeticOperations(num1,num2));

        Maths div=(a,b)-> {
            if(b==0) return 0;
            return a/b;
        };
        System.out.println("Division:"+div.arithmeticOperations(num1,num2));

    }
}
