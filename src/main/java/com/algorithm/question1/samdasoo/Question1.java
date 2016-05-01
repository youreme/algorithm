package com.algorithm.question1.samdasoo;

import java.util.Stack;

public class Question1 {





    public static void main(String[] args) {

        Stack<String> stack = new Stack<String>();
        String source = "Algorithm are awesome!";
        for (String input : source.split(" ")) {
            stack.push(input);
        }

        while(stack.iterator().hasNext())
            System.out.print(stack.pop() + " ");




    }
}