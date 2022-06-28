package com.corejava.lambdaexpression;

import java.util.HashMap;

public class AssignmentQ7 {
    public static void main(String[] args) {
        StringBuilder mix=new StringBuilder();
        HashMap<Integer,String> hashMap=new HashMap<>();
        hashMap.put(1,"nice");
        hashMap.put(2,"done");
        hashMap.put(3,"join");
        hashMap.put(4,"aggregate");

        hashMap.entrySet().forEach(t-> mix.append(t));
        System.out.println(mix);
    }
}
