package com.capg.datastructure;

public class Assignment1Q8 {
    public static void main(String args[])
    {
        int arr[] = { 5,12,14,6,78,19,1,23,26,35,37,7,52,86,47 };
        int n = arr.length;
        bubbleSort(arr);
        System.out.println("Sorted array: ");
        printArray(arr);
    }
    static void bubbleSort(int arr[])
    {
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = i+1; j < arr.length ; j++) {
                if(arr[j]<arr[i]){
                    int temp=arr[j];
                    arr[j]=arr[i];
                    arr[i]=temp;
                }
            }
        }
    }

    public static void printArray(int arr[])
    {
        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");
            System.out.println();
        }

}
