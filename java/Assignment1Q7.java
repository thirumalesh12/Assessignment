package com.capg.datastructure;

import java.util.Scanner;

public class Assignment1Q7 {
    public static void main(String[] args) {

        Scanner s=new Scanner(System.in);
        System.out.println("Enter the number to search");
        int number=s.nextInt();
        searchNumberInArray(number);
    }

    public static void searchNumberInArray(int number){
        int[] arr={5,12,14,6,78,19,1,23,26,35,37,7,52,86,47};
        int count=0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==number) {
                System.out.println("Your number is present in array at index: " + i);
                count++;
                break;
            }
        }
        if(count==0){
            System.out.println("Your number is not present in an array");
        }
    }
}
