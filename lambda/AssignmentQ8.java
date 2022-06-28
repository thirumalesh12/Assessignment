package com.corejava.lambdaexpression;

import java.util.ArrayList;

public class AssignmentQ8 {
    public static void main(String[] args) {
        thread execute = new thread();
        System.out.println(Thread.currentThread());
        execute.start();
    }
}
class thread extends Thread{
    public void run(){
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(5);
        numbers.add(85);
        numbers.add(67);
        numbers.add(189);
        numbers.add(54);

        numbers.forEach(t -> System.out.println(t));
    }
}

