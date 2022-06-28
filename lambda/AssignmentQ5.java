package com.corejava.lambdaexpression;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class AssignmentQ5 {
    List<String> list = Arrays.asList("Yogesh", "vijay", "ajay", "raj", "jay", "pritam");

    public static void main(String[] args) {
        AssignmentQ5 assignment4Q5 = new AssignmentQ5();
        processWords(assignment4Q5.list);
    }

    public static String processWords(List<String> list) {
        StringBuilder words = new StringBuilder();
        Consumer<String> consumer = p -> words.append(p.charAt(0));

        list.stream().forEach(consumer);
        System.out.println(words);
        return words.toString();
    }
}
