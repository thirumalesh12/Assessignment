package com.corejava.lambdaexpression;

import java.util.Scanner;

public class AssignmentQ2 {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        System.out.println("Enter the total price of the order");
        int price=s.nextInt();
        System.out.println("Enter the status of your order: 1} Accepted or Completed 2} Ordered");
        int status= s.nextInt();
        Acceptance determine =(c,v) -> {
            if(c>10000 && v==1){
                System.out.println("Your order of amount "+price+" is accepted and completed");
            }
            else if(c<10000){
                System.out.println("The amount of order is not processable");
            }
            else{
                System.out.println("Your order's status is ambiguous right now");
            }
        };
        determine.decision(price,status);


    }
}
interface Acceptance{
    void decision(int a,int b);
}